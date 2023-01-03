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
        String placeHolder = null;
        String context = null;
        while(context == null){
            //this will consume the end_array tag,so the loop can not end correctly
            JsonToken jsonToken = jsonParser.nextToken();
            if(JsonToken.FIELD_NAME.equals(jsonToken)){
                String filedName = jsonParser.getCurrentName();
                //System.out.println(filedName);
                jsonToken = jsonParser.nextToken();
                if("placeHolder".equals(filedName)){
                    placeHolder = jsonParser.getValueAsString();
                }
                else if("context".equals(filedName)){
                    context = jsonParser.getValueAsString();
                    jsonToken = jsonParser.nextToken();
                }
                else{
                    throw new IOException("illegal json file");
                }
            }
        }
        return new Entry(placeHolder, context);
    }
}


