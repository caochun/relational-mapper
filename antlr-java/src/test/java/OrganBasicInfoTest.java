import Ra.RelationalAlgebraInterpreter;
import Ra.RelationalAlgebraLexer;
import Ra.RelationalAlgebraParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganBasicInfoTest {

//SELECTION : 'σ';
//PROJECTION : 'π';
//LEFTJOIN : '⟕' // different form left outer join
//AND : '∧';
//OR : '∨';
//RENAME : 'ρ';

    @Test
    public void testSimpleProjection(){
        //σ T2.ORGN_RELA_RELA_TYP = 'RPTT'
        String line = "ρ t T3.B01BH PAYMENT_CODE, T1.ORGN_NUM ORGANKEY σ T2.ORGN_RELA_RELA_TYP = 'RPTT' T1 ⟕ T1.ORGN_NUM = T2.ORGN_NUM T2 ⟕ T1.ORGN_NUM = T3.B01AA T3";
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
}
