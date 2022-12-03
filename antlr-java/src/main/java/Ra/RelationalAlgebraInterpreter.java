
package Ra;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static Ra.RelationalAlgebraParser.*;

public class RelationalAlgebraInterpreter extends RelationalAlgebraBaseVisitor {
    @Override
    public String visitNewAttributes(NewAttributesContext ctx) {
        StringJoiner subQuery = new StringJoiner(" ");
        while(ctx.newAttributes() != null){
            subQuery.add(visitNewAttribute(ctx.newAttribute()))
                    .add(",");
            ctx = ctx.newAttributes();
        }
        subQuery.add(visitNewAttribute(ctx.newAttribute()));
        return subQuery.toString();
    }

    @Override
    public String visitNewAttribute(NewAttributeContext ctx) {
        return ctx == null ? "" : ctx.getChild(0).getText() + " " + ctx.getChild(1).getText();
    }


    @Override
    public String visitRename(RenameContext ctx){
        String exp = visit(ctx.exp()).toString();
        StringJoiner  subQuery = new StringJoiner(" ");
        Object renamePairs = visit(ctx.renameExp().newAttributes());
        //rename the staff
        subQuery.add("SELECT")
                .add(renamePairs.toString())
                .add("FROM")
                .add(exp)
                .add("AS")
                .add(ctx.renameExp().newTableName().getText());
        String queryToRenameAttr = subQuery.toString();
        return queryToRenameAttr;
    }


    @Override
    public String visitProjection(ProjectionContext ctx) {
        StringJoiner subQuery = new StringJoiner(" ");
        String attributes = ctx.projectionExp().attributes().getText();
        Object exp = visit(ctx.projectionExp().exp());

        //later we should focus on subquery like π a (π a, b R);
        //if nested, a temp table will be needed
        subQuery.add("SELECT")
                .add(attributes)
                .add("FROM")
                .add(exp.toString());
        StringBuilder query = new StringBuilder();
        query.append(subQuery.toString());
        return query.toString();
    }

    @Override
    public String visitSelection(RelationalAlgebraParser.SelectionContext ctx) {
        StringJoiner subQuery = new StringJoiner(" ");
        ConditionsContext condCtx = ctx.selectionExp().conditions();
        Object conditions = visit(ctx.selectionExp().conditions());
        Object exp = visit(ctx.selectionExp().exp());

        // if the select operation is the outer operation
        if (!isNested(ctx)) {
            subQuery.add("SELECT")
                    .add("*")
                    .add("FROM");
        }
        subQuery.add(exp.toString())
                .add("WHERE")
                .add(conditions.toString());

        return subQuery.toString();
    }

    @Override
    public String visitLeftjoin(LeftjoinContext ctx) {
        StringJoiner subQuery = new StringJoiner(" ");
        Object lhs = visit(ctx.exp(0));
        Object leftJoinExp = visitLeftJoinExp(ctx.leftJoinExp());
        Object rhs = visit(ctx.exp(1));
        if (!isNested(ctx)) {
            subQuery.add("SELECT")
                    .add("*")
                    .add("FROM");
        }
        subQuery.add(lhs.toString())
                .add(leftJoinExp.toString())
                .add(rhs.toString());
        if (ctx.leftJoinExp().conditions() != null) {
            Object conditions = visit(ctx.leftJoinExp().conditions());
            subQuery.add("ON")
                    .add(conditions.toString());
        }
        return subQuery.toString();
    }

    @Override
    public String visitRelation(RelationContext ctx) {
        if(isNested(ctx)) {
            return ctx.getText();
        }
        else{
            StringJoiner subQuery = new StringJoiner(" ");
            subQuery.add("SELECT")
                    .add("*")
                    .add("FROM")
                    .add(ctx.getText());
            return subQuery.toString();
        }
    }


    @Override
    public String visitConditions(ConditionsContext ctx) {
        StringJoiner conditions = new StringJoiner(" ");
        while (ctx != null) {
            Object cond = visit(ctx.condition());
            conditions.add(cond.toString());
            if (ctx.logicOp() != null) {
                if (ctx.logicOp().OR() != null)
                    conditions.add("OR");
                else
                    conditions.add("AND");
            }
            ctx = ctx.conditions();
        }
        return conditions.toString();
    }

    @Override
    public String visitCondition(ConditionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLeftJoinExp(LeftJoinExpContext ctx) {
        return "LEFT JOIN";
    }

    private boolean isNested(ParserRuleContext ctx){
        return ctx.parent != null;
    }

}

