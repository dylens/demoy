package fory.gson.fifth.deserializer;

import com.google.gson.*;
import fory.gson.fifth.module.Author;

import java.lang.reflect.Type;

public class AuthorDeserializer implements JsonDeserializer<Author> {

    @Override
    public Author deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();

        final Author author = new Author();
        author.setId(jsonObject.get("id").getAsInt());

        JsonArray names = jsonObject.getAsJsonArray("names");
        author.setNames(new String[names.size()]);
        String[] authorNames = author.getNames();
        for (int i = 0; i < names.size(); i++) {
            authorNames[i]=names.get(i).getAsString();
        }
        return author;
    }
}
