// Generated from Ra/Projection.g4 by ANTLR 4.7.1
package Ra;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProjectionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProjectionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code projection}
	 * labeled alternative in {@link ProjectionParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(ProjectionParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleRelation}
	 * labeled alternative in {@link ProjectionParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRelation(ProjectionParser.SimpleRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectionParser#projectionExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectionExp(ProjectionParser.ProjectionExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectionParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(ProjectionParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectionParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ProjectionParser.AttributeContext ctx);
}