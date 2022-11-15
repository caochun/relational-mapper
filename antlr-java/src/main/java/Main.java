import Ra.ProjInterpreter;
import Ra.ProjectionBaseListener;
import Ra.ProjectionLexer;
import Ra.ProjectionParser;
import model.LogEntry;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String logLines = "2018-May-05 14:20:21 DEBUG entering awesome method\r\n" + "2018-May-05 14:20:24 ERROR Bad thing happened\r\n";
//        LogLexer serverLogLexer = new LogLexer(CharStreams.fromString(logLines));
//        CommonTokenStream tokens = new CommonTokenStream( serverLogLexer );
//        List<Token> tks = tokens.getTokens();
//        LogParser logParser = new LogParser(tokens);
//        ParseTreeWalker walker = new ParseTreeWalker();
//        LogListener logWalker = new MyListener();
//        walker.walk(logWalker, logParser.log());
//        LogEntry error = ((MyListener) logWalker).getEntries().get(1);
//        return;

        String projLine = "π a R";
        String out = "SELECT a FROM R";
        ProjectionLexer lexer = new ProjectionLexer(CharStreams.fromString(projLine));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProjectionParser parser = new ProjectionParser(tokens);
        ParseTree tree = parser.exp();
        ProjInterpreter interpreter = new ProjInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
    }
}