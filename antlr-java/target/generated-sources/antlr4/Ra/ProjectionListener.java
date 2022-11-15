// Generated from Ra/Projection.g4 by ANTLR 4.7.1
package Ra;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectionParser}.
 */
public interface ProjectionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code projection}
	 * labeled alternative in {@link ProjectionParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterProjection(ProjectionParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projection}
	 * labeled alternative in {@link ProjectionParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitProjection(ProjectionParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleRelation}
	 * labeled alternative in {@link ProjectionParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRelation(ProjectionParser.SimpleRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleRelation}
	 * labeled alternative in {@link ProjectionParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRelation(ProjectionParser.SimpleRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectionParser#projectionExp}.
	 * @param ctx the parse tree
	 */
	void enterProjectionExp(ProjectionParser.ProjectionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectionParser#projectionExp}.
	 * @param ctx the parse tree
	 */
	void exitProjectionExp(ProjectionParser.ProjectionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectionParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(ProjectionParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectionParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(ProjectionParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectionParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ProjectionParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectionParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ProjectionParser.AttributeContext ctx);
}