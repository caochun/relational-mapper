// Generated from Ra/RelationalAlgebra.g4 by ANTLR 4.7.1
package Ra;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RelationalAlgebraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UNION=1, GROUP_BY=2, DIALECT=3, CASE=4, RELOP=5, RENAME=6, SELECTION=7, 
		PROJECTION=8, LEFT_OUTER_JOIN=9, INNER_JOIN=10, AND=11, OR=12, DOT=13, 
		COMMA=14, QUOTA=15, SINGLE_QUOTA=16, LP=17, RP=18, SEMI=19, NUMBER=20, 
		LIKE=21, STRING=22, WS=23;
	public static final int
		RULE_exp = 0, RULE_innerJoinExp = 1, RULE_groupbyExp = 2, RULE_renameExp = 3, 
		RULE_newAttributes = 4, RULE_newAttribute = 5, RULE_leftJoinExp = 6, RULE_projectionExp = 7, 
		RULE_selectionExp = 8, RULE_conditions = 9, RULE_condition = 10, RULE_likeExp = 11, 
		RULE_attributes = 12, RULE_logicOp = 13, RULE_attribute = 14, RULE_dialect = 15, 
		RULE_casestmts = 16, RULE_casestmt = 17, RULE_constVar = 18, RULE_constString = 19;
	public static final String[] ruleNames = {
		"exp", "innerJoinExp", "groupbyExp", "renameExp", "newAttributes", "newAttribute", 
		"leftJoinExp", "projectionExp", "selectionExp", "conditions", "condition", 
		"likeExp", "attributes", "logicOp", "attribute", "dialect", "casestmts", 
		"casestmt", "constVar", "constString"
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

	@Override
	public String getGrammarFileName() { return "RelationalAlgebra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RelationalAlgebraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InnerjoinContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public InnerJoinExpContext innerJoinExp() {
			return getRuleContext(InnerJoinExpContext.class,0);
		}
		public InnerjoinContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterInnerjoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitInnerjoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitInnerjoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectionContext extends ExpContext {
		public SelectionExpContext selectionExp() {
			return getRuleContext(SelectionExpContext.class,0);
		}
		public SelectionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameContext extends ExpContext {
		public RenameExpContext renameExp() {
			return getRuleContext(RenameExpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RenameContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftjoinContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LeftJoinExpContext leftJoinExp() {
			return getRuleContext(LeftJoinExpContext.class,0);
		}
		public LeftjoinContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterLeftjoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitLeftjoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitLeftjoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectionContext extends ExpContext {
		public ProjectionExpContext projectionExp() {
			return getRuleContext(ProjectionExpContext.class,0);
		}
		public ProjectionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupbyContext extends ExpContext {
		public GroupbyExpContext groupbyExp() {
			return getRuleContext(GroupbyExpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GroupbyContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterGroupby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitGroupby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitGroupby(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode UNION() { return getToken(RelationalAlgebraParser.UNION, 0); }
		public UnionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationContext extends ExpContext {
		public TerminalNode STRING() { return getToken(RelationalAlgebraParser.STRING, 0); }
		public RelationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTION:
				{
				_localctx = new SelectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(41);
				selectionExp();
				}
				break;
			case PROJECTION:
				{
				_localctx = new ProjectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				projectionExp();
				}
				break;
			case RENAME:
				{
				_localctx = new RenameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				renameExp();
				setState(44);
				exp(5);
				}
				break;
			case STRING:
				{
				_localctx = new RelationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(STRING);
				}
				break;
			case GROUP_BY:
				{
				_localctx = new GroupbyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				groupbyExp();
				setState(48);
				exp(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new LeftjoinContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(52);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(53);
						leftJoinExp();
						setState(54);
						exp(7);
						}
						break;
					case 2:
						{
						_localctx = new UnionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(56);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(57);
						match(UNION);
						setState(58);
						exp(3);
						}
						break;
					case 3:
						{
						_localctx = new InnerjoinContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(59);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(60);
						innerJoinExp();
						setState(61);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class InnerJoinExpContext extends ParserRuleContext {
		public TerminalNode INNER_JOIN() { return getToken(RelationalAlgebraParser.INNER_JOIN, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public InnerJoinExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerJoinExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterInnerJoinExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitInnerJoinExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitInnerJoinExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerJoinExpContext innerJoinExp() throws RecognitionException {
		InnerJoinExpContext _localctx = new InnerJoinExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_innerJoinExp);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(INNER_JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(INNER_JOIN);
				setState(70);
				conditions();
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

	public static class GroupbyExpContext extends ParserRuleContext {
		public TerminalNode GROUP_BY() { return getToken(RelationalAlgebraParser.GROUP_BY, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public GroupbyExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupbyExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterGroupbyExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitGroupbyExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitGroupbyExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupbyExpContext groupbyExp() throws RecognitionException {
		GroupbyExpContext _localctx = new GroupbyExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_groupbyExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(GROUP_BY);
			setState(74);
			attributes();
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

	public static class RenameExpContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(RelationalAlgebraParser.RENAME, 0); }
		public NewAttributesContext newAttributes() {
			return getRuleContext(NewAttributesContext.class,0);
		}
		public RenameExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterRenameExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitRenameExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitRenameExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameExpContext renameExp() throws RecognitionException {
		RenameExpContext _localctx = new RenameExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_renameExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(RENAME);
			setState(77);
			newAttributes();
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

	public static class NewAttributesContext extends ParserRuleContext {
		public NewAttributeContext newAttribute() {
			return getRuleContext(NewAttributeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RelationalAlgebraParser.COMMA, 0); }
		public NewAttributesContext newAttributes() {
			return getRuleContext(NewAttributesContext.class,0);
		}
		public NewAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterNewAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitNewAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitNewAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewAttributesContext newAttributes() throws RecognitionException {
		NewAttributesContext _localctx = new NewAttributesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_newAttributes);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				newAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				newAttribute();
				setState(81);
				match(COMMA);
				setState(82);
				newAttributes();
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

	public static class NewAttributeContext extends ParserRuleContext {
		public ConstVarContext constVar() {
			return getRuleContext(ConstVarContext.class,0);
		}
		public TerminalNode STRING() { return getToken(RelationalAlgebraParser.STRING, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public NewAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterNewAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitNewAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitNewAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewAttributeContext newAttribute() throws RecognitionException {
		NewAttributeContext _localctx = new NewAttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_newAttribute);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTA:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				constVar();
				setState(87);
				match(STRING);
				}
				break;
			case DIALECT:
			case CASE:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				attribute();
				setState(90);
				match(STRING);
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

	public static class LeftJoinExpContext extends ParserRuleContext {
		public TerminalNode LEFT_OUTER_JOIN() { return getToken(RelationalAlgebraParser.LEFT_OUTER_JOIN, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public LeftJoinExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftJoinExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterLeftJoinExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitLeftJoinExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitLeftJoinExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftJoinExpContext leftJoinExp() throws RecognitionException {
		LeftJoinExpContext _localctx = new LeftJoinExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_leftJoinExp);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(LEFT_OUTER_JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(LEFT_OUTER_JOIN);
				setState(96);
				conditions();
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

	public static class ProjectionExpContext extends ParserRuleContext {
		public TerminalNode PROJECTION() { return getToken(RelationalAlgebraParser.PROJECTION, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProjectionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterProjectionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitProjectionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitProjectionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionExpContext projectionExp() throws RecognitionException {
		ProjectionExpContext _localctx = new ProjectionExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_projectionExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PROJECTION);
			setState(100);
			attributes();
			setState(101);
			exp(0);
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

	public static class SelectionExpContext extends ParserRuleContext {
		public TerminalNode SELECTION() { return getToken(RelationalAlgebraParser.SELECTION, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SelectionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterSelectionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitSelectionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitSelectionExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionExpContext selectionExp() throws RecognitionException {
		SelectionExpContext _localctx = new SelectionExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectionExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(SELECTION);
			setState(104);
			conditions();
			setState(105);
			exp(0);
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

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LogicOpContext logicOp() {
			return getRuleContext(LogicOpContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditions);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				condition();
				setState(109);
				logicOp();
				setState(110);
				conditions();
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

	public static class ConditionContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(RelationalAlgebraParser.RELOP, 0); }
		public ConstVarContext constVar() {
			return getRuleContext(ConstVarContext.class,0);
		}
		public LikeExpContext likeExp() {
			return getRuleContext(LikeExpContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				attribute();
				setState(115);
				match(RELOP);
				setState(116);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				constVar();
				setState(119);
				match(RELOP);
				setState(120);
				attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				attribute();
				setState(123);
				match(RELOP);
				setState(124);
				constVar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				likeExp();
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

	public static class LikeExpContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(RelationalAlgebraParser.LIKE, 0); }
		public ConstVarContext constVar() {
			return getRuleContext(ConstVarContext.class,0);
		}
		public LikeExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterLikeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitLikeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitLikeExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeExpContext likeExp() throws RecognitionException {
		LikeExpContext _localctx = new LikeExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_likeExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			attribute();
			setState(130);
			match(LIKE);
			setState(131);
			constVar();
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

	public static class AttributesContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RelationalAlgebraParser.COMMA, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributes);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				attribute();
				setState(135);
				match(COMMA);
				setState(136);
				attributes();
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

	public static class LogicOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(RelationalAlgebraParser.AND, 0); }
		public TerminalNode OR() { return getToken(RelationalAlgebraParser.OR, 0); }
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitLogicOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class AttributeContext extends ParserRuleContext {
		public DialectContext dialect() {
			return getRuleContext(DialectContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(RelationalAlgebraParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(RelationalAlgebraParser.STRING, i);
		}
		public TerminalNode DOT() { return getToken(RelationalAlgebraParser.DOT, 0); }
		public TerminalNode CASE() { return getToken(RelationalAlgebraParser.CASE, 0); }
		public TerminalNode LP() { return getToken(RelationalAlgebraParser.LP, 0); }
		public CasestmtsContext casestmts() {
			return getRuleContext(CasestmtsContext.class,0);
		}
		public TerminalNode RP() { return getToken(RelationalAlgebraParser.RP, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attribute);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				dialect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(STRING);
				setState(144);
				match(DOT);
				setState(145);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(CASE);
				setState(148);
				match(LP);
				setState(149);
				casestmts();
				setState(150);
				match(RP);
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

	public static class DialectContext extends ParserRuleContext {
		public TerminalNode DIALECT() { return getToken(RelationalAlgebraParser.DIALECT, 0); }
		public TerminalNode LP() { return getToken(RelationalAlgebraParser.LP, 0); }
		public TerminalNode NUMBER() { return getToken(RelationalAlgebraParser.NUMBER, 0); }
		public TerminalNode RP() { return getToken(RelationalAlgebraParser.RP, 0); }
		public DialectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterDialect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitDialect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitDialect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DialectContext dialect() throws RecognitionException {
		DialectContext _localctx = new DialectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dialect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(DIALECT);
			setState(155);
			match(LP);
			setState(156);
			match(NUMBER);
			setState(157);
			match(RP);
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

	public static class CasestmtsContext extends ParserRuleContext {
		public CasestmtContext casestmt() {
			return getRuleContext(CasestmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RelationalAlgebraParser.SEMI, 0); }
		public ConstVarContext constVar() {
			return getRuleContext(ConstVarContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public CasestmtsContext casestmts() {
			return getRuleContext(CasestmtsContext.class,0);
		}
		public CasestmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterCasestmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitCasestmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitCasestmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasestmtsContext casestmts() throws RecognitionException {
		CasestmtsContext _localctx = new CasestmtsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_casestmts);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				casestmt();
				setState(160);
				match(SEMI);
				setState(161);
				constVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				casestmt();
				setState(164);
				match(SEMI);
				setState(165);
				attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				casestmt();
				setState(168);
				match(SEMI);
				setState(169);
				casestmts();
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

	public static class CasestmtContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RelationalAlgebraParser.COMMA, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ConstVarContext constVar() {
			return getRuleContext(ConstVarContext.class,0);
		}
		public CasestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterCasestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitCasestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitCasestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasestmtContext casestmt() throws RecognitionException {
		CasestmtContext _localctx = new CasestmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_casestmt);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				conditions();
				setState(174);
				match(COMMA);
				setState(175);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				conditions();
				setState(178);
				match(COMMA);
				setState(179);
				constVar();
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

	public static class ConstVarContext extends ParserRuleContext {
		public ConstStringContext constString() {
			return getRuleContext(ConstStringContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(RelationalAlgebraParser.NUMBER, 0); }
		public ConstVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterConstVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitConstVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitConstVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstVarContext constVar() throws RecognitionException {
		ConstVarContext _localctx = new ConstVarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constVar);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				constString();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(NUMBER);
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

	public static class ConstStringContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_QUOTA() { return getTokens(RelationalAlgebraParser.SINGLE_QUOTA); }
		public TerminalNode SINGLE_QUOTA(int i) {
			return getToken(RelationalAlgebraParser.SINGLE_QUOTA, i);
		}
		public TerminalNode STRING() { return getToken(RelationalAlgebraParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(RelationalAlgebraParser.NUMBER, 0); }
		public ConstStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).enterConstString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RelationalAlgebraListener ) ((RelationalAlgebraListener)listener).exitConstString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RelationalAlgebraVisitor ) return ((RelationalAlgebraVisitor<? extends T>)visitor).visitConstString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStringContext constString() throws RecognitionException {
		ConstStringContext _localctx = new ConstStringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constString);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(SINGLE_QUOTA);
				setState(188);
				match(STRING);
				setState(189);
				match(SINGLE_QUOTA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(SINGLE_QUOTA);
				setState(191);
				match(NUMBER);
				setState(192);
				match(SINGLE_QUOTA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(SINGLE_QUOTA);
				setState(194);
				match(SINGLE_QUOTA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\65\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2B\n\2\f\2\16"+
		"\2E\13\2\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\b\5\bd\n\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13s\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0082\n\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u008d\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009b\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00ae\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b8\n"+
		"\23\3\24\3\24\5\24\u00bc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00c6\n\25\3\25\2\3\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(\2\3\3\2\r\16\2\u00cc\2\64\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bN\3\2"+
		"\2\2\nV\3\2\2\2\f^\3\2\2\2\16c\3\2\2\2\20e\3\2\2\2\22i\3\2\2\2\24r\3\2"+
		"\2\2\26\u0081\3\2\2\2\30\u0083\3\2\2\2\32\u008c\3\2\2\2\34\u008e\3\2\2"+
		"\2\36\u009a\3\2\2\2 \u009c\3\2\2\2\"\u00ad\3\2\2\2$\u00b7\3\2\2\2&\u00bb"+
		"\3\2\2\2(\u00c5\3\2\2\2*+\b\2\1\2+\65\5\22\n\2,\65\5\20\t\2-.\5\b\5\2"+
		"./\5\2\2\7/\65\3\2\2\2\60\65\7\30\2\2\61\62\5\6\4\2\62\63\5\2\2\5\63\65"+
		"\3\2\2\2\64*\3\2\2\2\64,\3\2\2\2\64-\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2"+
		"\2\65C\3\2\2\2\66\67\f\b\2\2\678\5\16\b\289\5\2\2\t9B\3\2\2\2:;\f\4\2"+
		"\2;<\7\3\2\2<B\5\2\2\5=>\f\3\2\2>?\5\4\3\2?@\5\2\2\4@B\3\2\2\2A\66\3\2"+
		"\2\2A:\3\2\2\2A=\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EC\3"+
		"\2\2\2FJ\7\f\2\2GH\7\f\2\2HJ\5\24\13\2IF\3\2\2\2IG\3\2\2\2J\5\3\2\2\2"+
		"KL\7\4\2\2LM\5\32\16\2M\7\3\2\2\2NO\7\b\2\2OP\5\n\6\2P\t\3\2\2\2QW\5\f"+
		"\7\2RS\5\f\7\2ST\7\20\2\2TU\5\n\6\2UW\3\2\2\2VQ\3\2\2\2VR\3\2\2\2W\13"+
		"\3\2\2\2XY\5&\24\2YZ\7\30\2\2Z_\3\2\2\2[\\\5\36\20\2\\]\7\30\2\2]_\3\2"+
		"\2\2^X\3\2\2\2^[\3\2\2\2_\r\3\2\2\2`d\7\13\2\2ab\7\13\2\2bd\5\24\13\2"+
		"c`\3\2\2\2ca\3\2\2\2d\17\3\2\2\2ef\7\n\2\2fg\5\32\16\2gh\5\2\2\2h\21\3"+
		"\2\2\2ij\7\t\2\2jk\5\24\13\2kl\5\2\2\2l\23\3\2\2\2ms\5\26\f\2no\5\26\f"+
		"\2op\5\34\17\2pq\5\24\13\2qs\3\2\2\2rm\3\2\2\2rn\3\2\2\2s\25\3\2\2\2t"+
		"u\5\36\20\2uv\7\7\2\2vw\5\36\20\2w\u0082\3\2\2\2xy\5&\24\2yz\7\7\2\2z"+
		"{\5\36\20\2{\u0082\3\2\2\2|}\5\36\20\2}~\7\7\2\2~\177\5&\24\2\177\u0082"+
		"\3\2\2\2\u0080\u0082\5\30\r\2\u0081t\3\2\2\2\u0081x\3\2\2\2\u0081|\3\2"+
		"\2\2\u0081\u0080\3\2\2\2\u0082\27\3\2\2\2\u0083\u0084\5\36\20\2\u0084"+
		"\u0085\7\27\2\2\u0085\u0086\5&\24\2\u0086\31\3\2\2\2\u0087\u008d\5\36"+
		"\20\2\u0088\u0089\5\36\20\2\u0089\u008a\7\20\2\2\u008a\u008b\5\32\16\2"+
		"\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008d\33"+
		"\3\2\2\2\u008e\u008f\t\2\2\2\u008f\35\3\2\2\2\u0090\u009b\5 \21\2\u0091"+
		"\u0092\7\30\2\2\u0092\u0093\7\17\2\2\u0093\u009b\7\30\2\2\u0094\u009b"+
		"\7\30\2\2\u0095\u0096\7\6\2\2\u0096\u0097\7\23\2\2\u0097\u0098\5\"\22"+
		"\2\u0098\u0099\7\24\2\2\u0099\u009b\3\2\2\2\u009a\u0090\3\2\2\2\u009a"+
		"\u0091\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009b\37\3\2\2"+
		"\2\u009c\u009d\7\5\2\2\u009d\u009e\7\23\2\2\u009e\u009f\7\26\2\2\u009f"+
		"\u00a0\7\24\2\2\u00a0!\3\2\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7\25\2"+
		"\2\u00a3\u00a4\5&\24\2\u00a4\u00ae\3\2\2\2\u00a5\u00a6\5$\23\2\u00a6\u00a7"+
		"\7\25\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\5$\23"+
		"\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00a1\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae#\3\2\2\2"+
		"\u00af\u00b0\5\24\13\2\u00b0\u00b1\7\20\2\2\u00b1\u00b2\5\36\20\2\u00b2"+
		"\u00b8\3\2\2\2\u00b3\u00b4\5\24\13\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6"+
		"\5&\24\2\u00b6\u00b8\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8"+
		"%\3\2\2\2\u00b9\u00bc\5(\25\2\u00ba\u00bc\7\26\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\'\3\2\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf"+
		"\7\30\2\2\u00bf\u00c6\7\22\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\7\26\2"+
		"\2\u00c2\u00c6\7\22\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00c6\7\22\2\2\u00c5"+
		"\u00bd\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6)\3\2\2\2"+
		"\21\64ACIV^cr\u0081\u008c\u009a\u00ad\u00b7\u00bb\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}