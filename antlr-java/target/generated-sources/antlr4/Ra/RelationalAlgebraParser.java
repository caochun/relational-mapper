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
		PROJECTION=8, LEFT_OUTER_JOIN=9, AND=10, OR=11, DOT=12, COMMA=13, QUOTA=14, 
		SINGLE_QUOTA=15, LP=16, RP=17, SEMI=18, NUMBER=19, STRING=20, WS=21;
	public static final int
		RULE_exp = 0, RULE_groupbyExp = 1, RULE_renameExp = 2, RULE_newAttributes = 3, 
		RULE_newAttribute = 4, RULE_leftJoinExp = 5, RULE_projectionExp = 6, RULE_selectionExp = 7, 
		RULE_conditions = 8, RULE_condition = 9, RULE_attributes = 10, RULE_logicOp = 11, 
		RULE_attribute = 12, RULE_dialect = 13, RULE_casestmts = 14, RULE_casestmt = 15, 
		RULE_constVar = 16, RULE_constString = 17;
	public static final String[] ruleNames = {
		"exp", "groupbyExp", "renameExp", "newAttributes", "newAttribute", "leftJoinExp", 
		"projectionExp", "selectionExp", "conditions", "condition", "attributes", 
		"logicOp", "attribute", "dialect", "casestmts", "casestmt", "constVar", 
		"constString"
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTION:
				{
				_localctx = new SelectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37);
				selectionExp();
				}
				break;
			case PROJECTION:
				{
				_localctx = new ProjectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				projectionExp();
				}
				break;
			case RENAME:
				{
				_localctx = new RenameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				renameExp();
				setState(40);
				exp(4);
				}
				break;
			case STRING:
				{
				_localctx = new RelationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(STRING);
				}
				break;
			case GROUP_BY:
				{
				_localctx = new GroupbyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				groupbyExp();
				setState(44);
				exp(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new LeftjoinContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(48);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(49);
						leftJoinExp();
						setState(50);
						exp(6);
						}
						break;
					case 2:
						{
						_localctx = new UnionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(52);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(53);
						match(UNION);
						setState(54);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(59);
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
		enterRule(_localctx, 2, RULE_groupbyExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(GROUP_BY);
			setState(61);
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
		enterRule(_localctx, 4, RULE_renameExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(RENAME);
			setState(64);
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
		enterRule(_localctx, 6, RULE_newAttributes);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				newAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				newAttribute();
				setState(68);
				match(COMMA);
				setState(69);
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
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(RelationalAlgebraParser.STRING, 0); }
		public ConstStringContext constString() {
			return getRuleContext(ConstStringContext.class,0);
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
		enterRule(_localctx, 8, RULE_newAttribute);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIALECT:
			case CASE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				attribute();
				setState(74);
				match(STRING);
				}
				break;
			case SINGLE_QUOTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				constString();
				setState(77);
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
		enterRule(_localctx, 10, RULE_leftJoinExp);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(LEFT_OUTER_JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(LEFT_OUTER_JOIN);
				setState(83);
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
		enterRule(_localctx, 12, RULE_projectionExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(PROJECTION);
			setState(87);
			attributes();
			setState(88);
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
		enterRule(_localctx, 14, RULE_selectionExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(SELECTION);
			setState(91);
			conditions();
			setState(92);
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
		enterRule(_localctx, 16, RULE_conditions);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				condition();
				setState(96);
				logicOp();
				setState(97);
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
		enterRule(_localctx, 18, RULE_condition);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				attribute();
				setState(102);
				match(RELOP);
				setState(103);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				constVar();
				setState(106);
				match(RELOP);
				setState(107);
				attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				attribute();
				setState(110);
				match(RELOP);
				setState(111);
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
		enterRule(_localctx, 20, RULE_attributes);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				attribute();
				setState(117);
				match(COMMA);
				setState(118);
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
		enterRule(_localctx, 22, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		public DialectContext dialect() {
			return getRuleContext(DialectContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_attribute);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(STRING);
				setState(125);
				match(DOT);
				setState(126);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(CASE);
				setState(129);
				match(LP);
				setState(130);
				casestmts();
				setState(131);
				match(RP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				dialect();
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
		enterRule(_localctx, 26, RULE_dialect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(DIALECT);
			setState(137);
			match(LP);
			setState(138);
			match(NUMBER);
			setState(139);
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
		enterRule(_localctx, 28, RULE_casestmts);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				casestmt();
				setState(142);
				match(SEMI);
				setState(143);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				casestmt();
				setState(146);
				match(SEMI);
				setState(147);
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
		enterRule(_localctx, 30, RULE_casestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			conditions();
			setState(152);
			match(COMMA);
			setState(153);
			attribute();
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
		public TerminalNode NUMBER() { return getToken(RelationalAlgebraParser.NUMBER, 0); }
		public ConstStringContext constString() {
			return getRuleContext(ConstStringContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_constVar);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(NUMBER);
				}
				break;
			case SINGLE_QUOTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				constString();
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
		enterRule(_localctx, 34, RULE_constString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(SINGLE_QUOTA);
			setState(160);
			match(STRING);
			setState(161);
			match(SINGLE_QUOTA);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3"+
		"\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nf\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13t\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\5\f{\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0098\n\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\5\22\u00a0\n\22\3\23\3\23\3\23\3\23\3\23\2\3\2\24\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$\2\3\3\2\f\r\2\u00a5\2\60\3\2\2\2\4>\3\2\2"+
		"\2\6A\3\2\2\2\bI\3\2\2\2\nQ\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20\\\3\2\2"+
		"\2\22e\3\2\2\2\24s\3\2\2\2\26z\3\2\2\2\30|\3\2\2\2\32\u0088\3\2\2\2\34"+
		"\u008a\3\2\2\2\36\u0097\3\2\2\2 \u0099\3\2\2\2\"\u009f\3\2\2\2$\u00a1"+
		"\3\2\2\2&\'\b\2\1\2\'\61\5\20\t\2(\61\5\16\b\2)*\5\6\4\2*+\5\2\2\6+\61"+
		"\3\2\2\2,\61\7\26\2\2-.\5\4\3\2./\5\2\2\4/\61\3\2\2\2\60&\3\2\2\2\60("+
		"\3\2\2\2\60)\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\61;\3\2\2\2\62\63\f\7\2\2"+
		"\63\64\5\f\7\2\64\65\5\2\2\b\65:\3\2\2\2\66\67\f\3\2\2\678\7\3\2\28:\5"+
		"\2\2\49\62\3\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2"+
		"\2=;\3\2\2\2>?\7\4\2\2?@\5\26\f\2@\5\3\2\2\2AB\7\b\2\2BC\5\b\5\2C\7\3"+
		"\2\2\2DJ\5\n\6\2EF\5\n\6\2FG\7\17\2\2GH\5\b\5\2HJ\3\2\2\2ID\3\2\2\2IE"+
		"\3\2\2\2J\t\3\2\2\2KL\5\32\16\2LM\7\26\2\2MR\3\2\2\2NO\5$\23\2OP\7\26"+
		"\2\2PR\3\2\2\2QK\3\2\2\2QN\3\2\2\2R\13\3\2\2\2SW\7\13\2\2TU\7\13\2\2U"+
		"W\5\22\n\2VS\3\2\2\2VT\3\2\2\2W\r\3\2\2\2XY\7\n\2\2YZ\5\26\f\2Z[\5\2\2"+
		"\2[\17\3\2\2\2\\]\7\t\2\2]^\5\22\n\2^_\5\2\2\2_\21\3\2\2\2`f\5\24\13\2"+
		"ab\5\24\13\2bc\5\30\r\2cd\5\22\n\2df\3\2\2\2e`\3\2\2\2ea\3\2\2\2f\23\3"+
		"\2\2\2gh\5\32\16\2hi\7\7\2\2ij\5\32\16\2jt\3\2\2\2kl\5\"\22\2lm\7\7\2"+
		"\2mn\5\32\16\2nt\3\2\2\2op\5\32\16\2pq\7\7\2\2qr\5\"\22\2rt\3\2\2\2sg"+
		"\3\2\2\2sk\3\2\2\2so\3\2\2\2t\25\3\2\2\2u{\5\32\16\2vw\5\32\16\2wx\7\17"+
		"\2\2xy\5\26\f\2y{\3\2\2\2zu\3\2\2\2zv\3\2\2\2{\27\3\2\2\2|}\t\2\2\2}\31"+
		"\3\2\2\2~\177\7\26\2\2\177\u0080\7\16\2\2\u0080\u0089\7\26\2\2\u0081\u0089"+
		"\7\26\2\2\u0082\u0083\7\6\2\2\u0083\u0084\7\22\2\2\u0084\u0085\5\36\20"+
		"\2\u0085\u0086\7\23\2\2\u0086\u0089\3\2\2\2\u0087\u0089\5\34\17\2\u0088"+
		"~\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\33\3\2\2\2\u008a\u008b\7\5\2\2\u008b\u008c\7\22\2\2\u008c\u008d"+
		"\7\25\2\2\u008d\u008e\7\23\2\2\u008e\35\3\2\2\2\u008f\u0090\5 \21\2\u0090"+
		"\u0091\7\24\2\2\u0091\u0092\5\32\16\2\u0092\u0098\3\2\2\2\u0093\u0094"+
		"\5 \21\2\u0094\u0095\7\24\2\2\u0095\u0096\5\36\20\2\u0096\u0098\3\2\2"+
		"\2\u0097\u008f\3\2\2\2\u0097\u0093\3\2\2\2\u0098\37\3\2\2\2\u0099\u009a"+
		"\5\22\n\2\u009a\u009b\7\17\2\2\u009b\u009c\5\32\16\2\u009c!\3\2\2\2\u009d"+
		"\u00a0\7\25\2\2\u009e\u00a0\5$\23\2\u009f\u009d\3\2\2\2\u009f\u009e\3"+
		"\2\2\2\u00a0#\3\2\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\7\26\2\2\u00a3"+
		"\u00a4\7\21\2\2\u00a4%\3\2\2\2\16\609;IQVesz\u0088\u0097\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}