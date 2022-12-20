// Generated from Ra/RelationalAlgebra.g4 by ANTLR 4.7.1
package Ra;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RelationalAlgebraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RelationalAlgebraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code innerjoin}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerjoin(RelationalAlgebraParser.InnerjoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selection}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(RelationalAlgebraParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rename}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(RelationalAlgebraParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftjoin}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftjoin(RelationalAlgebraParser.LeftjoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code projection}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(RelationalAlgebraParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupby}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby(RelationalAlgebraParser.GroupbyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code union}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(RelationalAlgebraParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relation}
	 * labeled alternative in {@link RelationalAlgebraParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(RelationalAlgebraParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#innerJoinExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoinExp(RelationalAlgebraParser.InnerJoinExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#groupbyExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupbyExp(RelationalAlgebraParser.GroupbyExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#renameExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameExp(RelationalAlgebraParser.RenameExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#newAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewAttributes(RelationalAlgebraParser.NewAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#newAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewAttribute(RelationalAlgebraParser.NewAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#leftJoinExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftJoinExp(RelationalAlgebraParser.LeftJoinExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#projectionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectionExp(RelationalAlgebraParser.ProjectionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#selectionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionExp(RelationalAlgebraParser.SelectionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(RelationalAlgebraParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(RelationalAlgebraParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#likeExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeExp(RelationalAlgebraParser.LikeExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(RelationalAlgebraParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#logicOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOp(RelationalAlgebraParser.LogicOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(RelationalAlgebraParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#dialect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialect(RelationalAlgebraParser.DialectContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#casestmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasestmts(RelationalAlgebraParser.CasestmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#casestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasestmt(RelationalAlgebraParser.CasestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#constVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVar(RelationalAlgebraParser.ConstVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RelationalAlgebraParser#constString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstString(RelationalAlgebraParser.ConstStringContext ctx);
}