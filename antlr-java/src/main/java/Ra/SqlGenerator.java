package Ra;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import dialect.Entry;
import serializer.EntryDeserializer;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SqlGenerator {
    private String originSql;

    private List<Entry> dialects;

    private String fileName;

    public void resumeDialects(){
        SimpleModule module = new SimpleModule("EntryDeserializer");
        module.addDeserializer(Entry.class,new EntryDeserializer(Entry.class));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(module);
        System.out.println("new File(\".\").getPath() = " + new File(".").getAbsolutePath());
        try {
            File file = new File(fileName);
            dialects = objectMapper.readValue(file, new TypeReference<List<Entry>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SqlGenerator(String fileName){
        this.fileName = fileName;
    }

    public static void main(String args[]){
        SqlGenerator sqlGenerator = new SqlGenerator("dialect.json");
        sqlGenerator.resumeDialects();

    }


}
