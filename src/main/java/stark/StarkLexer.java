// Generated from /home/rafael/Desktop/UFABC/Compiladores/Projeto Final/src/main/antlr4/Stark.g4 by ANTLR 4.7.2
package stark;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StarkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, STRING=22, INT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "STRING", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'se'", "'sen\u00E3o'", "'enquanto'", "'fa\u00E7a'", 
			"'('", "')'", "'='", "'escreva'", "'leia()'", "'+'", "'-'", "'*'", "'/'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"INT", "WS"
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


	public StarkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stark.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\6\27}\n\27\r\27\16"+
		"\27~\3\30\6\30\u0082\n\30\r\30\16\30\u0083\3\31\6\31\u0087\n\31\r\31\16"+
		"\31\u0088\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\2\u008e\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3"+
		"\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t:\3\2\2\2\13@\3\2\2\2\rI\3\2\2\2\17"+
		"N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27\\\3\2\2\2\31c\3\2\2\2"+
		"\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2\2#n\3\2\2\2%q\3\2\2\2\'s"+
		"\3\2\2\2)u\3\2\2\2+x\3\2\2\2-|\3\2\2\2/\u0081\3\2\2\2\61\u0086\3\2\2\2"+
		"\63\64\7}\2\2\64\4\3\2\2\2\65\66\7\177\2\2\66\6\3\2\2\2\678\7u\2\289\7"+
		"g\2\29\b\3\2\2\2:;\7u\2\2;<\7g\2\2<=\7p\2\2=>\7\u00e5\2\2>?\7q\2\2?\n"+
		"\3\2\2\2@A\7g\2\2AB\7p\2\2BC\7s\2\2CD\7w\2\2DE\7c\2\2EF\7p\2\2FG\7v\2"+
		"\2GH\7q\2\2H\f\3\2\2\2IJ\7h\2\2JK\7c\2\2KL\7\u00e9\2\2LM\7c\2\2M\16\3"+
		"\2\2\2NO\7*\2\2O\20\3\2\2\2PQ\7+\2\2Q\22\3\2\2\2RS\7?\2\2S\24\3\2\2\2"+
		"TU\7g\2\2UV\7u\2\2VW\7e\2\2WX\7t\2\2XY\7g\2\2YZ\7x\2\2Z[\7c\2\2[\26\3"+
		"\2\2\2\\]\7n\2\2]^\7g\2\2^_\7k\2\2_`\7c\2\2`a\7*\2\2ab\7+\2\2b\30\3\2"+
		"\2\2cd\7-\2\2d\32\3\2\2\2ef\7/\2\2f\34\3\2\2\2gh\7,\2\2h\36\3\2\2\2ij"+
		"\7\61\2\2j \3\2\2\2kl\7?\2\2lm\7?\2\2m\"\3\2\2\2no\7#\2\2op\7?\2\2p$\3"+
		"\2\2\2qr\7@\2\2r&\3\2\2\2st\7>\2\2t(\3\2\2\2uv\7@\2\2vw\7?\2\2w*\3\2\2"+
		"\2xy\7>\2\2yz\7?\2\2z,\3\2\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2"+
		"~\177\3\2\2\2\177.\3\2\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\60\3\2\2"+
		"\2\u0085\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\31\2\2"+
		"\u008b\62\3\2\2\2\6\2~\u0083\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}