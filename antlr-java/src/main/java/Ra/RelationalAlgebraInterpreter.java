
package Ra;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static Ra.RelationalAlgebraParser.*;

public class RelationalAlgebraInterpreter extends RelationalAlgebraBaseVisitor {

    @Override
    public String visitUnion(UnionContext ctx){
        StringJoiner subQuery = new StringJoiner("\n");
        Object lhs = visit(ctx.exp(0));
        Object rhs = visit(ctx.exp(1));
        subQuery.add(lhs.toString())
                .add("UNION")
                .add(rhs.toString());
        return subQuery.toString();
    }
    @Override
    public String visitNewAttributes(NewAttributesContext ctx) {
        StringJoiner subQuery = new StringJoiner(" ");

        while (ctx.newAttributes() != null) {
            subQuery.add(visit(ctx.newAttribute()).toString())
                    .add(",");
            ctx = ctx.newAttributes();
        }

        subQuery.add(visit(ctx.newAttribute()).toString());
        return subQuery.toString();
    }

    @Override
    public String visitNewAttribute(NewAttributeContext ctx) {
        if(ctx.attribute() == null) {
            return ctx == null ? "" : ctx.getChild(0).getText() + " " + ctx.getChild(1).getText();
        }
        else{
            return ctx == null ? "" : visit(ctx.attribute()).toString() + " " + ctx.getChild(1).getText();
        }
    }

    @Override
    public String visitAttributes(AttributesContext ctx) {
        StringJoiner attributes = new StringJoiner(" ");

        while (ctx.attributes() != null) {
            Object attribute = visit(ctx.attribute());
            attributes.add(attribute.toString())
                      .add(",");
            ctx = ctx.attributes();
        }

        Object attribute = visit(ctx.attribute());
        attributes.add(attribute.toString());
        return attributes.toString();
    }

    @Override
    public String visitAttribute(AttributeContext ctx){
        if(ctx.casestmts() == null && ctx.dialect() == null){
            return ctx.getText();
        }
        else if(ctx.dialect() != null){
            return ctx.getText();
        }
        else{
            StringJoiner attribute = new StringJoiner(" ");
            Object caseStmts = visitCasestmts(ctx.casestmts());
            attribute.add("CASE")
                    .add(caseStmts.toString())
                    .add("END");
            return attribute.toString();
        }
    }

    @Override
    public String visitCasestmts(CasestmtsContext ctx){
        StringJoiner caseStmts = new StringJoiner(" ");

        while(ctx.casestmts() != null){
            Object caseStmt = visitCasestmt(ctx.casestmt());
            caseStmts.add(caseStmt.toString());
            ctx = ctx.casestmts();
        }
        Object caseStmt = visitCasestmt(ctx.casestmt());
        Object attribute = visitAttribute(ctx.attribute());
        caseStmts.add(caseStmt.toString())
                .add("ELSE")
                .add(attribute.toString());

        return caseStmts.toString();
    }

    @Override
    public String visitCasestmt(CasestmtContext ctx){
        StringJoiner caseStmt = new StringJoiner(" ");
        Object conditions = visitConditions(ctx.conditions());
        Object attribute = visitAttribute(ctx.attribute());
        caseStmt.add("WHEN")
                .add(conditions.toString())
                .add("THEN")
                .add(attribute.toString());
        return caseStmt.toString();
    }



    @Override
    public String visitRename(RenameContext ctx) {
        String exp = visit(ctx.exp()).toString();
        StringJoiner subQuery = new StringJoiner(" ");
        Object renamePairs = visit(ctx.renameExp().newAttributes());
        //rename the staff
        subQuery.add("SELECT")
                .add(renamePairs.toString())
                .add("FROM")
                .add(exp);
        String queryToRenameAttr = subQuery.toString();
        return queryToRenameAttr;
    }


    @Override
    public String visitProjection(ProjectionContext ctx) {
        StringJoiner subQuery = new StringJoiner(" ");
        String attributes = visit(ctx.projectionExp().attributes()).toString();
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
    public String visitGroupby(GroupbyContext ctx){
        StringJoiner subQuery = new StringJoiner(" ");
        Object exp = visit(ctx.exp());
        Object attributts = visit(ctx.groupbyExp().attributes());

        // if the select operation is the outer operation
        if (!isNested(ctx)) {
            subQuery.add("SELECT")
                    .add("*")
                    .add("FROM");
        }
        subQuery.add(exp.toString())
                .add("GROUP BY")
                .add(attributts.toString());

        return subQuery.toString();
    }


    @Override
    public String visitSelection(SelectionContext ctx) {
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
        Object leftJoinExp = visit(ctx.leftJoinExp());
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
        if (isNested(ctx)) {
            return ctx.getText();
        } else {
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
        if(ctx.RELOP().getText().equals("λ"))
            return visit(ctx.getChild(0)).toString() + " LIKE " + visit(ctx.getChild(2)).toString();
        else
            return visit(ctx.getChild(0)).toString() + ctx.RELOP().getText() + visit(ctx.getChild(2)).toString();
    }

    @Override
    public String visitConstVar(ConstVarContext ctx){
        return ctx.getText();
    }


    @Override
    public String visitLeftJoinExp(LeftJoinExpContext ctx) {
        return "LEFT JOIN";
    }

    private boolean isNested(ParserRuleContext ctx) {
        return ctx.parent != null && ! (ctx instanceof GroupbyContext);
    }

}

