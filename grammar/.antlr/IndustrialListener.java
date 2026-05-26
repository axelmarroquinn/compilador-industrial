// Generated from c:/Users/Usuario/Coding/UMG/SeptimoSemestre/Compiladores/compilador-industrial/grammar/Industrial.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IndustrialParser}.
 */
public interface IndustrialListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(IndustrialParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(IndustrialParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#declaracionMaquina}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionMaquina(IndustrialParser.DeclaracionMaquinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#declaracionMaquina}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionMaquina(IndustrialParser.DeclaracionMaquinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#cuerpoMaquina}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoMaquina(IndustrialParser.CuerpoMaquinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#cuerpoMaquina}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoMaquina(IndustrialParser.CuerpoMaquinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#declaracionVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVar(IndustrialParser.DeclaracionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#declaracionVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVar(IndustrialParser.DeclaracionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(IndustrialParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(IndustrialParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#declaracionProceso}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionProceso(IndustrialParser.DeclaracionProcesoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#declaracionProceso}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionProceso(IndustrialParser.DeclaracionProcesoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(IndustrialParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(IndustrialParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(IndustrialParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(IndustrialParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(IndustrialParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(IndustrialParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#controlMaquina}.
	 * @param ctx the parse tree
	 */
	void enterControlMaquina(IndustrialParser.ControlMaquinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#controlMaquina}.
	 * @param ctx the parse tree
	 */
	void exitControlMaquina(IndustrialParser.ControlMaquinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#sentenciaSi}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaSi(IndustrialParser.SentenciaSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#sentenciaSi}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaSi(IndustrialParser.SentenciaSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#sentenciaMientras}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaMientras(IndustrialParser.SentenciaMientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#sentenciaMientras}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaMientras(IndustrialParser.SentenciaMientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#sentenciaRepetir}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaRepetir(IndustrialParser.SentenciaRepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#sentenciaRepetir}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaRepetir(IndustrialParser.SentenciaRepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#llamadaEscribir}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaEscribir(IndustrialParser.LlamadaEscribirContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#llamadaEscribir}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaEscribir(IndustrialParser.LlamadaEscribirContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#llamadaAlarma}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaAlarma(IndustrialParser.LlamadaAlarmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#llamadaAlarma}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaAlarma(IndustrialParser.LlamadaAlarmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#sentenciaEsperar}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaEsperar(IndustrialParser.SentenciaEsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#sentenciaEsperar}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaEsperar(IndustrialParser.SentenciaEsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(IndustrialParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(IndustrialParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(IndustrialParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(IndustrialParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IndustrialParser#operadorComp}.
	 * @param ctx the parse tree
	 */
	void enterOperadorComp(IndustrialParser.OperadorCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link IndustrialParser#operadorComp}.
	 * @param ctx the parse tree
	 */
	void exitOperadorComp(IndustrialParser.OperadorCompContext ctx);
}