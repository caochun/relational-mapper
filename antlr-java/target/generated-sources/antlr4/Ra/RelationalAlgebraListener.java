// Generated from Ra/RelationalAlgebra.g4 by ANTLR 4.7.1
package Ra;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RelationalAlgebraParser}.
 */
public interface RelationalAlgebraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code selection}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSelection(RelationalAlgebraParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selection}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSelection(RelationalAlgebraParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rename}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRename(RelationalAlgebraParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rename}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRename(RelationalAlgebraParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftjoin}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLeftjoin(RelationalAlgebraParser.LeftjoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftjoin}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLeftjoin(RelationalAlgebraParser.LeftjoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code projection}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterProjection(RelationalAlgebraParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projection}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitProjection(RelationalAlgebraParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relation}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRelation(RelationalAlgebraParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relation}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRelation(RelationalAlgebraParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#renameExp}.
	 * @param ctx the parse tree
	 */
	void enterRenameExp(RelationalAlgebraParser.RenameExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#renameExp}.
	 * @param ctx the parse tree
	 */
	void exitRenameExp(RelationalAlgebraParser.RenameExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#newAttributes}.
	 * @param ctx the parse tree
	 */
	void enterNewAttributes(RelationalAlgebraParser.NewAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#newAttributes}.
	 * @param ctx the parse tree
	 */
	void exitNewAttributes(RelationalAlgebraParser.NewAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#newAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNewAttribute(RelationalAlgebraParser.NewAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#newAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNewAttribute(RelationalAlgebraParser.NewAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#newTableName}.
	 * @param ctx the parse tree
	 */
	void enterNewTableName(RelationalAlgebraParser.NewTableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#newTableName}.
	 * @param ctx the parse tree
	 */
	void exitNewTableName(RelationalAlgebraParser.NewTableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#leftJoinExp}.
	 * @param ctx the parse tree
	 */
	void enterLeftJoinExp(RelationalAlgebraParser.LeftJoinExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#leftJoinExp}.
	 * @param ctx the parse tree
	 */
	void exitLeftJoinExp(RelationalAlgebraParser.LeftJoinExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#projectionExp}.
	 * @param ctx the parse tree
	 */
	void enterProjectionExp(RelationalAlgebraParser.ProjectionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#projectionExp}.
	 * @param ctx the parse tree
	 */
	void exitProjectionExp(RelationalAlgebraParser.ProjectionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#selectionExp}.
	 * @param ctx the parse tree
	 */
	void enterSelectionExp(RelationalAlgebraParser.SelectionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#selectionExp}.
	 * @param ctx the parse tree
	 */
	void exitSelectionExp(RelationalAlgebraParser.SelectionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(RelationalAlgebraParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(RelationalAlgebraParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RelationalAlgebraParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RelationalAlgebraParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(RelationalAlgebraParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(RelationalAlgebraParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicOp(RelationalAlgebraParser.LogicOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#logicOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicOp(RelationalAlgebraParser.LogicOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(RelationalAlgebraParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(RelationalAlgebraParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#constVar}.
	 * @param ctx the parse tree
	 */
	void enterConstVar(RelationalAlgebraParser.ConstVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#constVar}.
	 * @param ctx the parse tree
	 */
	void exitConstVar(RelationalAlgebraParser.ConstVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RelationalAlgebraParser#constString}.
	 * @param ctx the parse tree
	 */
	void enterConstString(RelationalAlgebraParser.ConstStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RelationalAlgebraParser#constString}.
	 * @param ctx the parse tree
	 */
	void exitConstString(RelationalAlgebraParser.ConstStringContext ctx);
}