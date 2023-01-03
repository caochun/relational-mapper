package Ra;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import dialect.Entry;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import serializer.EntryDeserializer;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SqlGenerator {

    private List<Entry> dialects;

    private String fileName;

    public String format(String originRa){
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(originRa));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String sql = (String) interpreter.visit(tree);
        for(var entry : dialects){
            String regex = entry.placeHolder();
            regex = regex.replaceAll("\\(", "\\\\(");
            regex = regex.replaceAll("\\)", "\\\\)");
            sql = sql.replaceAll(regex, entry.context());
        }
        return sql;
    }

    public void initialize(){
        SimpleModule module = new SimpleModule("EntryDeserializer");
        module.addDeserializer(Entry.class,new EntryDeserializer(Entry.class));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(module);
        try {
            File file = new File(fileName);
            dialects = objectMapper.readValue(file, new TypeReference<List<Entry>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SqlGenerator(String fileName){
        this.fileName = fileName;
        initialize();
    }



}
