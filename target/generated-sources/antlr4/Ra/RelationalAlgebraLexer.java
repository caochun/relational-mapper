// Generated from Ra/RelationalAlgebra.g4 by ANTLR 4.7.1
package Ra;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelationalAlgebraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNION=1, GROUP_BY=2, DIALECT=3, CASE=4, RELOP=5, RENAME=6, SELECTION=7, 
		PROJECTION=8, LEFT_OUTER_JOIN=9, INNER_JOIN=10, AND=11, OR=12, DOT=13, 
		COMMA=14, QUOTA=15, SINGLE_QUOTA=16, LP=17, RP=18, SEMI=19, NUMBER=20, 
		LIKE=21, STRING=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"UNION", "GROUP_BY", "DIALECT", "CASE", "RELOP", "RENAME", "SELECTION", 
		"PROJECTION", "LEFT_OUTER_JOIN", "INNER_JOIN", "AND", "OR", "DOT", "COMMA", 
		"QUOTA", "SINGLE_QUOTA", "LP", "RP", "SEMI", "NUMBER", "LIKE", "STRING", 
		"WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
		"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u222A'", "'\u03B3'", "'\u0192'", "'\u03C8'", null, "'\u03C1'", 
		"'\u03C3'", "'\u03C0'", "'\u27D5'", "'\u2A1D'", "'\u2227'", "'\u2228'", 
		"'.'", "','", "'\"'", "'''", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UNION", "GROUP_BY", "DIALECT", "CASE", "RELOP", "RENAME", "SELECTION", 
		"PROJECTION", "LEFT_OUTER_JOIN", "INNER_JOIN", "AND", "OR", "DOT", "COMMA", 
		"QUOTA", "SINGLE_QUOTA", "LP", "RP", "SEMI", "NUMBER", "LIKE", "STRING", 
		"WS"
	};
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


	public RelationalAlgebraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RelationalAlgebra.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00df\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25\u0097"+
		"\n\25\r\25\16\25\u0098\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u00a1\n\27\r"+
		"\27\16\27\u00a2\3\30\6\30\u00a6\n\30\r\30\16\30\u00a7\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\2\2\63\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2"+
		"G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2\3\2\37\3\2\62;\13\2%%\'"+
		"\',,\62;C\\aac}\177\177\u4e02\u9fa7\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDd"+
		"d\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2"+
		"MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00cd\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3e\3"+
		"\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2"+
		"\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u0085"+
		"\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d\3\2"+
		"\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0096\3\2\2\2+\u009a"+
		"\3\2\2\2-\u00a0\3\2\2\2/\u00a5\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2"+
		"\2\65\u00af\3\2\2\2\67\u00b1\3\2\2\29\u00b3\3\2\2\2;\u00b5\3\2\2\2=\u00b7"+
		"\3\2\2\2?\u00b9\3\2\2\2A\u00bb\3\2\2\2C\u00bd\3\2\2\2E\u00bf\3\2\2\2G"+
		"\u00c1\3\2\2\2I\u00c3\3\2\2\2K\u00c5\3\2\2\2M\u00c7\3\2\2\2O\u00c9\3\2"+
		"\2\2Q\u00cb\3\2\2\2S\u00cd\3\2\2\2U\u00cf\3\2\2\2W\u00d1\3\2\2\2Y\u00d3"+
		"\3\2\2\2[\u00d5\3\2\2\2]\u00d7\3\2\2\2_\u00d9\3\2\2\2a\u00db\3\2\2\2c"+
		"\u00dd\3\2\2\2ef\7\u222c\2\2f\4\3\2\2\2gh\7\u03b5\2\2h\6\3\2\2\2ij\7\u0194"+
		"\2\2j\b\3\2\2\2kl\7\u03ca\2\2l\n\3\2\2\2mx\7@\2\2no\7@\2\2ox\7?\2\2px"+
		"\7>\2\2qr\7>\2\2rx\7?\2\2sx\7?\2\2tu\7#\2\2ux\7?\2\2vx\7\u03bd\2\2wm\3"+
		"\2\2\2wn\3\2\2\2wp\3\2\2\2wq\3\2\2\2ws\3\2\2\2wt\3\2\2\2wv\3\2\2\2x\f"+
		"\3\2\2\2yz\7\u03c3\2\2z\16\3\2\2\2{|\7\u03c5\2\2|\20\3\2\2\2}~\7\u03c2"+
		"\2\2~\22\3\2\2\2\177\u0080\7\u27d7\2\2\u0080\24\3\2\2\2\u0081\u0082\7"+
		"\u2a1f\2\2\u0082\26\3\2\2\2\u0083\u0084\7\u2229\2\2\u0084\30\3\2\2\2\u0085"+
		"\u0086\7\u222a\2\2\u0086\32\3\2\2\2\u0087\u0088\7\60\2\2\u0088\34\3\2"+
		"\2\2\u0089\u008a\7.\2\2\u008a\36\3\2\2\2\u008b\u008c\7$\2\2\u008c \3\2"+
		"\2\2\u008d\u008e\7)\2\2\u008e\"\3\2\2\2\u008f\u0090\7*\2\2\u0090$\3\2"+
		"\2\2\u0091\u0092\7+\2\2\u0092&\3\2\2\2\u0093\u0094\7=\2\2\u0094(\3\2\2"+
		"\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099*\3\2\2\2\u009a\u009b\5G$\2\u009b\u009c"+
		"\5A!\2\u009c\u009d\5E#\2\u009d\u009e\59\35\2\u009e,\3\2\2\2\u009f\u00a1"+
		"\t\3\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3.\3\2\2\2\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\b\30\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac"+
		"\62\3\2\2\2\u00ad\u00ae\t\6\2\2\u00ae\64\3\2\2\2\u00af\u00b0\t\7\2\2\u00b0"+
		"\66\3\2\2\2\u00b1\u00b2\t\b\2\2\u00b28\3\2\2\2\u00b3\u00b4\t\t\2\2\u00b4"+
		":\3\2\2\2\u00b5\u00b6\t\n\2\2\u00b6<\3\2\2\2\u00b7\u00b8\t\13\2\2\u00b8"+
		">\3\2\2\2\u00b9\u00ba\t\f\2\2\u00ba@\3\2\2\2\u00bb\u00bc\t\r\2\2\u00bc"+
		"B\3\2\2\2\u00bd\u00be\t\16\2\2\u00beD\3\2\2\2\u00bf\u00c0\t\17\2\2\u00c0"+
		"F\3\2\2\2\u00c1\u00c2\t\20\2\2\u00c2H\3\2\2\2\u00c3\u00c4\t\21\2\2\u00c4"+
		"J\3\2\2\2\u00c5\u00c6\t\22\2\2\u00c6L\3\2\2\2\u00c7\u00c8\t\23\2\2\u00c8"+
		"N\3\2\2\2\u00c9\u00ca\t\24\2\2\u00caP\3\2\2\2\u00cb\u00cc\t\25\2\2\u00cc"+
		"R\3\2\2\2\u00cd\u00ce\t\26\2\2\u00ceT\3\2\2\2\u00cf\u00d0\t\27\2\2\u00d0"+
		"V\3\2\2\2\u00d1\u00d2\t\30\2\2\u00d2X\3\2\2\2\u00d3\u00d4\t\31\2\2\u00d4"+
		"Z\3\2\2\2\u00d5\u00d6\t\32\2\2\u00d6\\\3\2\2\2\u00d7\u00d8\t\33\2\2\u00d8"+
		"^\3\2\2\2\u00d9\u00da\t\34\2\2\u00da`\3\2\2\2\u00db\u00dc\t\35\2\2\u00dc"+
		"b\3\2\2\2\u00dd\u00de\t\36\2\2\u00ded\3\2\2\2\7\2w\u0098\u00a2\u00a7\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}