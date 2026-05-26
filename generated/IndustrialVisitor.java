// Generated from grammar/Industrial.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IndustrialParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IndustrialVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(IndustrialParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#declaracionMaquina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionMaquina(IndustrialParser.DeclaracionMaquinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#cuerpoMaquina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoMaquina(IndustrialParser.CuerpoMaquinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#declaracionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVar(IndustrialParser.DeclaracionVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(IndustrialParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#declaracionProceso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionProceso(IndustrialParser.DeclaracionProcesoContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(IndustrialParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(IndustrialParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(IndustrialParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#controlMaquina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlMaquina(IndustrialParser.ControlMaquinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#sentenciaSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaSi(IndustrialParser.SentenciaSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#sentenciaMientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaMientras(IndustrialParser.SentenciaMientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#sentenciaRepetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaRepetir(IndustrialParser.SentenciaRepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#llamadaEscribir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaEscribir(IndustrialParser.LlamadaEscribirContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#llamadaAlarma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaAlarma(IndustrialParser.LlamadaAlarmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#sentenciaEsperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaEsperar(IndustrialParser.SentenciaEsperarContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(IndustrialParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(IndustrialParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IndustrialParser#operadorComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorComp(IndustrialParser.OperadorCompContext ctx);
}