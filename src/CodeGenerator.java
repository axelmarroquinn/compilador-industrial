import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class CodeGenerator extends IndustrialBaseVisitor<String> {

    private final StringBuilder pseudo = new StringBuilder();
    private final StringBuilder addr   = new StringBuilder();

    private int tempCount  = 0;
    private int labelCount = 0;
    private int indent     = 0;   // pseudocode indent level

    // ─── ENTRY POINT ─────────────────────────────────────────────────────────

    public void generate(ParseTree tree, String outputDir) throws IOException {
        String jsonContent = visit(tree);
        Path dir = Paths.get(outputDir);
        Files.createDirectories(dir);
        Files.writeString(dir.resolve("programa.pseudo"), pseudo.toString());
        Files.writeString(dir.resolve("programa.3addr"),  addr.toString());
        Files.writeString(dir.resolve("programa.json"),   jsonContent + "\n");
    }

    // ─── HELPERS: output ─────────────────────────────────────────────────────

    private String t() { return "t" + tempCount++;  }
    private String L() { return "L" + labelCount++; }

    // pseudocode line (respects indent; empty string emits a blank line)
    private void pp(String s) {
        if (s.isEmpty()) { pseudo.append("\n"); return; }
        pseudo.append("  ".repeat(indent)).append(s).append("\n");
    }

    // 3-addr: raw line (for labels, comments, blank lines)
    private void a(String s)  { addr.append(s).append("\n"); }
    // 3-addr: indented instruction
    private void ai(String s) { addr.append("  ").append(s).append("\n"); }

    // ─── HELPERS: JSON ────────────────────────────────────────────────────────

    // Wraps s in JSON double-quotes, escaping inner backslashes and quotes.
    private String jq(String s) {
        return "\"" + s.replace("\\", "\\\\").replace("\"", "\\\"") + "\"";
    }

    // Strips the surrounding quotes that ANTLR keeps on CADENA tokens.
    private String unquote(String s) {
        if (s.length() >= 2 && s.charAt(0) == '"' && s.charAt(s.length()-1) == '"') {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    // ─── PROGRAMA ─────────────────────────────────────────────────────────────

    @Override
    public String visitPrograma(IndustrialParser.ProgramaContext ctx) {
        pseudo.append("// Pseudocódigo — IndustrialScript Compiler\n\n");
        addr.append("// Código de 3 direcciones — IndustrialScript Compiler\n\n");

        List<String> maqJson = new ArrayList<>();
        for (IndustrialParser.DeclaracionMaquinaContext m : ctx.declaracionMaquina()) {
            maqJson.add(visitDeclaracionMaquina(m));
        }

        return "{\n  \"programa\": {\n    \"maquinas\": [\n"
             + String.join(",\n", maqJson)
             + "\n    ]\n  }\n}";
    }

    // ─── MAQUINA ──────────────────────────────────────────────────────────────

    @Override
    public String visitDeclaracionMaquina(IndustrialParser.DeclaracionMaquinaContext ctx) {
        String nombre = ctx.ID().getText();

        pp("MAQUINA " + nombre + ":");
        indent++;
        a("# === MAQUINA " + nombre + " ===");

        IndustrialParser.CuerpoMaquinaContext cuerpo = ctx.cuerpoMaquina();

        List<String> varsJson = new ArrayList<>();
        for (IndustrialParser.DeclaracionVarContext v : cuerpo.declaracionVar()) {
            varsJson.add(visitDeclaracionVar(v));
        }

        List<String> procJson = new ArrayList<>();
        for (IndustrialParser.DeclaracionProcesoContext p : cuerpo.declaracionProceso()) {
            procJson.add(visitDeclaracionProceso(p));
        }

        indent--;
        pp("");
        a("");

        String varsArr = varsJson.isEmpty() ? ""
            : "\n          " + String.join(",\n          ", varsJson) + "\n        ";
        String procArr = procJson.isEmpty() ? ""
            : "\n" + String.join(",\n", procJson) + "\n        ";

        return "      {\n"
             + "        \"nombre\": " + jq(nombre) + ",\n"
             + "        \"variables\": [" + varsArr + "],\n"
             + "        \"procesos\": [" + procArr + "]\n"
             + "      }";
    }

    // ─── VARIABLE ─────────────────────────────────────────────────────────────

    @Override
    public String visitDeclaracionVar(IndustrialParser.DeclaracionVarContext ctx) {
        String nombre = ctx.ID().getText();
        String tipo   = ctx.tipo().getText();
        pp("VAR " + nombre + ": " + tipo);
        return "{\"nombre\": " + jq(nombre) + ", \"tipo\": " + jq(tipo) + "}";
    }

    // ─── PROCESO ──────────────────────────────────────────────────────────────

    @Override
    public String visitDeclaracionProceso(IndustrialParser.DeclaracionProcesoContext ctx) {
        String nombre = ctx.ID().getText();

        pp("PROCESO " + nombre + ":");
        indent++;
        a("# PROCESO " + nombre);

        List<String> stmtJson = collectSentencias(ctx.sentencias());

        indent--;
        pp("");
        a("# FIN PROCESO " + nombre);
        a("");

        String stmtArr = stmtJson.isEmpty() ? ""
            : "\n              " + String.join(",\n              ", stmtJson) + "\n            ";

        return "          {\n"
             + "            \"nombre\": " + jq(nombre) + ",\n"
             + "            \"sentencias\": [" + stmtArr + "]\n"
             + "          }";
    }

    // ─── ASIGNACION ───────────────────────────────────────────────────────────

    @Override
    public String visitAsignacion(IndustrialParser.AsignacionContext ctx) {
        String nombre = ctx.ID().getText();

        if (ctx.expresion() != null) {
            String exprText = ctx.expresion().getText();
            String exprTemp = emitExpr(ctx.expresion());
            pp(nombre + " = " + exprText);
            ai(nombre + " = " + exprTemp);
            return "{\"tipo\": \"asignacion\", \"variable\": " + jq(nombre)
                 + ", \"valor\": " + jq(exprText) + "}";
        } else {
            // id = leer("sensor");
            String sensor = ctx.CADENA().getText();          // includes quotes
            String plain  = unquote(sensor);
            pp(nombre + " = leer(" + sensor + ")");
            ai(nombre + " = LEER(" + sensor + ")");
            return "{\"tipo\": \"asignacion\", \"variable\": " + jq(nombre)
                 + ", \"valor\": " + jq("leer(\"" + plain + "\")") + "}";
        }
    }

    // ─── CONTROL MAQUINA ──────────────────────────────────────────────────────

    @Override
    public String visitControlMaquina(IndustrialParser.ControlMaquinaContext ctx) {
        String cmd   = ctx.getStart().getText();
        String maqId = ctx.ID().getText();
        pp(cmd.toUpperCase() + " " + maqId);
        ai("CALL " + cmd + ", " + maqId);
        return "{\"tipo\": \"controlMaquina\", \"comando\": " + jq(cmd)
             + ", \"maquina\": " + jq(maqId) + "}";
    }

    // ─── SENTENCIA SI ─────────────────────────────────────────────────────────

    @Override
    public String visitSentenciaSi(IndustrialParser.SentenciaSiContext ctx) {
        String condStr = condToString(ctx.condicion());
        boolean hasSino = ctx.SINO() != null;

        String lThen = L();
        String lElse = hasSino ? L() : null;
        String lEnd  = L();

        emitCond(ctx.condicion(), lThen, hasSino ? lElse : lEnd);
        a("LABEL " + lThen);

        pp("SI " + condStr + " ENTONCES");
        indent++;
        List<String> entoncesJson = collectSentencias(ctx.sentencias(0));
        indent--;

        if (hasSino) {
            ai("GOTO " + lEnd);
            a("LABEL " + lElse);
            pp("SINO");
            indent++;
            List<String> sinoJson = collectSentencias(ctx.sentencias(1));
            indent--;
            pp("FIN");
            a("LABEL " + lEnd);

            return "{\"tipo\": \"si\", \"condicion\": " + jq(condStr)
                 + ", \"entonces\": [" + String.join(", ", entoncesJson) + "]"
                 + ", \"sino\": ["    + String.join(", ", sinoJson)     + "]}";
        } else {
            pp("FIN");
            a("LABEL " + lEnd);
            return "{\"tipo\": \"si\", \"condicion\": " + jq(condStr)
                 + ", \"entonces\": [" + String.join(", ", entoncesJson) + "]}";
        }
    }

    // ─── MIENTRAS ────────────────────────────────────────────────────────────

    @Override
    public String visitSentenciaMientras(IndustrialParser.SentenciaMientrasContext ctx) {
        String condStr = condToString(ctx.condicion());

        String lStart = L();
        String lBody  = L();
        String lEnd   = L();

        pp("MIENTRAS " + condStr + " HACER");
        indent++;

        a("LABEL " + lStart);
        emitCond(ctx.condicion(), lBody, lEnd);
        a("LABEL " + lBody);

        List<String> bodyJson = collectSentencias(ctx.sentencias());

        indent--;
        pp("FIN");
        ai("GOTO " + lStart);
        a("LABEL " + lEnd);

        return "{\"tipo\": \"mientras\", \"condicion\": " + jq(condStr)
             + ", \"cuerpo\": [" + String.join(", ", bodyJson) + "]}";
    }

    // ─── REPETIR ─────────────────────────────────────────────────────────────

    @Override
    public String visitSentenciaRepetir(IndustrialParser.SentenciaRepetirContext ctx) {
        String nText = ctx.expresion().getText();
        String nTemp = emitExpr(ctx.expresion());

        String ctr    = t();
        String lStart = L();
        String lEnd   = L();

        pp("REPETIR " + nText + " VECES");
        indent++;

        ai(ctr + " = 0");
        a("LABEL " + lStart);
        ai("IF " + ctr + " >= " + nTemp + " GOTO " + lEnd);

        List<String> bodyJson = collectSentencias(ctx.sentencias());

        ai(ctr + " = " + ctr + " + 1");
        ai("GOTO " + lStart);
        indent--;
        pp("FIN");
        a("LABEL " + lEnd);

        return "{\"tipo\": \"repetir\", \"veces\": " + jq(nText)
             + ", \"cuerpo\": [" + String.join(", ", bodyJson) + "]}";
    }

    // ─── ESCRIBIR ────────────────────────────────────────────────────────────

    @Override
    public String visitLlamadaEscribir(IndustrialParser.LlamadaEscribirContext ctx) {
        String val = ctx.CADENA() != null
            ? ctx.CADENA().getText()
            : ctx.expresion().getText();
        pp("ESCRIBIR(" + val + ")");
        ai("CALL escribir, " + val);
        return "{\"tipo\": \"escribir\", \"valor\": " + jq(unquote(val)) + "}";
    }

    // ─── ALARMA ──────────────────────────────────────────────────────────────

    @Override
    public String visitLlamadaAlarma(IndustrialParser.LlamadaAlarmaContext ctx) {
        String msg = ctx.CADENA().getText();
        pp("ALARMA(" + msg + ")");
        ai("CALL alarma, " + msg);
        return "{\"tipo\": \"alarma\", \"mensaje\": " + jq(unquote(msg)) + "}";
    }

    // ─── ESPERAR ─────────────────────────────────────────────────────────────

    @Override
    public String visitSentenciaEsperar(IndustrialParser.SentenciaEsperarContext ctx) {
        String tiempo = ctx.expresion().getText();
        pp("ESPERAR " + tiempo + " ms");
        ai("CALL esperar, " + tiempo);
        return "{\"tipo\": \"esperar\", \"tiempo_ms\": " + jq(tiempo) + "}";
    }

    // ─── HELPER: expresiones → 3-addr ────────────────────────────────────────
    // Returns the name of the result: a temp var, an ID, or a literal number.

    private String emitExpr(IndustrialParser.ExpresionContext ctx) {
        if (ctx.ID()     != null) return ctx.ID().getText();
        if (ctx.NUMERO() != null) return ctx.NUMERO().getText();
        if (ctx.expresion().size() == 1) {
            return emitExpr(ctx.expresion(0));   // parenthesized
        }
        // Binary: expr op expr
        String left  = emitExpr(ctx.expresion(0));
        String right = emitExpr(ctx.expresion(1));
        String op    = exprOp(ctx);
        String tmp   = t();
        ai(tmp + " = " + left + " " + op + " " + right);
        return tmp;
    }

    private String exprOp(IndustrialParser.ExpresionContext ctx) {
        if (ctx.MAS()   != null) return "+";
        if (ctx.MENOS() != null) return "-";
        if (ctx.MULT()  != null) return "*";
        if (ctx.DIV()   != null) return "/";
        return "?";
    }

    // ─── HELPER: condiciones ──────────────────────────────────────────────────

    // Produces a human-readable string for the condition (pseudocode / JSON).
    private String condToString(IndustrialParser.CondicionContext ctx) {
        if (ctx.operadorComp() != null) {
            return ctx.expresion(0).getText()
                 + " " + ctx.operadorComp().getText()
                 + " " + ctx.expresion(1).getText();
        }
        if (ctx.NO() != null) {
            return "NO " + condToString(ctx.condicion(0));
        }
        String op = ctx.Y() != null ? " Y " : " O ";
        return condToString(ctx.condicion(0)) + op + condToString(ctx.condicion(1));
    }

    // Emits 3-addr for a condition: jumps to lTrue when cond is true, lFalse otherwise.
    private void emitCond(IndustrialParser.CondicionContext ctx,
                          String lTrue, String lFalse) {
        if (ctx.operadorComp() != null) {
            String left  = emitExpr(ctx.expresion(0));
            String right = emitExpr(ctx.expresion(1));
            String op    = ctx.operadorComp().getText();
            ai("IF " + left + " " + op + " " + right + " GOTO " + lTrue);
            ai("GOTO " + lFalse);
            return;
        }
        if (ctx.NO() != null) {
            emitCond(ctx.condicion(0), lFalse, lTrue);   // invert branches
            return;
        }
        // Y (AND): both must be true — short-circuit
        if (ctx.Y() != null) {
            String mid = L();
            emitCond(ctx.condicion(0), mid, lFalse);
            a("LABEL " + mid);
            emitCond(ctx.condicion(1), lTrue, lFalse);
        } else {
            // O (OR): either is enough — short-circuit
            String mid = L();
            emitCond(ctx.condicion(0), lTrue, mid);
            a("LABEL " + mid);
            emitCond(ctx.condicion(1), lTrue, lFalse);
        }
    }

    // ─── HELPER: visit a list of sentencias ──────────────────────────────────

    private List<String> collectSentencias(IndustrialParser.SentenciasContext ctx) {
        List<String> result = new ArrayList<>();
        for (IndustrialParser.SentenciaContext s : ctx.sentencia()) {
            String json = visit(s);
            if (json != null && !json.isEmpty()) result.add(json);
        }
        return result;
    }
}
