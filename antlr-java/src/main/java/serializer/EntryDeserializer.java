package serializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import dialect.Entry;

import java.io.IOException;

public class EntryDeserializer extends StdDeserializer<Entry>{
    public EntryDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Entry deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        Entry entry = new Entry();
        while(!entry.isComplete()){
            //this will consume the end_array tag,so the loop can not end correctly
            JsonToken jsonToken = jsonParser.nextToken();
            if(JsonToken.FIELD_NAME.equals(jsonToken)){
                String filedName = jsonParser.getCurrentName();
                //System.out.println(filedName);
                jsonToken = jsonParser.nextToken();
                if("placeHolder".equals(filedName)){
                    entry.setPlaceHolder(jsonParser.getValueAsString());
                }
                else if("context".equals(filedName)){
                    entry.setContext(jsonParser.getValueAsString());
                    jsonToken = jsonParser.nextToken();
                }
                else{
                    throw new IOException("illegal json file");
                }
            }
        }
        return entry;
    }
}


