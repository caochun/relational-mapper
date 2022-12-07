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
		PROJECTION=8, LEFT_OUTER_JOIN=9, AND=10, OR=11, DOT=12, COMMA=13, QUOTA=14, 
		SINGLE_QUOTA=15, LP=16, RP=17, SEMI=18, NUMBER=19, STRING=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"UNION", "GROUP_BY", "DIALECT", "CASE", "RELOP", "RENAME", "SELECTION", 
		"PROJECTION", "LEFT_OUTER_JOIN", "AND", "OR", "DOT", "COMMA", "QUOTA", 
		"SINGLE_QUOTA", "LP", "RP", "SEMI", "NUMBER", "STRING", "WS", "A", "B", 
		"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
		"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u222A'", "'\u03B3'", "'\u0192'", "'\u03C8'", null, "'\u03C1'", 
		"'\u03C3'", "'\u03C0'", "'\u27D5'", "'\u2227'", "'\u2228'", "'.'", "','", 
		"'\"'", "'''", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UNION", "GROUP_BY", "DIALECT", "CASE", "RELOP", "RENAME", "SELECTION", 
		"PROJECTION", "LEFT_OUTER_JOIN", "AND", "OR", "DOT", "COMMA", "QUOTA", 
		"SINGLE_QUOTA", "LP", "RP", "SEMI", "NUMBER", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00d4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u0091\n\24\r\24\16\24\u0092\3\25\6"+
		"\25\u0096\n\25\r\25\16\25\u0097\3\26\6\26\u009b\n\26\r\26\16\26\u009c"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63\2\65\2\67\29\2;\2"+
		"=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2\3\2\37\3\2\62;"+
		"\f\2%%\'\')),,\62;C\\aac}\177\177\u4e02\u9fa7\5\2\13\f\17\17\"\"\4\2C"+
		"Ccc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2"+
		"\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3a\3\2\2\2\5"+
		"c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21"+
		"y\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0083"+
		"\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2"+
		"\2%\u008d\3\2\2\2\'\u0090\3\2\2\2)\u0095\3\2\2\2+\u009a\3\2\2\2-\u00a0"+
		"\3\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2\63\u00a6\3\2\2\2\65\u00a8\3\2"+
		"\2\2\67\u00aa\3\2\2\29\u00ac\3\2\2\2;\u00ae\3\2\2\2=\u00b0\3\2\2\2?\u00b2"+
		"\3\2\2\2A\u00b4\3\2\2\2C\u00b6\3\2\2\2E\u00b8\3\2\2\2G\u00ba\3\2\2\2I"+
		"\u00bc\3\2\2\2K\u00be\3\2\2\2M\u00c0\3\2\2\2O\u00c2\3\2\2\2Q\u00c4\3\2"+
		"\2\2S\u00c6\3\2\2\2U\u00c8\3\2\2\2W\u00ca\3\2\2\2Y\u00cc\3\2\2\2[\u00ce"+
		"\3\2\2\2]\u00d0\3\2\2\2_\u00d2\3\2\2\2ab\7\u222c\2\2b\4\3\2\2\2cd\7\u03b5"+
		"\2\2d\6\3\2\2\2ef\7\u0194\2\2f\b\3\2\2\2gh\7\u03ca\2\2h\n\3\2\2\2it\7"+
		"@\2\2jk\7@\2\2kt\7?\2\2lt\7>\2\2mn\7>\2\2nt\7?\2\2ot\7?\2\2pq\7#\2\2q"+
		"t\7?\2\2rt\7\u03bd\2\2si\3\2\2\2sj\3\2\2\2sl\3\2\2\2sm\3\2\2\2so\3\2\2"+
		"\2sp\3\2\2\2sr\3\2\2\2t\f\3\2\2\2uv\7\u03c3\2\2v\16\3\2\2\2wx\7\u03c5"+
		"\2\2x\20\3\2\2\2yz\7\u03c2\2\2z\22\3\2\2\2{|\7\u27d7\2\2|\24\3\2\2\2}"+
		"~\7\u2229\2\2~\26\3\2\2\2\177\u0080\7\u222a\2\2\u0080\30\3\2\2\2\u0081"+
		"\u0082\7\60\2\2\u0082\32\3\2\2\2\u0083\u0084\7.\2\2\u0084\34\3\2\2\2\u0085"+
		"\u0086\7$\2\2\u0086\36\3\2\2\2\u0087\u0088\7)\2\2\u0088 \3\2\2\2\u0089"+
		"\u008a\7*\2\2\u008a\"\3\2\2\2\u008b\u008c\7+\2\2\u008c$\3\2\2\2\u008d"+
		"\u008e\7=\2\2\u008e&\3\2\2\2\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093(\3\2\2\2"+
		"\u0094\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098*\3\2\2\2\u0099\u009b\t\4\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\26\2\2\u009f,\3\2\2\2\u00a0\u00a1"+
		"\t\5\2\2\u00a1.\3\2\2\2\u00a2\u00a3\t\6\2\2\u00a3\60\3\2\2\2\u00a4\u00a5"+
		"\t\7\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\t\b\2\2\u00a7\64\3\2\2\2\u00a8\u00a9"+
		"\t\t\2\2\u00a9\66\3\2\2\2\u00aa\u00ab\t\n\2\2\u00ab8\3\2\2\2\u00ac\u00ad"+
		"\t\13\2\2\u00ad:\3\2\2\2\u00ae\u00af\t\f\2\2\u00af<\3\2\2\2\u00b0\u00b1"+
		"\t\r\2\2\u00b1>\3\2\2\2\u00b2\u00b3\t\16\2\2\u00b3@\3\2\2\2\u00b4\u00b5"+
		"\t\17\2\2\u00b5B\3\2\2\2\u00b6\u00b7\t\20\2\2\u00b7D\3\2\2\2\u00b8\u00b9"+
		"\t\21\2\2\u00b9F\3\2\2\2\u00ba\u00bb\t\22\2\2\u00bbH\3\2\2\2\u00bc\u00bd"+
		"\t\23\2\2\u00bdJ\3\2\2\2\u00be\u00bf\t\24\2\2\u00bfL\3\2\2\2\u00c0\u00c1"+
		"\t\25\2\2\u00c1N\3\2\2\2\u00c2\u00c3\t\26\2\2\u00c3P\3\2\2\2\u00c4\u00c5"+
		"\t\27\2\2\u00c5R\3\2\2\2\u00c6\u00c7\t\30\2\2\u00c7T\3\2\2\2\u00c8\u00c9"+
		"\t\31\2\2\u00c9V\3\2\2\2\u00ca\u00cb\t\32\2\2\u00cbX\3\2\2\2\u00cc\u00cd"+
		"\t\33\2\2\u00cdZ\3\2\2\2\u00ce\u00cf\t\34\2\2\u00cf\\\3\2\2\2\u00d0\u00d1"+
		"\t\35\2\2\u00d1^\3\2\2\2\u00d2\u00d3\t\36\2\2\u00d3`\3\2\2\2\7\2s\u0092"+
		"\u0097\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}