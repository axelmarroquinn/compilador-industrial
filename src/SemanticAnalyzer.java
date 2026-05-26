import org.antlr.v4.runtime.Token;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SemanticAnalyzer extends IndustrialBaseVisitor<Void> {

    // Nombres de todas las maquinas declaradas en el programa (para validar controlMaquina)
    private final Set<String> maquinasDeclaradas = new LinkedHashSet<>();

    // Tabla de simbolos de la maquina que se esta analizando: nombre -> tipo
    private Map<String, String> tablaSimbolos = new HashMap<>();

    // Nombre de la maquina en scope actual (null fuera de cualquier maquina)
    private String maquinaActual = null;

    private int errores = 0;

    // ─── UTILIDAD ─────────────────────────────────────────────────────────────

    private void error(int linea, int col, String msg) {
        errores++;
        System.err.println(String.format("[ ERROR SEMÁNTICO ] Línea %d:%d → %s", linea, col, msg));
    }

    public int getErrorCount() {
        return errores;
    }

    // ─── PASS-1: recolectar nombres de maquinas antes de analizar cuerpos ─────

    @Override
    public Void visitPrograma(IndustrialParser.ProgramaContext ctx) {
        for (IndustrialParser.DeclaracionMaquinaContext maq : ctx.declaracionMaquina()) {
            maquinasDeclaradas.add(maq.ID().getText());
        }
        return visitChildren(ctx);
    }

    // ─── SCOPE DE MAQUINA ─────────────────────────────────────────────────────

    @Override
    public Void visitDeclaracionMaquina(IndustrialParser.DeclaracionMaquinaContext ctx) {
        maquinaActual = ctx.ID().getText();
        tablaSimbolos = new HashMap<>();
        visitChildren(ctx);
        maquinaActual = null;
        return null;
    }

    // ─── DECLARACION DE VARIABLE ──────────────────────────────────────────────
    // Valida: variable declarada dos veces en la misma maquina

    @Override
    public Void visitDeclaracionVar(IndustrialParser.DeclaracionVarContext ctx) {
        String nombre = ctx.ID().getText();
        Token tok    = ctx.ID().getSymbol();

        if (tablaSimbolos.containsKey(nombre)) {
            error(tok.getLine(), tok.getCharPositionInLine(),
                "Variable '" + nombre + "' ya declarada en máquina '" + maquinaActual + "'");
        } else {
            tablaSimbolos.put(nombre, ctx.tipo().getText());
        }
        return null;
    }

    // ─── ASIGNACION ───────────────────────────────────────────────────────────
    // Valida: variable destino (LHS) no declarada

    @Override
    public Void visitAsignacion(IndustrialParser.AsignacionContext ctx) {
        Token tok    = ctx.ID().getSymbol();
        String nombre = ctx.ID().getText();

        if (!tablaSimbolos.containsKey(nombre)) {
            error(tok.getLine(), tok.getCharPositionInLine(),
                "Variable '" + nombre + "' no declarada en máquina '" + maquinaActual + "'");
        }
        // Visita la expresion RHS si existe (forma: id = expr;)
        // La forma id = leer(...) no tiene nodo expresion hijo
        if (ctx.expresion() != null) {
            visit(ctx.expresion());
        }
        return null;
    }

    // ─── CONTROL DE MAQUINA ───────────────────────────────────────────────────
    // Valida: la maquina referenciada fue declarada en el programa

    @Override
    public Void visitControlMaquina(IndustrialParser.ControlMaquinaContext ctx) {
        Token tok    = ctx.ID().getSymbol();
        String nombre = ctx.ID().getText();

        if (!maquinasDeclaradas.contains(nombre)) {
            error(tok.getLine(), tok.getCharPositionInLine(),
                "Máquina '" + nombre + "' no declarada");
        }
        return null;
    }

    // ─── EXPRESION ────────────────────────────────────────────────────────────
    // Valida: todo ID usado en una expresion debe estar declarado

    @Override
    public Void visitExpresion(IndustrialParser.ExpresionContext ctx) {
        if (ctx.ID() != null) {
            Token tok    = ctx.ID().getSymbol();
            String nombre = ctx.ID().getText();
            if (maquinaActual != null && !tablaSimbolos.containsKey(nombre)) {
                error(tok.getLine(), tok.getCharPositionInLine(),
                    "Variable '" + nombre + "' no declarada en máquina '" + maquinaActual + "'");
            }
        }
        // Propaga la visita a sub-expresiones (binarias, agrupadas, etc.)
        return visitChildren(ctx);
    }
}
