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
		RELOP=1, RENAME=2, SELECTION=3, PROJECTION=4, LEFTOUTERJOIN=5, AND=6, 
		OR=7, DOT=8, COMMA=9, QUOTA=10, SINGLEQUOTA=11, LP=12, RP=13, ARROW=14, 
		SEMI=15, NUMBER=16, STRING=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"RELOP", "RENAME", "SELECTION", "PROJECTION", "LEFTOUTERJOIN", "AND", 
		"OR", "DOT", "COMMA", "QUOTA", "SINGLEQUOTA", "LP", "RP", "ARROW", "SEMI", 
		"NUMBER", "STRING", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'\u03C1'", "'\u03C3'", "'\u03C0'", "'\u27D5'", "'\u2227'", 
		"'\u2228'", "'.'", "','", "'\"'", "'''", "'('", "')'", "'\u2192'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RELOP", "RENAME", "SELECTION", "PROJECTION", "LEFTOUTERJOIN", "AND", 
		"OR", "DOT", "COMMA", "QUOTA", "SINGLEQUOTA", "LP", "RP", "ARROW", "SEMI", 
		"NUMBER", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2e\n\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21\u0084\n\21\r\21\16\21"+
		"\u0085\3\22\6\22\u0089\n\22\r\22\16\22\u008a\3\23\6\23\u008e\n\23\r\23"+
		"\16\23\u008f\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2-\2/\2\61\2\63\2"+
		"\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2\3\2\37\3"+
		"\2\62;\b\2)),,\62;C\\aac|\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNn"+
		"n\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00b4\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3"+
		"d\3\2\2\2\5f\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p"+
		"\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33"+
		"|\3\2\2\2\35~\3\2\2\2\37\u0080\3\2\2\2!\u0083\3\2\2\2#\u0088\3\2\2\2%"+
		"\u008d\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u0099\3"+
		"\2\2\2/\u009b\3\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2"+
		"\2\67\u00a3\3\2\2\29\u00a5\3\2\2\2;\u00a7\3\2\2\2=\u00a9\3\2\2\2?\u00ab"+
		"\3\2\2\2A\u00ad\3\2\2\2C\u00af\3\2\2\2E\u00b1\3\2\2\2G\u00b3\3\2\2\2I"+
		"\u00b5\3\2\2\2K\u00b7\3\2\2\2M\u00b9\3\2\2\2O\u00bb\3\2\2\2Q\u00bd\3\2"+
		"\2\2S\u00bf\3\2\2\2U\u00c1\3\2\2\2W\u00c3\3\2\2\2Y\u00c5\3\2\2\2[e\7@"+
		"\2\2\\]\7@\2\2]e\7?\2\2^e\7>\2\2_`\7>\2\2`e\7?\2\2ae\7?\2\2bc\7#\2\2c"+
		"e\7?\2\2d[\3\2\2\2d\\\3\2\2\2d^\3\2\2\2d_\3\2\2\2da\3\2\2\2db\3\2\2\2"+
		"e\4\3\2\2\2fg\7\u03c3\2\2g\6\3\2\2\2hi\7\u03c5\2\2i\b\3\2\2\2jk\7\u03c2"+
		"\2\2k\n\3\2\2\2lm\7\u27d7\2\2m\f\3\2\2\2no\7\u2229\2\2o\16\3\2\2\2pq\7"+
		"\u222a\2\2q\20\3\2\2\2rs\7\60\2\2s\22\3\2\2\2tu\7.\2\2u\24\3\2\2\2vw\7"+
		"$\2\2w\26\3\2\2\2xy\7)\2\2y\30\3\2\2\2z{\7*\2\2{\32\3\2\2\2|}\7+\2\2}"+
		"\34\3\2\2\2~\177\7\u2194\2\2\177\36\3\2\2\2\u0080\u0081\7=\2\2\u0081 "+
		"\3\2\2\2\u0082\u0084\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\"\3\2\2\2\u0087\u0089\t\3\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b$\3\2\2\2\u008c\u008e\t\4\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\b\23\2\2\u0092&\3\2\2\2\u0093\u0094\t\5\2\2\u0094(\3"+
		"\2\2\2\u0095\u0096\t\6\2\2\u0096*\3\2\2\2\u0097\u0098\t\7\2\2\u0098,\3"+
		"\2\2\2\u0099\u009a\t\b\2\2\u009a.\3\2\2\2\u009b\u009c\t\t\2\2\u009c\60"+
		"\3\2\2\2\u009d\u009e\t\n\2\2\u009e\62\3\2\2\2\u009f\u00a0\t\13\2\2\u00a0"+
		"\64\3\2\2\2\u00a1\u00a2\t\f\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\t\r\2\2\u00a4"+
		"8\3\2\2\2\u00a5\u00a6\t\16\2\2\u00a6:\3\2\2\2\u00a7\u00a8\t\17\2\2\u00a8"+
		"<\3\2\2\2\u00a9\u00aa\t\20\2\2\u00aa>\3\2\2\2\u00ab\u00ac\t\21\2\2\u00ac"+
		"@\3\2\2\2\u00ad\u00ae\t\22\2\2\u00aeB\3\2\2\2\u00af\u00b0\t\23\2\2\u00b0"+
		"D\3\2\2\2\u00b1\u00b2\t\24\2\2\u00b2F\3\2\2\2\u00b3\u00b4\t\25\2\2\u00b4"+
		"H\3\2\2\2\u00b5\u00b6\t\26\2\2\u00b6J\3\2\2\2\u00b7\u00b8\t\27\2\2\u00b8"+
		"L\3\2\2\2\u00b9\u00ba\t\30\2\2\u00baN\3\2\2\2\u00bb\u00bc\t\31\2\2\u00bc"+
		"P\3\2\2\2\u00bd\u00be\t\32\2\2\u00beR\3\2\2\2\u00bf\u00c0\t\33\2\2\u00c0"+
		"T\3\2\2\2\u00c1\u00c2\t\34\2\2\u00c2V\3\2\2\2\u00c3\u00c4\t\35\2\2\u00c4"+
		"X\3\2\2\2\u00c5\u00c6\t\36\2\2\u00c6Z\3\2\2\2\7\2d\u0085\u008a\u008f\3"+
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