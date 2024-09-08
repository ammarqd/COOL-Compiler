// Generated from /home/ammar-q/Cool-Compiler/src/CoolLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PERIOD=1, COMMA=2, AT=3, SEMICOLON=4, COLON=5, CURLY_OPEN=6, CURLY_CLOSE=7, 
		PARENT_OPEN=8, PARENT_CLOSE=9, PLUS_OPERATOR=10, MINUS_OPERATOR=11, MULT_OPERATOR=12, 
		DIV_OPERATOR=13, INT_COMPLEMENT_OPERATOR=14, LESS_OPERATOR=15, LESS_EQ_OPERATOR=16, 
		EQ_OPERATOR=17, ASSIGN_OPERATOR=18, RIGHTARROW=19, CLASS=20, ERROR=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PERIOD", "COMMA", "AT", "SEMICOLON", "COLON", "CURLY_OPEN", "CURLY_CLOSE", 
			"PARENT_OPEN", "PARENT_CLOSE", "PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", 
			"DIV_OPERATOR", "INT_COMPLEMENT_OPERATOR", "LESS_OPERATOR", "LESS_EQ_OPERATOR", 
			"EQ_OPERATOR", "ASSIGN_OPERATOR", "RIGHTARROW", "CLASS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'@'", "';'", "':'", "'{'", "'}'", "'('", "')'", 
			"'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'<='", "'='", "'<-'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PERIOD", "COMMA", "AT", "SEMICOLON", "COLON", "CURLY_OPEN", "CURLY_CLOSE", 
			"PARENT_OPEN", "PARENT_CLOSE", "PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", 
			"DIV_OPERATOR", "INT_COMPLEMENT_OPERATOR", "LESS_OPERATOR", "LESS_EQ_OPERATOR", 
			"EQ_OPERATOR", "ASSIGN_OPERATOR", "RIGHTARROW", "CLASS", "ERROR"
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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
		"\u0004\u0000\u0015\\\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0004\u0002\u0000CCc"+
		"c\u0002\u0000LLll\u0002\u0000AAaa\u0002\u0000SSss[\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000"+
		"\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u0007"+
		"1\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000"+
		"\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000"+
		"\u0011;\u0001\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015?"+
		"\u0001\u0000\u0000\u0000\u0017A\u0001\u0000\u0000\u0000\u0019C\u0001\u0000"+
		"\u0000\u0000\u001bE\u0001\u0000\u0000\u0000\u001dG\u0001\u0000\u0000\u0000"+
		"\u001fI\u0001\u0000\u0000\u0000!L\u0001\u0000\u0000\u0000#N\u0001\u0000"+
		"\u0000\u0000%Q\u0001\u0000\u0000\u0000\'T\u0001\u0000\u0000\u0000)Z\u0001"+
		"\u0000\u0000\u0000+,\u0005.\u0000\u0000,\u0002\u0001\u0000\u0000\u0000"+
		"-.\u0005,\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005@\u0000\u0000"+
		"0\u0006\u0001\u0000\u0000\u000012\u0005;\u0000\u00002\b\u0001\u0000\u0000"+
		"\u000034\u0005:\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005{\u0000"+
		"\u00006\f\u0001\u0000\u0000\u000078\u0005}\u0000\u00008\u000e\u0001\u0000"+
		"\u0000\u00009:\u0005(\u0000\u0000:\u0010\u0001\u0000\u0000\u0000;<\u0005"+
		")\u0000\u0000<\u0012\u0001\u0000\u0000\u0000=>\u0005+\u0000\u0000>\u0014"+
		"\u0001\u0000\u0000\u0000?@\u0005-\u0000\u0000@\u0016\u0001\u0000\u0000"+
		"\u0000AB\u0005*\u0000\u0000B\u0018\u0001\u0000\u0000\u0000CD\u0005/\u0000"+
		"\u0000D\u001a\u0001\u0000\u0000\u0000EF\u0005~\u0000\u0000F\u001c\u0001"+
		"\u0000\u0000\u0000GH\u0005<\u0000\u0000H\u001e\u0001\u0000\u0000\u0000"+
		"IJ\u0005<\u0000\u0000JK\u0005=\u0000\u0000K \u0001\u0000\u0000\u0000L"+
		"M\u0005=\u0000\u0000M\"\u0001\u0000\u0000\u0000NO\u0005<\u0000\u0000O"+
		"P\u0005-\u0000\u0000P$\u0001\u0000\u0000\u0000QR\u0005=\u0000\u0000RS"+
		"\u0005>\u0000\u0000S&\u0001\u0000\u0000\u0000TU\u0007\u0000\u0000\u0000"+
		"UV\u0007\u0001\u0000\u0000VW\u0007\u0002\u0000\u0000WX\u0007\u0003\u0000"+
		"\u0000XY\u0007\u0003\u0000\u0000Y(\u0001\u0000\u0000\u0000Z[\t\u0000\u0000"+
		"\u0000[*\u0001\u0000\u0000\u0000\u0001\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}