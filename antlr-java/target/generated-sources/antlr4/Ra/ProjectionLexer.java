// Generated from Ra/Projection.g4 by ANTLR 4.7.1
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
public class ProjectionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROJECTION=1, STRING=2, NUMBER=3, COMMA=4, LP=5, RP=6, ARROW=7, SEMI=8, 
		WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROJECTION", "STRING", "NUMBER", "COMMA", "LP", "RP", "ARROW", "SEMI", 
		"WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
		"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u03C0'", null, null, "','", "'('", "')'", "'\u2192'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROJECTION", "STRING", "NUMBER", "COMMA", "LP", "RP", "ARROW", 
		"SEMI", "WS"
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


	public ProjectionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Projection.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\6\3M\n\3\r\3\16\3N\3\4\6\4R\n"+
		"\4\r\4\16\4S\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\na\n\n\r\n"+
		"\16\nb\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2"+
		"/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2\3\2\37\b\2)),,\62;C\\"+
		"aac|\3\2\62;\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GG"+
		"gg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2"+
		"PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4"+
		"\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\3I\3\2\2\2\5L\3\2\2\2\7Q\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2"+
		"\rY\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23`\3\2\2\2\25f\3\2\2\2\27h\3\2\2"+
		"\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2"+
		"%v\3\2\2\2\'x\3\2\2\2)z\3\2\2\2+|\3\2\2\2-~\3\2\2\2/\u0080\3\2\2\2\61"+
		"\u0082\3\2\2\2\63\u0084\3\2\2\2\65\u0086\3\2\2\2\67\u0088\3\2\2\29\u008a"+
		"\3\2\2\2;\u008c\3\2\2\2=\u008e\3\2\2\2?\u0090\3\2\2\2A\u0092\3\2\2\2C"+
		"\u0094\3\2\2\2E\u0096\3\2\2\2G\u0098\3\2\2\2IJ\7\u03c2\2\2J\4\3\2\2\2"+
		"KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\6\3\2\2\2PR\t\3\2"+
		"\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\b\3\2\2\2UV\7.\2\2V\n\3\2"+
		"\2\2WX\7*\2\2X\f\3\2\2\2YZ\7+\2\2Z\16\3\2\2\2[\\\7\u2194\2\2\\\20\3\2"+
		"\2\2]^\7=\2\2^\22\3\2\2\2_a\t\4\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2cd\3\2\2\2de\b\n\2\2e\24\3\2\2\2fg\t\5\2\2g\26\3\2\2\2hi\t\6\2\2"+
		"i\30\3\2\2\2jk\t\7\2\2k\32\3\2\2\2lm\t\b\2\2m\34\3\2\2\2no\t\t\2\2o\36"+
		"\3\2\2\2pq\t\n\2\2q \3\2\2\2rs\t\13\2\2s\"\3\2\2\2tu\t\f\2\2u$\3\2\2\2"+
		"vw\t\r\2\2w&\3\2\2\2xy\t\16\2\2y(\3\2\2\2z{\t\17\2\2{*\3\2\2\2|}\t\20"+
		"\2\2},\3\2\2\2~\177\t\21\2\2\177.\3\2\2\2\u0080\u0081\t\22\2\2\u0081\60"+
		"\3\2\2\2\u0082\u0083\t\23\2\2\u0083\62\3\2\2\2\u0084\u0085\t\24\2\2\u0085"+
		"\64\3\2\2\2\u0086\u0087\t\25\2\2\u0087\66\3\2\2\2\u0088\u0089\t\26\2\2"+
		"\u00898\3\2\2\2\u008a\u008b\t\27\2\2\u008b:\3\2\2\2\u008c\u008d\t\30\2"+
		"\2\u008d<\3\2\2\2\u008e\u008f\t\31\2\2\u008f>\3\2\2\2\u0090\u0091\t\32"+
		"\2\2\u0091@\3\2\2\2\u0092\u0093\t\33\2\2\u0093B\3\2\2\2\u0094\u0095\t"+
		"\34\2\2\u0095D\3\2\2\2\u0096\u0097\t\35\2\2\u0097F\3\2\2\2\u0098\u0099"+
		"\t\36\2\2\u0099H\3\2\2\2\6\2NSb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}