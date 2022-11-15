package Ra;

import java.util.StringJoiner;

public class ProjInterpreter extends ProjectionBaseVisitor{
    @Override
    public String visitProjection(ProjectionParser.ProjectionContext ctx) {
        StringJoiner subQuery = new StringJoiner(" ");
        String attributes = ctx.projectionExp().attributes().getText();
        // Object expr = visit(ctx.projectionExpr().expr());
        // later we should focus on subquery like π a (π a, b) R;
        subQuery.add("SELECT").add(attributes).add("FROM").add(ctx.projectionExp().exp().getText());
        StringBuilder query = new StringBuilder();
        query.append(subQuery.toString());
        return query.toString();
    }
}
