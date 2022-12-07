package Ra;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void testGroupByWithSelection(){
        String line = " γ a, b σ a = 0 R";
        String out = "SELECT * FROM R WHERE a=0 GROUP BY a , b";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    void testGroupBy(){
        String line = "γ a, b R";
        String out = "SELECT * FROM R GROUP BY a , b";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    void testCaseWhen(){
        String line = "ρ ψ(a=b, a; a=c, '1'; b) t R";
        String out = "SELECT CASE WHEN a=b THEN a WHEN a=c THEN '1' ELSE b END t FROM R";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    public void testSimpleProjection(){
        String line = "π a R";
        String out = "SELECT a FROM R";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }
    @Test
    public void testSimpleSelection(){
        String line = "σ a > 0 R";
        String out = "SELECT * FROM R WHERE a>0";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    public void testSelectionWithLogicOp(){
        String line = "σ a > 0 ∧ b < 0 R";
        String out = "SELECT * FROM R WHERE a>0 AND b<0";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    public void testSelectionCombinedProjection(){
        String line = "π a σ a > 0 ∧ b < 0 R";
        String out = "SELECT a FROM R WHERE a>0 AND b<0";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    public void testLeftJoin(){
        String line = "R ⟕ T";
        String out = "SELECT * FROM R LEFT JOIN T";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    public void testLeftJoinOn(){
        String line = "R ⟕ a = b T";
        String out = "SELECT * FROM R LEFT JOIN T ON a=b";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    public void testDoubleLeftJoinOn(){
        String line = "R ⟕ a = b T ⟕ a = c R";
        String out = "SELECT * FROM R LEFT JOIN T ON a=b LEFT JOIN R ON a=c";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    public void testTableAccess(){
        String line = "π R.a, R.c R";
        String out = "SELECT R.a , R.c FROM R";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }

    @Test
    public void testRename(){
        String line = "ρ a a1, c c1, id id1 R";
        String out = "SELECT a a1 , c c1 , id id1 FROM R";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        assertEquals(out, query);
    }
}