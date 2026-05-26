import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String archivoFuente = args.length > 0 ? args[0] : "examples/valid1.ind";
        String codigo = new String(Files.readAllBytes(Paths.get(archivoFuente)));

        System.out.println("=== COMPILADOR INDUSTRIALSCRIPT ===");
        System.out.println("Archivo: " + archivoFuente);
        System.out.println("===================================\n");

        // ── FASE 1: ANÁLISIS LÉXICO ──────────────────────────────
        CharStream input = CharStreams.fromString(codigo);
        IndustrialLexer lexer = new IndustrialLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ErrorHandler("LÉXICO"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        System.out.println("[ LÉXICO ] Tokens generados: " + tokens.getTokens().size());

        // ── FASE 2: ANÁLISIS SINTÁCTICO ──────────────────────────
        IndustrialParser parser = new IndustrialParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorHandler("SINTÁCTICO"));

        ParseTree tree = parser.programa();
        System.out.println("[ SINTÁCTICO ] Árbol generado correctamente.");
        System.out.println("Árbol (LISP): " + tree.toStringTree(parser));

        // ── FASE 3: ANÁLISIS SEMÁNTICO ────────────────────────────
        System.out.println("\n[ SEMÁNTICO ] Iniciando análisis semántico...");
        SemanticAnalyzer semantico = new SemanticAnalyzer();
        semantico.visit(tree);
        int erroresSem = semantico.getErrorCount();
        if (erroresSem == 0) {
            System.out.println("[ SEMÁNTICO ] Sin errores semánticos.");
        } else {
            System.out.println("[ SEMÁNTICO ] " + erroresSem + " error(es) semántico(s) encontrado(s).");
        }

        // ── FASE 4: GENERACIÓN DE CÓDIGO ─────────────────────────────
        System.out.println();
        if (erroresSem > 0) {
            System.out.println("[ GENERACIÓN ] Abortada por errores semánticos.");
        } else {
            CodeGenerator gen = new CodeGenerator();
            gen.generate(tree, "output");
            System.out.println("[ GENERACIÓN ] Archivos generados en output/");
            System.out.println("  → output/programa.pseudo");
            System.out.println("  → output/programa.3addr");
            System.out.println("  → output/programa.json");
        }

        System.out.println("\n[ INFO ] Fases 1, 2, 3 y 4 completadas.");
    }
}