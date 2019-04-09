package com.deathlike.gen;// Generated from C:/Users/a4tec/IdeaProjects/DeathLikeCompiler\DeathLikeGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DeathLikeGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, RESERVED_WORD=7, BEGIN=8, 
		END=9, PRINT=10, INT=11, FLOAT=12, DOUBLE=13, WHILE=14, FOR=15, CONST=16, 
		IF=17, ELSE=18, CALL=19, RETURN=20, SEPARATOR=21, DELIMITER=22, COLON=23, 
		ID=24, STRING=25, NUMBER=26, NOT_WHOLE_NUMBER=27, WS=28, PLUS=29, MINUS=30, 
		MULTIPLY=31, DIVIDE=32, PROCENT=33, EXPONENTIATION=34, NEGATION=35, AND=36, 
		OR=37, EQUAL=38, NON_EQUAL=39, LESS=40, LESS_OR_EQUALS=41, GREATER=42, 
		GREATER_OR_EQUALS=43, O_BRACKET=44, C_BRACKET=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "RESERVED_WORD", "BEGIN", 
			"END", "PRINT", "INT", "FLOAT", "DOUBLE", "WHILE", "FOR", "CONST", "IF", 
			"ELSE", "CALL", "RETURN", "SEPARATOR", "DELIMITER", "COLON", "ID", "STRING", 
			"NUMBER", "NOT_WHOLE_NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"PROCENT", "EXPONENTIATION", "NEGATION", "AND", "OR", "EQUAL", "NON_EQUAL", 
			"LESS", "LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", "O_BRACKET", 
			"C_BRACKET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'true'", "'false'", "'='", "','", "'function'", null, 
			"'{'", "'}'", "'print'", "'int'", "'float'", "'double'", "'while'", "'for'", 
			"'const'", "'if'", "'else'", "'call'", "'return'", "';'", "'.'", "':'", 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
			"'!'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "RESERVED_WORD", "BEGIN", "END", 
			"PRINT", "INT", "FLOAT", "DOUBLE", "WHILE", "FOR", "CONST", "IF", "ELSE", 
			"CALL", "RETURN", "SEPARATOR", "DELIMITER", "COLON", "ID", "STRING", 
			"NUMBER", "NOT_WHOLE_NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"PROCENT", "EXPONENTIATION", "NEGATION", "AND", "OR", "EQUAL", "NON_EQUAL", 
			"LESS", "LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", "O_BRACKET", 
			"C_BRACKET"
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


	public DeathLikeGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DeathLikeGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u00cd\n\31\f\31\16\31\u00d0\13"+
		"\31\3\32\3\32\6\32\u00d4\n\32\r\32\16\32\u00d5\3\32\3\32\3\33\6\33\u00db"+
		"\n\33\r\33\16\33\u00dc\3\34\6\34\u00e0\n\34\r\34\16\34\u00e1\3\34\3\34"+
		"\6\34\u00e6\n\34\r\34\16\34\u00e7\5\34\u00ea\n\34\3\35\6\35\u00ed\n\35"+
		"\r\35\16\35\u00ee\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3"+
		"+\3,\3,\3,\3-\3-\3.\3.\3\u00d5\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2"+
		"\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\"\2\u0121"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5b\3\2\2\2\7g\3"+
		"\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2"+
		"\2\2\23\u0087\3\2\2\2\25\u0089\3\2\2\2\27\u008f\3\2\2\2\31\u0093\3\2\2"+
		"\2\33\u0099\3\2\2\2\35\u00a0\3\2\2\2\37\u00a6\3\2\2\2!\u00aa\3\2\2\2#"+
		"\u00b0\3\2\2\2%\u00b3\3\2\2\2\'\u00b8\3\2\2\2)\u00bd\3\2\2\2+\u00c4\3"+
		"\2\2\2-\u00c6\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00d1\3\2\2\2"+
		"\65\u00da\3\2\2\2\67\u00df\3\2\2\29\u00ec\3\2\2\2;\u00f2\3\2\2\2=\u00f4"+
		"\3\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G"+
		"\u00fe\3\2\2\2I\u0100\3\2\2\2K\u0103\3\2\2\2M\u0106\3\2\2\2O\u0109\3\2"+
		"\2\2Q\u010c\3\2\2\2S\u010e\3\2\2\2U\u0111\3\2\2\2W\u0113\3\2\2\2Y\u0116"+
		"\3\2\2\2[\u0118\3\2\2\2]^\7o\2\2^_\7c\2\2_`\7k\2\2`a\7p\2\2a\4\3\2\2\2"+
		"bc\7v\2\2cd\7t\2\2de\7w\2\2ef\7g\2\2f\6\3\2\2\2gh\7h\2\2hi\7c\2\2ij\7"+
		"n\2\2jk\7u\2\2kl\7g\2\2l\b\3\2\2\2mn\7?\2\2n\n\3\2\2\2op\7.\2\2p\f\3\2"+
		"\2\2qr\7h\2\2rs\7w\2\2st\7p\2\2tu\7e\2\2uv\7v\2\2vw\7k\2\2wx\7q\2\2xy"+
		"\7p\2\2y\16\3\2\2\2z{\7v\2\2{|\7t\2\2|}\7w\2\2}\u0084\7g\2\2~\177\7h\2"+
		"\2\177\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0084"+
		"\7g\2\2\u0083z\3\2\2\2\u0083~\3\2\2\2\u0084\20\3\2\2\2\u0085\u0086\7}"+
		"\2\2\u0086\22\3\2\2\2\u0087\u0088\7\177\2\2\u0088\24\3\2\2\2\u0089\u008a"+
		"\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7v\2\2\u008e\26\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7v\2\2\u0092\30\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7q\2\2\u0096\u0097\7c\2\2\u0097\u0098\7v\2\2\u0098\32\3\2\2\2\u0099"+
		"\u009a\7f\2\2\u009a\u009b\7q\2\2\u009b\u009c\7w\2\2\u009c\u009d\7d\2\2"+
		"\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7"+
		"y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad"+
		"\7p\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7v\2\2\u00af\"\3\2\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7h\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5"+
		"\7n\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7&\3\2\2\2\u00b8\u00b9"+
		"\7e\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7n\2\2\u00bc"+
		"(\3\2\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7p\2\2\u00c3*\3\2\2\2\u00c4"+
		"\u00c5\7=\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7\60\2\2\u00c7.\3\2\2\2\u00c8"+
		"\u00c9\7<\2\2\u00c9\60\3\2\2\2\u00ca\u00ce\t\2\2\2\u00cb\u00cd\t\3\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\62\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\7$\2\2\u00d2"+
		"\u00d4\13\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8"+
		"\64\3\2\2\2\u00d9\u00db\t\4\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\66\3\2\2\2\u00de\u00e0"+
		"\t\4\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e5\t\5\2\2\u00e4\u00e6\t\4"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea8\3\2\2\2\u00eb\u00ed\t\6\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\b\35\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7-\2\2\u00f3<\3\2\2\2\u00f4"+
		"\u00f5\7/\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7@\3\2\2\2\u00f8\u00f9"+
		"\7\61\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7\'\2\2\u00fbD\3\2\2\2\u00fc\u00fd"+
		"\7`\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7#\2\2\u00ffH\3\2\2\2\u0100\u0101\7"+
		"(\2\2\u0101\u0102\7(\2\2\u0102J\3\2\2\2\u0103\u0104\7~\2\2\u0104\u0105"+
		"\7~\2\2\u0105L\3\2\2\2\u0106\u0107\7?\2\2\u0107\u0108\7?\2\2\u0108N\3"+
		"\2\2\2\u0109\u010a\7#\2\2\u010a\u010b\7?\2\2\u010bP\3\2\2\2\u010c\u010d"+
		"\7>\2\2\u010dR\3\2\2\2\u010e\u010f\7>\2\2\u010f\u0110\7?\2\2\u0110T\3"+
		"\2\2\2\u0111\u0112\7@\2\2\u0112V\3\2\2\2\u0113\u0114\7@\2\2\u0114\u0115"+
		"\7?\2\2\u0115X\3\2\2\2\u0116\u0117\7*\2\2\u0117Z\3\2\2\2\u0118\u0119\7"+
		"+\2\2\u0119\\\3\2\2\2\13\2\u0083\u00ce\u00d5\u00dc\u00e1\u00e7\u00e9\u00ee"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}