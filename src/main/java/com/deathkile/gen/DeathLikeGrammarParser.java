package com.deathkile.gen;// Generated from C:/Users/a4tec/IdeaProjects/DeathLikeCompiler\DeathLikeGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DeathLikeGrammarParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_digit_expression = 3, 
		RULE_boolean_expression = 4, RULE_type = 5, RULE_type_cast = 6, RULE_assign_var = 7, 
		RULE_assign_var_method_invocation = 8, RULE_operations = 9, RULE_reasign_var = 10, 
		RULE_print = 11, RULE_while_cicle = 12, RULE_if_else = 13, RULE_for_cicle = 14, 
		RULE_signature = 15, RULE_subprogram_return = 16, RULE_subprogram_non_return = 17, 
		RULE_block_return = 18, RULE_block_non_return = 19, RULE_signature_method_invokation = 20, 
		RULE_method_invokation = 21, RULE_global_program = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "digit_expression", "boolean_expression", 
			"type", "type_cast", "assign_var", "assign_var_method_invocation", "operations", 
			"reasign_var", "print", "while_cicle", "if_else", "for_cicle", "signature", 
			"subprogram_return", "subprogram_non_return", "block_return", "block_non_return", 
			"signature_method_invokation", "method_invokation", "global_program"
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

	@Override
	public String getGrammarFileName() { return "DeathLikeGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DeathLikeGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(DeathLikeGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(DeathLikeGrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(BEGIN);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << WHILE) | (1L << FOR) | (1L << CONST) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public Assign_var_method_invocationContext assign_var_method_invocation() {
			return getRuleContext(Assign_var_method_invocationContext.class,0);
		}
		public While_cicleContext while_cicle() {
			return getRuleContext(While_cicleContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public Method_invokationContext method_invokation() {
			return getRuleContext(Method_invokationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public For_cicleContext for_cicle() {
			return getRuleContext(For_cicleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				assign_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				operations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				assign_var_method_invocation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				while_cicle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				if_else();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				method_invokation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				print();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				for_cicle();
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

	public static class Digit_expressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DeathLikeGrammarParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(DeathLikeGrammarParser.NUMBER, 0); }
		public TerminalNode NOT_WHOLE_NUMBER() { return getToken(DeathLikeGrammarParser.NOT_WHOLE_NUMBER, 0); }
		public TerminalNode MULTIPLY() { return getToken(DeathLikeGrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(DeathLikeGrammarParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(DeathLikeGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DeathLikeGrammarParser.MINUS, 0); }
		public TerminalNode PROCENT() { return getToken(DeathLikeGrammarParser.PROCENT, 0); }
		public TerminalNode EXPONENTIATION() { return getToken(DeathLikeGrammarParser.EXPONENTIATION, 0); }
		public Digit_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterDigit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitDigit_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitDigit_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digit_expressionContext digit_expression() throws RecognitionException {
		return digit_expression(0);
	}

	private Digit_expressionContext digit_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Digit_expressionContext _localctx = new Digit_expressionContext(_ctx, _parentState);
		Digit_expressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_digit_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(69);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(70);
				match(O_BRACKET);
				setState(71);
				digit_expression(0);
				setState(72);
				match(C_BRACKET);
				}
				break;
			case NUMBER:
				{
				setState(74);
				match(NUMBER);
				}
				break;
			case NOT_WHOLE_NUMBER:
				{
				setState(75);
				match(NOT_WHOLE_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Digit_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
					setState(78);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(79);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << PROCENT) | (1L << EXPONENTIATION))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(80);
					digit_expression(6);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(DeathLikeGrammarParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(DeathLikeGrammarParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(DeathLikeGrammarParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(DeathLikeGrammarParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(DeathLikeGrammarParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(DeathLikeGrammarParser.GREATER_OR_EQUALS, 0); }
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(DeathLikeGrammarParser.NEGATION, 0); }
		public TerminalNode AND() { return getToken(DeathLikeGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(DeathLikeGrammarParser.OR, 0); }
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		return boolean_expression(0);
	}

	private Boolean_expressionContext boolean_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, _parentState);
		Boolean_expressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_boolean_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(87);
				digit_expression(0);
				setState(88);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				digit_expression(0);
				}
				break;
			case 2:
				{
				setState(91);
				match(O_BRACKET);
				setState(92);
				boolean_expression(0);
				setState(93);
				match(C_BRACKET);
				}
				break;
			case 3:
				{
				setState(95);
				match(NEGATION);
				setState(96);
				boolean_expression(4);
				}
				break;
			case 4:
				{
				setState(97);
				match(T__1);
				}
				break;
			case 5:
				{
				setState(98);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Boolean_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
						setState(101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(102);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NON_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						boolean_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Boolean_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
						setState(104);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(105);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						boolean_expression(2);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DeathLikeGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DeathLikeGrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(DeathLikeGrammarParser.DOUBLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE))) != 0)) ) {
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

	public static class Type_castContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_castContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterType_cast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitType_cast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitType_cast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_castContext type_cast() throws RecognitionException {
		Type_castContext _localctx = new Type_castContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(O_BRACKET);
			{
			setState(115);
			type();
			}
			setState(116);
			match(C_BRACKET);
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

	public static class Assign_varContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DeathLikeGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DeathLikeGrammarParser.ID, i);
		}
		public TerminalNode SEPARATOR() { return getToken(DeathLikeGrammarParser.SEPARATOR, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public Type_castContext type_cast() {
			return getRuleContext(Type_castContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public TerminalNode CONST() { return getToken(DeathLikeGrammarParser.CONST, 0); }
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(118);
				match(CONST);
				}
			}

			setState(121);
			type();
			setState(122);
			match(ID);
			setState(123);
			match(T__3);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(124);
				match(ID);
				}
				break;
			case 2:
				{
				setState(125);
				digit_expression(0);
				}
				break;
			case 3:
				{
				setState(126);
				type_cast();
				setState(127);
				match(O_BRACKET);
				setState(128);
				digit_expression(0);
				setState(129);
				match(C_BRACKET);
				}
				break;
			}
			setState(133);
			match(SEPARATOR);
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

	public static class Assign_var_method_invocationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DeathLikeGrammarParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(DeathLikeGrammarParser.SEPARATOR, 0); }
		public Method_invokationContext method_invokation() {
			return getRuleContext(Method_invokationContext.class,0);
		}
		public Type_castContext type_cast() {
			return getRuleContext(Type_castContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public TerminalNode CONST() { return getToken(DeathLikeGrammarParser.CONST, 0); }
		public Assign_var_method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterAssign_var_method_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitAssign_var_method_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitAssign_var_method_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_var_method_invocationContext assign_var_method_invocation() throws RecognitionException {
		Assign_var_method_invocationContext _localctx = new Assign_var_method_invocationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_var_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(135);
				match(CONST);
				}
			}

			setState(138);
			type();
			setState(139);
			match(ID);
			setState(140);
			match(T__3);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				{
				setState(141);
				method_invokation();
				}
				break;
			case O_BRACKET:
				{
				setState(142);
				type_cast();
				setState(143);
				match(O_BRACKET);
				setState(144);
				method_invokation();
				setState(145);
				match(C_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(149);
			match(SEPARATOR);
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

	public static class OperationsContext extends ParserRuleContext {
		public Reasign_varContext reasign_var() {
			return getRuleContext(Reasign_varContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(DeathLikeGrammarParser.SEPARATOR, 0); }
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			reasign_var();
			setState(152);
			match(SEPARATOR);
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

	public static class Reasign_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DeathLikeGrammarParser.ID, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public Type_castContext type_cast() {
			return getRuleContext(Type_castContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public Reasign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reasign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterReasign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitReasign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitReasign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reasign_varContext reasign_var() throws RecognitionException {
		Reasign_varContext _localctx = new Reasign_varContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_reasign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ID);
			setState(155);
			match(T__3);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				digit_expression(0);
				}
				break;
			case 2:
				{
				setState(157);
				type_cast();
				setState(158);
				match(O_BRACKET);
				setState(159);
				digit_expression(0);
				setState(160);
				match(C_BRACKET);
				}
				break;
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(DeathLikeGrammarParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public TerminalNode SEPARATOR() { return getToken(DeathLikeGrammarParser.SEPARATOR, 0); }
		public TerminalNode ID() { return getToken(DeathLikeGrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(DeathLikeGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(DeathLikeGrammarParser.STRING, 0); }
		public TerminalNode NOT_WHOLE_NUMBER() { return getToken(DeathLikeGrammarParser.NOT_WHOLE_NUMBER, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(PRINT);
			setState(165);
			match(O_BRACKET);
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << NOT_WHOLE_NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			match(C_BRACKET);
			setState(168);
			match(SEPARATOR);
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

	public static class While_cicleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DeathLikeGrammarParser.WHILE, 0); }
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public While_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterWhile_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitWhile_cicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitWhile_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cicleContext while_cicle() throws RecognitionException {
		While_cicleContext _localctx = new While_cicleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(WHILE);
			setState(171);
			match(O_BRACKET);
			{
			setState(172);
			boolean_expression(0);
			}
			setState(173);
			match(C_BRACKET);
			setState(174);
			block();
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DeathLikeGrammarParser.IF, 0); }
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DeathLikeGrammarParser.ELSE, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IF);
			setState(177);
			match(O_BRACKET);
			{
			setState(178);
			boolean_expression(0);
			}
			setState(179);
			match(C_BRACKET);
			setState(180);
			block();
			setState(181);
			match(ELSE);
			setState(182);
			block();
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

	public static class For_cicleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DeathLikeGrammarParser.FOR, 0); }
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(DeathLikeGrammarParser.SEPARATOR, 0); }
		public Reasign_varContext reasign_var() {
			return getRuleContext(Reasign_varContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterFor_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitFor_cicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitFor_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cicleContext for_cicle() throws RecognitionException {
		For_cicleContext _localctx = new For_cicleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FOR);
			setState(185);
			match(O_BRACKET);
			setState(186);
			assign_var();
			setState(187);
			boolean_expression(0);
			setState(188);
			match(SEPARATOR);
			setState(189);
			reasign_var();
			setState(190);
			match(C_BRACKET);
			setState(191);
			block();
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(DeathLikeGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DeathLikeGrammarParser.ID, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(193);
			match(O_BRACKET);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					type();
					setState(195);
					match(ID);
					setState(196);
					match(T__4);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			{
			setState(203);
			type();
			setState(204);
			match(ID);
			}
			setState(206);
			match(C_BRACKET);
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

	public static class Subprogram_returnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DeathLikeGrammarParser.ID, 0); }
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public Subprogram_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterSubprogram_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitSubprogram_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitSubprogram_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_returnContext subprogram_return() throws RecognitionException {
		Subprogram_returnContext _localctx = new Subprogram_returnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subprogram_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__5);
			setState(209);
			type();
			setState(210);
			match(ID);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(211);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(212);
				match(O_BRACKET);
				setState(213);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(216);
			block_return();
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

	public static class Subprogram_non_returnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DeathLikeGrammarParser.ID, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Block_non_returnContext block_non_return() {
			return getRuleContext(Block_non_returnContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public Subprogram_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterSubprogram_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitSubprogram_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitSubprogram_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_non_returnContext subprogram_non_return() throws RecognitionException {
		Subprogram_non_returnContext _localctx = new Subprogram_non_returnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_subprogram_non_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__5);
			setState(219);
			match(ID);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(220);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(221);
				match(O_BRACKET);
				setState(222);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(225);
				block_non_return();
				}
				break;
			case 2:
				{
				setState(226);
				block();
				}
				break;
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

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(DeathLikeGrammarParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(DeathLikeGrammarParser.RETURN, 0); }
		public TerminalNode SEPARATOR() { return getToken(DeathLikeGrammarParser.SEPARATOR, 0); }
		public TerminalNode END() { return getToken(DeathLikeGrammarParser.END, 0); }
		public TerminalNode ID() { return getToken(DeathLikeGrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(DeathLikeGrammarParser.NUMBER, 0); }
		public TerminalNode NOT_WHOLE_NUMBER() { return getToken(DeathLikeGrammarParser.NOT_WHOLE_NUMBER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterBlock_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitBlock_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(BEGIN);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << WHILE) | (1L << FOR) | (1L << CONST) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(230);
				statement();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(RETURN);
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << NOT_WHOLE_NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(238);
			match(SEPARATOR);
			setState(239);
			match(END);
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

	public static class Block_non_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(DeathLikeGrammarParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(DeathLikeGrammarParser.RETURN, 0); }
		public TerminalNode SEPARATOR() { return getToken(DeathLikeGrammarParser.SEPARATOR, 0); }
		public TerminalNode END() { return getToken(DeathLikeGrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterBlock_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitBlock_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitBlock_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_non_returnContext block_non_return() throws RecognitionException {
		Block_non_returnContext _localctx = new Block_non_returnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block_non_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(BEGIN);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << WHILE) | (1L << FOR) | (1L << CONST) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(242);
				statement();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(RETURN);
			setState(249);
			match(SEPARATOR);
			setState(250);
			match(END);
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

	public static class Signature_method_invokationContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(DeathLikeGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DeathLikeGrammarParser.ID, i);
		}
		public Signature_method_invokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_method_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterSignature_method_invokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitSignature_method_invokation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitSignature_method_invokation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_method_invokationContext signature_method_invokation() throws RecognitionException {
		Signature_method_invokationContext _localctx = new Signature_method_invokationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_signature_method_invokation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(252);
			match(O_BRACKET);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					match(ID);
					setState(254);
					match(T__4);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			{
			setState(260);
			match(ID);
			}
			setState(261);
			match(C_BRACKET);
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

	public static class Method_invokationContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(DeathLikeGrammarParser.CALL, 0); }
		public TerminalNode ID() { return getToken(DeathLikeGrammarParser.ID, 0); }
		public Signature_method_invokationContext signature_method_invokation() {
			return getRuleContext(Signature_method_invokationContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(DeathLikeGrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(DeathLikeGrammarParser.C_BRACKET, 0); }
		public Method_invokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterMethod_invokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitMethod_invokation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitMethod_invokation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invokationContext method_invokation() throws RecognitionException {
		Method_invokationContext _localctx = new Method_invokationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_method_invokation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(CALL);
			setState(264);
			match(ID);
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(265);
				signature_method_invokation();
				}
				break;
			case 2:
				{
				{
				setState(266);
				match(O_BRACKET);
				setState(267);
				match(C_BRACKET);
				}
				}
				break;
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

	public static class Global_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<Assign_varContext> assign_var() {
			return getRuleContexts(Assign_varContext.class);
		}
		public Assign_varContext assign_var(int i) {
			return getRuleContext(Assign_varContext.class,i);
		}
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public List<Subprogram_non_returnContext> subprogram_non_return() {
			return getRuleContexts(Subprogram_non_returnContext.class);
		}
		public Subprogram_non_returnContext subprogram_non_return(int i) {
			return getRuleContext(Subprogram_non_returnContext.class,i);
		}
		public List<Subprogram_returnContext> subprogram_return() {
			return getRuleContexts(Subprogram_returnContext.class);
		}
		public Subprogram_returnContext subprogram_return(int i) {
			return getRuleContext(Subprogram_returnContext.class,i);
		}
		public Global_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).enterGlobal_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeathLikeGrammarListener ) ((DeathLikeGrammarListener)listener).exitGlobal_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DeathLikeGrammarVisitor ) return ((DeathLikeGrammarVisitor<? extends T>)visitor).visitGlobal_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_programContext global_program() throws RecognitionException {
		Global_programContext _localctx = new Global_programContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_global_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				setState(272);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case DOUBLE:
				case CONST:
					{
					setState(270);
					assign_var();
					}
					break;
				case ID:
					{
					setState(271);
					operations();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			program();
			1
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(279);
					subprogram_non_return();
					}
					break;
				case 2:
					{
					setState(280);
					subprogram_return();
					}
					break;
				}
				}
				setState(285);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return digit_expression_sempred((Digit_expressionContext)_localctx, predIndex);
		case 4:
			return boolean_expression_sempred((Boolean_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean digit_expression_sempred(Digit_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean boolean_expression_sempred(Boolean_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0121\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3\5\7"+
		"\5T\n\5\f\5\16\5W\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\5\tz\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0086\n\t\3\t\3\t\3\n\5\n\u008b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0096\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00c9\n\21\f\21\16"+
		"\21\u00cc\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00d9\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00e2\n\23\3"+
		"\23\3\23\5\23\u00e6\n\23\3\24\3\24\7\24\u00ea\n\24\f\24\16\24\u00ed\13"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00f6\n\25\f\25\16\25\u00f9"+
		"\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0102\n\26\f\26\16\26\u0105"+
		"\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u010f\n\27\3\30\3"+
		"\30\7\30\u0113\n\30\f\30\16\30\u0116\13\30\3\30\3\30\3\30\3\30\7\30\u011c"+
		"\n\30\f\30\16\30\u011f\13\30\3\30\2\4\b\n\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\t\3\2\37$\3\2(-\3\2()\3\2&\'\3\2\r\17\3\2\32\35"+
		"\4\2\32\32\34\35\2\u012d\2\60\3\2\2\2\4\63\3\2\2\2\6D\3\2\2\2\bN\3\2\2"+
		"\2\ne\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20y\3\2\2\2\22\u008a\3\2\2\2\24\u0099"+
		"\3\2\2\2\26\u009c\3\2\2\2\30\u00a6\3\2\2\2\32\u00ac\3\2\2\2\34\u00b2\3"+
		"\2\2\2\36\u00ba\3\2\2\2 \u00c3\3\2\2\2\"\u00d2\3\2\2\2$\u00dc\3\2\2\2"+
		"&\u00e7\3\2\2\2(\u00f3\3\2\2\2*\u00fe\3\2\2\2,\u0109\3\2\2\2.\u0114\3"+
		"\2\2\2\60\61\7\3\2\2\61\62\5\4\3\2\62\3\3\2\2\2\63\67\7\n\2\2\64\66\5"+
		"\6\4\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29"+
		"\67\3\2\2\2:;\7\13\2\2;\5\3\2\2\2<E\5\20\t\2=E\5\24\13\2>E\5\22\n\2?E"+
		"\5\32\16\2@E\5\34\17\2AE\5,\27\2BE\5\30\r\2CE\5\36\20\2D<\3\2\2\2D=\3"+
		"\2\2\2D>\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\7"+
		"\3\2\2\2FG\b\5\1\2GO\7\32\2\2HI\7.\2\2IJ\5\b\5\2JK\7/\2\2KO\3\2\2\2LO"+
		"\7\34\2\2MO\7\35\2\2NF\3\2\2\2NH\3\2\2\2NL\3\2\2\2NM\3\2\2\2OU\3\2\2\2"+
		"PQ\f\7\2\2QR\t\2\2\2RT\5\b\5\bSP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2"+
		"V\t\3\2\2\2WU\3\2\2\2XY\b\6\1\2YZ\5\b\5\2Z[\t\3\2\2[\\\5\b\5\2\\f\3\2"+
		"\2\2]^\7.\2\2^_\5\n\6\2_`\7/\2\2`f\3\2\2\2ab\7%\2\2bf\5\n\6\6cf\7\4\2"+
		"\2df\7\5\2\2eX\3\2\2\2e]\3\2\2\2ea\3\2\2\2ec\3\2\2\2ed\3\2\2\2fo\3\2\2"+
		"\2gh\f\t\2\2hi\t\4\2\2in\5\n\6\njk\f\3\2\2kl\t\5\2\2ln\5\n\6\4mg\3\2\2"+
		"\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2\2\2qo\3\2\2\2rs\t\6"+
		"\2\2s\r\3\2\2\2tu\7.\2\2uv\5\f\7\2vw\7/\2\2w\17\3\2\2\2xz\7\22\2\2yx\3"+
		"\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5\f\7\2|}\7\32\2\2}\u0085\7\6\2\2~\u0086"+
		"\7\32\2\2\177\u0086\5\b\5\2\u0080\u0081\5\16\b\2\u0081\u0082\7.\2\2\u0082"+
		"\u0083\5\b\5\2\u0083\u0084\7/\2\2\u0084\u0086\3\2\2\2\u0085~\3\2\2\2\u0085"+
		"\177\3\2\2\2\u0085\u0080\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\27"+
		"\2\2\u0088\21\3\2\2\2\u0089\u008b\7\22\2\2\u008a\u0089\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\5\f\7\2\u008d\u008e\7\32\2\2"+
		"\u008e\u0095\7\6\2\2\u008f\u0096\5,\27\2\u0090\u0091\5\16\b\2\u0091\u0092"+
		"\7.\2\2\u0092\u0093\5,\27\2\u0093\u0094\7/\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\27"+
		"\2\2\u0098\23\3\2\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\27\2\2\u009b"+
		"\25\3\2\2\2\u009c\u009d\7\32\2\2\u009d\u00a4\7\6\2\2\u009e\u00a5\5\b\5"+
		"\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\7.\2\2\u00a1\u00a2\5\b\5\2\u00a2\u00a3"+
		"\7/\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5"+
		"\27\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\7.\2\2\u00a8\u00a9\t\7\2\2"+
		"\u00a9\u00aa\7/\2\2\u00aa\u00ab\7\27\2\2\u00ab\31\3\2\2\2\u00ac\u00ad"+
		"\7\20\2\2\u00ad\u00ae\7.\2\2\u00ae\u00af\5\n\6\2\u00af\u00b0\7/\2\2\u00b0"+
		"\u00b1\5\4\3\2\u00b1\33\3\2\2\2\u00b2\u00b3\7\23\2\2\u00b3\u00b4\7.\2"+
		"\2\u00b4\u00b5\5\n\6\2\u00b5\u00b6\7/\2\2\u00b6\u00b7\5\4\3\2\u00b7\u00b8"+
		"\7\24\2\2\u00b8\u00b9\5\4\3\2\u00b9\35\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb"+
		"\u00bc\7.\2\2\u00bc\u00bd\5\20\t\2\u00bd\u00be\5\n\6\2\u00be\u00bf\7\27"+
		"\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1\7/\2\2\u00c1\u00c2\5\4\3\2\u00c2"+
		"\37\3\2\2\2\u00c3\u00ca\7.\2\2\u00c4\u00c5\5\f\7\2\u00c5\u00c6\7\32\2"+
		"\2\u00c6\u00c7\7\7\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\5\f\7\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\7/\2\2\u00d1!\3\2\2\2\u00d2\u00d3\7\b\2\2\u00d3\u00d4"+
		"\5\f\7\2\u00d4\u00d8\7\32\2\2\u00d5\u00d9\5 \21\2\u00d6\u00d7\7.\2\2\u00d7"+
		"\u00d9\7/\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00db\5&\24\2\u00db#\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00e1"+
		"\7\32\2\2\u00de\u00e2\5 \21\2\u00df\u00e0\7.\2\2\u00e0\u00e2\7/\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e6\5("+
		"\25\2\u00e4\u00e6\5\4\3\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"%\3\2\2\2\u00e7\u00eb\7\n\2\2\u00e8\u00ea\5\6\4\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\26\2\2\u00ef\u00f0\t\b\2\2"+
		"\u00f0\u00f1\7\27\2\2\u00f1\u00f2\7\13\2\2\u00f2\'\3\2\2\2\u00f3\u00f7"+
		"\7\n\2\2\u00f4\u00f6\5\6\4\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\7\27\2\2\u00fc\u00fd\7\13\2\2\u00fd"+
		")\3\2\2\2\u00fe\u0103\7.\2\2\u00ff\u0100\7\32\2\2\u0100\u0102\7\7\2\2"+
		"\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\32\2\2"+
		"\u0107\u0108\7/\2\2\u0108+\3\2\2\2\u0109\u010a\7\25\2\2\u010a\u010e\7"+
		"\32\2\2\u010b\u010f\5*\26\2\u010c\u010d\7.\2\2\u010d\u010f\7/\2\2\u010e"+
		"\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010f-\3\2\2\2\u0110\u0113\5\20\t\2"+
		"\u0111\u0113\5\24\13\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\5\2\2\2\u0118\u011d\b\30\1\2\u0119\u011c\5"+
		"$\23\2\u011a\u011c\5\"\22\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e/\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\32\67DNUemoy\u0085\u008a\u0095\u00a4\u00ca\u00d8"+
		"\u00e1\u00e5\u00eb\u00f7\u0103\u010e\u0112\u0114\u011b\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}