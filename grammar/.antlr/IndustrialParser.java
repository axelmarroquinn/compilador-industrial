// Generated from c:/Users/Usuario/Coding/UMG/SeptimoSemestre/Compiladores/compilador-industrial/grammar/Industrial.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IndustrialParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAQUINA=1, SENSOR=2, PROCESO=3, ALARMA=4, INICIAR=5, DETENER=6, PAUSAR=7, 
		REINICIAR=8, SI=9, ENTONCES=10, SINO=11, FIN=12, MIENTRAS=13, HACER=14, 
		REPETIR=15, VECES=16, LEER=17, ESCRIBIR=18, ESPERAR=19, MS=20, VAR=21, 
		NUM=22, TEXTO=23, BOOL=24, VERDADERO=25, FALSO=26, Y=27, O=28, NO=29, 
		MAYOR_IGUAL=30, MENOR_IGUAL=31, IGUAL_IGUAL=32, DIFERENTE=33, MAYOR=34, 
		MENOR=35, IGUAL=36, MAS=37, MENOS=38, MULT=39, DIV=40, LLAVE_AB=41, LLAVE_CE=42, 
		PAREN_AB=43, PAREN_CE=44, PUNTO_COMA=45, NUMERO=46, CADENA=47, ID=48, 
		WS=49, COMENTARIO=50;
	public static final int
		RULE_programa = 0, RULE_declaracionMaquina = 1, RULE_cuerpoMaquina = 2, 
		RULE_declaracionVar = 3, RULE_tipo = 4, RULE_declaracionProceso = 5, RULE_sentencias = 6, 
		RULE_sentencia = 7, RULE_asignacion = 8, RULE_controlMaquina = 9, RULE_sentenciaSi = 10, 
		RULE_sentenciaMientras = 11, RULE_sentenciaRepetir = 12, RULE_llamadaEscribir = 13, 
		RULE_llamadaAlarma = 14, RULE_sentenciaEsperar = 15, RULE_expresion = 16, 
		RULE_condicion = 17, RULE_operadorComp = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracionMaquina", "cuerpoMaquina", "declaracionVar", 
			"tipo", "declaracionProceso", "sentencias", "sentencia", "asignacion", 
			"controlMaquina", "sentenciaSi", "sentenciaMientras", "sentenciaRepetir", 
			"llamadaEscribir", "llamadaAlarma", "sentenciaEsperar", "expresion", 
			"condicion", "operadorComp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'maquina'", "'sensor'", "'proceso'", "'alarma'", "'iniciar'", 
			"'detener'", "'pausar'", "'reiniciar'", "'si'", "'entonces'", "'sino'", 
			"'fin'", "'mientras'", "'hacer'", "'repetir'", "'veces'", "'leer'", "'escribir'", 
			"'esperar'", "'ms'", "'var'", "'num'", "'texto'", "'bool'", "'verdadero'", 
			"'falso'", "'y'", "'o'", "'no'", "'>='", "'<='", "'=='", "'!='", "'>'", 
			"'<'", "'='", "'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'('", "')'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAQUINA", "SENSOR", "PROCESO", "ALARMA", "INICIAR", "DETENER", 
			"PAUSAR", "REINICIAR", "SI", "ENTONCES", "SINO", "FIN", "MIENTRAS", "HACER", 
			"REPETIR", "VECES", "LEER", "ESCRIBIR", "ESPERAR", "MS", "VAR", "NUM", 
			"TEXTO", "BOOL", "VERDADERO", "FALSO", "Y", "O", "NO", "MAYOR_IGUAL", 
			"MENOR_IGUAL", "IGUAL_IGUAL", "DIFERENTE", "MAYOR", "MENOR", "IGUAL", 
			"MAS", "MENOS", "MULT", "DIV", "LLAVE_AB", "LLAVE_CE", "PAREN_AB", "PAREN_CE", 
			"PUNTO_COMA", "NUMERO", "CADENA", "ID", "WS", "COMENTARIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Industrial.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IndustrialParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IndustrialParser.EOF, 0); }
		public List<DeclaracionMaquinaContext> declaracionMaquina() {
			return getRuleContexts(DeclaracionMaquinaContext.class);
		}
		public DeclaracionMaquinaContext declaracionMaquina(int i) {
			return getRuleContext(DeclaracionMaquinaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				declaracionMaquina();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MAQUINA );
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionMaquinaContext extends ParserRuleContext {
		public TerminalNode MAQUINA() { return getToken(IndustrialParser.MAQUINA, 0); }
		public TerminalNode ID() { return getToken(IndustrialParser.ID, 0); }
		public TerminalNode LLAVE_AB() { return getToken(IndustrialParser.LLAVE_AB, 0); }
		public CuerpoMaquinaContext cuerpoMaquina() {
			return getRuleContext(CuerpoMaquinaContext.class,0);
		}
		public TerminalNode LLAVE_CE() { return getToken(IndustrialParser.LLAVE_CE, 0); }
		public DeclaracionMaquinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionMaquina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterDeclaracionMaquina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitDeclaracionMaquina(this);
		}
	}

	public final DeclaracionMaquinaContext declaracionMaquina() throws RecognitionException {
		DeclaracionMaquinaContext _localctx = new DeclaracionMaquinaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracionMaquina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(MAQUINA);
			setState(46);
			match(ID);
			setState(47);
			match(LLAVE_AB);
			setState(48);
			cuerpoMaquina();
			setState(49);
			match(LLAVE_CE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CuerpoMaquinaContext extends ParserRuleContext {
		public List<DeclaracionVarContext> declaracionVar() {
			return getRuleContexts(DeclaracionVarContext.class);
		}
		public DeclaracionVarContext declaracionVar(int i) {
			return getRuleContext(DeclaracionVarContext.class,i);
		}
		public List<DeclaracionProcesoContext> declaracionProceso() {
			return getRuleContexts(DeclaracionProcesoContext.class);
		}
		public DeclaracionProcesoContext declaracionProceso(int i) {
			return getRuleContext(DeclaracionProcesoContext.class,i);
		}
		public CuerpoMaquinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoMaquina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterCuerpoMaquina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitCuerpoMaquina(this);
		}
	}

	public final CuerpoMaquinaContext cuerpoMaquina() throws RecognitionException {
		CuerpoMaquinaContext _localctx = new CuerpoMaquinaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cuerpoMaquina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCESO || _la==VAR) {
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(51);
					declaracionVar();
					}
					break;
				case PROCESO:
					{
					setState(52);
					declaracionProceso();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(IndustrialParser.VAR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(IndustrialParser.ID, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(IndustrialParser.PUNTO_COMA, 0); }
		public DeclaracionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterDeclaracionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitDeclaracionVar(this);
		}
	}

	public final DeclaracionVarContext declaracionVar() throws RecognitionException {
		DeclaracionVarContext _localctx = new DeclaracionVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracionVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(VAR);
			setState(59);
			tipo();
			setState(60);
			match(ID);
			setState(61);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(IndustrialParser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(IndustrialParser.TEXTO, 0); }
		public TerminalNode BOOL() { return getToken(IndustrialParser.BOOL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionProcesoContext extends ParserRuleContext {
		public TerminalNode PROCESO() { return getToken(IndustrialParser.PROCESO, 0); }
		public TerminalNode ID() { return getToken(IndustrialParser.ID, 0); }
		public TerminalNode LLAVE_AB() { return getToken(IndustrialParser.LLAVE_AB, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode LLAVE_CE() { return getToken(IndustrialParser.LLAVE_CE, 0); }
		public DeclaracionProcesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionProceso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterDeclaracionProceso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitDeclaracionProceso(this);
		}
	}

	public final DeclaracionProcesoContext declaracionProceso() throws RecognitionException {
		DeclaracionProcesoContext _localctx = new DeclaracionProcesoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracionProceso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(PROCESO);
			setState(66);
			match(ID);
			setState(67);
			match(LLAVE_AB);
			setState(68);
			sentencias();
			setState(69);
			match(LLAVE_CE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciasContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitSentencias(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474977539056L) != 0)) {
				{
				{
				setState(71);
				sentencia();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ControlMaquinaContext controlMaquina() {
			return getRuleContext(ControlMaquinaContext.class,0);
		}
		public SentenciaSiContext sentenciaSi() {
			return getRuleContext(SentenciaSiContext.class,0);
		}
		public SentenciaMientrasContext sentenciaMientras() {
			return getRuleContext(SentenciaMientrasContext.class,0);
		}
		public SentenciaRepetirContext sentenciaRepetir() {
			return getRuleContext(SentenciaRepetirContext.class,0);
		}
		public LlamadaEscribirContext llamadaEscribir() {
			return getRuleContext(LlamadaEscribirContext.class,0);
		}
		public LlamadaAlarmaContext llamadaAlarma() {
			return getRuleContext(LlamadaAlarmaContext.class,0);
		}
		public SentenciaEsperarContext sentenciaEsperar() {
			return getRuleContext(SentenciaEsperarContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				asignacion();
				}
				break;
			case INICIAR:
			case DETENER:
			case PAUSAR:
			case REINICIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				controlMaquina();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				sentenciaSi();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				sentenciaMientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				sentenciaRepetir();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				llamadaEscribir();
				}
				break;
			case ALARMA:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				llamadaAlarma();
				}
				break;
			case ESPERAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				sentenciaEsperar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IndustrialParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(IndustrialParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(IndustrialParser.PUNTO_COMA, 0); }
		public TerminalNode LEER() { return getToken(IndustrialParser.LEER, 0); }
		public TerminalNode PAREN_AB() { return getToken(IndustrialParser.PAREN_AB, 0); }
		public TerminalNode CADENA() { return getToken(IndustrialParser.CADENA, 0); }
		public TerminalNode PAREN_CE() { return getToken(IndustrialParser.PAREN_CE, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(ID);
				setState(88);
				match(IGUAL);
				setState(89);
				expresion(0);
				setState(90);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ID);
				setState(93);
				match(IGUAL);
				setState(94);
				match(LEER);
				setState(95);
				match(PAREN_AB);
				setState(96);
				match(CADENA);
				setState(97);
				match(PAREN_CE);
				setState(98);
				match(PUNTO_COMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ControlMaquinaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IndustrialParser.ID, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(IndustrialParser.PUNTO_COMA, 0); }
		public TerminalNode INICIAR() { return getToken(IndustrialParser.INICIAR, 0); }
		public TerminalNode DETENER() { return getToken(IndustrialParser.DETENER, 0); }
		public TerminalNode PAUSAR() { return getToken(IndustrialParser.PAUSAR, 0); }
		public TerminalNode REINICIAR() { return getToken(IndustrialParser.REINICIAR, 0); }
		public ControlMaquinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlMaquina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterControlMaquina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitControlMaquina(this);
		}
	}

	public final ControlMaquinaContext controlMaquina() throws RecognitionException {
		ControlMaquinaContext _localctx = new ControlMaquinaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_controlMaquina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(ID);
			setState(103);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaSiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(IndustrialParser.SI, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(IndustrialParser.ENTONCES, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode FIN() { return getToken(IndustrialParser.FIN, 0); }
		public TerminalNode SINO() { return getToken(IndustrialParser.SINO, 0); }
		public SentenciaSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterSentenciaSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitSentenciaSi(this);
		}
	}

	public final SentenciaSiContext sentenciaSi() throws RecognitionException {
		SentenciaSiContext _localctx = new SentenciaSiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentenciaSi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(SI);
			setState(106);
			condicion(0);
			setState(107);
			match(ENTONCES);
			setState(108);
			sentencias();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(109);
				match(SINO);
				setState(110);
				sentencias();
				}
			}

			setState(113);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaMientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(IndustrialParser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(IndustrialParser.HACER, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode FIN() { return getToken(IndustrialParser.FIN, 0); }
		public SentenciaMientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaMientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterSentenciaMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitSentenciaMientras(this);
		}
	}

	public final SentenciaMientrasContext sentenciaMientras() throws RecognitionException {
		SentenciaMientrasContext _localctx = new SentenciaMientrasContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentenciaMientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(MIENTRAS);
			setState(116);
			condicion(0);
			setState(117);
			match(HACER);
			setState(118);
			sentencias();
			setState(119);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaRepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(IndustrialParser.REPETIR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode VECES() { return getToken(IndustrialParser.VECES, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode FIN() { return getToken(IndustrialParser.FIN, 0); }
		public SentenciaRepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaRepetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterSentenciaRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitSentenciaRepetir(this);
		}
	}

	public final SentenciaRepetirContext sentenciaRepetir() throws RecognitionException {
		SentenciaRepetirContext _localctx = new SentenciaRepetirContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentenciaRepetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(REPETIR);
			setState(122);
			expresion(0);
			setState(123);
			match(VECES);
			setState(124);
			sentencias();
			setState(125);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaEscribirContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(IndustrialParser.ESCRIBIR, 0); }
		public TerminalNode PAREN_AB() { return getToken(IndustrialParser.PAREN_AB, 0); }
		public TerminalNode PAREN_CE() { return getToken(IndustrialParser.PAREN_CE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(IndustrialParser.PUNTO_COMA, 0); }
		public TerminalNode CADENA() { return getToken(IndustrialParser.CADENA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public LlamadaEscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaEscribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterLlamadaEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitLlamadaEscribir(this);
		}
	}

	public final LlamadaEscribirContext llamadaEscribir() throws RecognitionException {
		LlamadaEscribirContext _localctx = new LlamadaEscribirContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_llamadaEscribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ESCRIBIR);
			setState(128);
			match(PAREN_AB);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA:
				{
				setState(129);
				match(CADENA);
				}
				break;
			case PAREN_AB:
			case NUMERO:
			case ID:
				{
				setState(130);
				expresion(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			match(PAREN_CE);
			setState(134);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaAlarmaContext extends ParserRuleContext {
		public TerminalNode ALARMA() { return getToken(IndustrialParser.ALARMA, 0); }
		public TerminalNode PAREN_AB() { return getToken(IndustrialParser.PAREN_AB, 0); }
		public TerminalNode CADENA() { return getToken(IndustrialParser.CADENA, 0); }
		public TerminalNode PAREN_CE() { return getToken(IndustrialParser.PAREN_CE, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(IndustrialParser.PUNTO_COMA, 0); }
		public LlamadaAlarmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaAlarma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterLlamadaAlarma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitLlamadaAlarma(this);
		}
	}

	public final LlamadaAlarmaContext llamadaAlarma() throws RecognitionException {
		LlamadaAlarmaContext _localctx = new LlamadaAlarmaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_llamadaAlarma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ALARMA);
			setState(137);
			match(PAREN_AB);
			setState(138);
			match(CADENA);
			setState(139);
			match(PAREN_CE);
			setState(140);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaEsperarContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(IndustrialParser.ESPERAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode MS() { return getToken(IndustrialParser.MS, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(IndustrialParser.PUNTO_COMA, 0); }
		public SentenciaEsperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaEsperar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterSentenciaEsperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitSentenciaEsperar(this);
		}
	}

	public final SentenciaEsperarContext sentenciaEsperar() throws RecognitionException {
		SentenciaEsperarContext _localctx = new SentenciaEsperarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sentenciaEsperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ESPERAR);
			setState(143);
			expresion(0);
			setState(144);
			match(MS);
			setState(145);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode PAREN_AB() { return getToken(IndustrialParser.PAREN_AB, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PAREN_CE() { return getToken(IndustrialParser.PAREN_CE, 0); }
		public TerminalNode NUMERO() { return getToken(IndustrialParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(IndustrialParser.ID, 0); }
		public TerminalNode MAS() { return getToken(IndustrialParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(IndustrialParser.MENOS, 0); }
		public TerminalNode MULT() { return getToken(IndustrialParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(IndustrialParser.DIV, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_AB:
				{
				setState(148);
				match(PAREN_AB);
				setState(149);
				expresion(0);
				setState(150);
				match(PAREN_CE);
				}
				break;
			case NUMERO:
				{
				setState(152);
				match(NUMERO);
				}
				break;
			case ID:
				{
				setState(153);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(156);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(157);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(158);
					expresion(5);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperadorCompContext operadorComp() {
			return getRuleContext(OperadorCompContext.class,0);
		}
		public TerminalNode NO() { return getToken(IndustrialParser.NO, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode Y() { return getToken(IndustrialParser.Y, 0); }
		public TerminalNode O() { return getToken(IndustrialParser.O, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREN_AB:
			case NUMERO:
			case ID:
				{
				setState(165);
				expresion(0);
				setState(166);
				operadorComp();
				setState(167);
				expresion(0);
				}
				break;
			case NO:
				{
				setState(169);
				match(NO);
				setState(170);
				condicion(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondicionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condicion);
					setState(173);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(174);
					_la = _input.LA(1);
					if ( !(_la==Y || _la==O) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(175);
					condicion(3);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorCompContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(IndustrialParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(IndustrialParser.MENOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(IndustrialParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(IndustrialParser.MENOR_IGUAL, 0); }
		public TerminalNode IGUAL_IGUAL() { return getToken(IndustrialParser.IGUAL_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(IndustrialParser.DIFERENTE, 0); }
		public OperadorCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).enterOperadorComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IndustrialListener ) ((IndustrialListener)listener).exitOperadorComp(this);
		}
	}

	public final OperadorCompContext operadorComp() throws RecognitionException {
		OperadorCompContext _localctx = new OperadorCompContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operadorComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		case 17:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u00b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u00029\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0005\u0006I\b\u0006\n\u0006\f\u0006L\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007V\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bd\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\np\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0084\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u009b\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00a0\b\u0010\n\u0010\f\u0010\u00a3"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00ac\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00b1\b\u0011\n\u0011\f\u0011\u00b4\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0000\u0002 \"\u0013\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000"+
		"\u0005\u0001\u0000\u0016\u0018\u0001\u0000\u0005\b\u0001\u0000%(\u0001"+
		"\u0000\u001b\u001c\u0001\u0000\u001e#\u00b7\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0002-\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006"+
		":\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000"+
		"\u0000\fJ\u0001\u0000\u0000\u0000\u000eU\u0001\u0000\u0000\u0000\u0010"+
		"c\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014i\u0001"+
		"\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018y\u0001\u0000\u0000"+
		"\u0000\u001a\u007f\u0001\u0000\u0000\u0000\u001c\u0088\u0001\u0000\u0000"+
		"\u0000\u001e\u008e\u0001\u0000\u0000\u0000 \u009a\u0001\u0000\u0000\u0000"+
		"\"\u00ab\u0001\u0000\u0000\u0000$\u00b5\u0001\u0000\u0000\u0000&(\u0003"+
		"\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0001\u0000\u0000./\u00050\u0000\u0000/0\u0005)\u0000\u000001\u0003\u0004"+
		"\u0002\u000012\u0005*\u0000\u00002\u0003\u0001\u0000\u0000\u000036\u0003"+
		"\u0006\u0003\u000046\u0003\n\u0005\u000053\u0001\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008\u0005\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0015\u0000\u0000;<\u0003\b\u0004\u0000<=\u00050"+
		"\u0000\u0000=>\u0005-\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0007"+
		"\u0000\u0000\u0000@\t\u0001\u0000\u0000\u0000AB\u0005\u0003\u0000\u0000"+
		"BC\u00050\u0000\u0000CD\u0005)\u0000\u0000DE\u0003\f\u0006\u0000EF\u0005"+
		"*\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GI\u0003\u000e\u0007\u0000"+
		"HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\r\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000MV\u0003\u0010\b\u0000NV\u0003\u0012\t\u0000OV\u0003\u0014"+
		"\n\u0000PV\u0003\u0016\u000b\u0000QV\u0003\u0018\f\u0000RV\u0003\u001a"+
		"\r\u0000SV\u0003\u001c\u000e\u0000TV\u0003\u001e\u000f\u0000UM\u0001\u0000"+
		"\u0000\u0000UN\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000UP\u0001"+
		"\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u000f\u0001\u0000"+
		"\u0000\u0000WX\u00050\u0000\u0000XY\u0005$\u0000\u0000YZ\u0003 \u0010"+
		"\u0000Z[\u0005-\u0000\u0000[d\u0001\u0000\u0000\u0000\\]\u00050\u0000"+
		"\u0000]^\u0005$\u0000\u0000^_\u0005\u0011\u0000\u0000_`\u0005+\u0000\u0000"+
		"`a\u0005/\u0000\u0000ab\u0005,\u0000\u0000bd\u0005-\u0000\u0000cW\u0001"+
		"\u0000\u0000\u0000c\\\u0001\u0000\u0000\u0000d\u0011\u0001\u0000\u0000"+
		"\u0000ef\u0007\u0001\u0000\u0000fg\u00050\u0000\u0000gh\u0005-\u0000\u0000"+
		"h\u0013\u0001\u0000\u0000\u0000ij\u0005\t\u0000\u0000jk\u0003\"\u0011"+
		"\u0000kl\u0005\n\u0000\u0000lo\u0003\f\u0006\u0000mn\u0005\u000b\u0000"+
		"\u0000np\u0003\f\u0006\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0005\f\u0000\u0000r\u0015\u0001\u0000"+
		"\u0000\u0000st\u0005\r\u0000\u0000tu\u0003\"\u0011\u0000uv\u0005\u000e"+
		"\u0000\u0000vw\u0003\f\u0006\u0000wx\u0005\f\u0000\u0000x\u0017\u0001"+
		"\u0000\u0000\u0000yz\u0005\u000f\u0000\u0000z{\u0003 \u0010\u0000{|\u0005"+
		"\u0010\u0000\u0000|}\u0003\f\u0006\u0000}~\u0005\f\u0000\u0000~\u0019"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0012\u0000\u0000\u0080\u0083"+
		"\u0005+\u0000\u0000\u0081\u0084\u0005/\u0000\u0000\u0082\u0084\u0003 "+
		"\u0010\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005,\u0000"+
		"\u0000\u0086\u0087\u0005-\u0000\u0000\u0087\u001b\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\u0004\u0000\u0000\u0089\u008a\u0005+\u0000\u0000\u008a"+
		"\u008b\u0005/\u0000\u0000\u008b\u008c\u0005,\u0000\u0000\u008c\u008d\u0005"+
		"-\u0000\u0000\u008d\u001d\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0013"+
		"\u0000\u0000\u008f\u0090\u0003 \u0010\u0000\u0090\u0091\u0005\u0014\u0000"+
		"\u0000\u0091\u0092\u0005-\u0000\u0000\u0092\u001f\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0006\u0010\uffff\uffff\u0000\u0094\u0095\u0005+\u0000\u0000"+
		"\u0095\u0096\u0003 \u0010\u0000\u0096\u0097\u0005,\u0000\u0000\u0097\u009b"+
		"\u0001\u0000\u0000\u0000\u0098\u009b\u0005.\u0000\u0000\u0099\u009b\u0005"+
		"0\u0000\u0000\u009a\u0093\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u00a1\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\n\u0004\u0000\u0000\u009d\u009e\u0007\u0002\u0000"+
		"\u0000\u009e\u00a0\u0003 \u0010\u0005\u009f\u009c\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2!\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0006\u0011\uffff\uffff\u0000"+
		"\u00a5\u00a6\u0003 \u0010\u0000\u00a6\u00a7\u0003$\u0012\u0000\u00a7\u00a8"+
		"\u0003 \u0010\u0000\u00a8\u00ac\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u001d\u0000\u0000\u00aa\u00ac\u0003\"\u0011\u0001\u00ab\u00a4\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b2\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\n\u0002\u0000\u0000\u00ae\u00af\u0007\u0003\u0000"+
		"\u0000\u00af\u00b1\u0003\"\u0011\u0003\u00b0\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3#\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0004\u0000\u0000\u00b6"+
		"%\u0001\u0000\u0000\u0000\f)57JUco\u0083\u009a\u00a1\u00ab\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}