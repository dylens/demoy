package fory.gson.third.serializer;

import com.google.gson.*;
import fory.gson.third.module.Author;

import java.lang.reflect.Type;

public class AuthorSerializer implements JsonSerializer<Author> {

    @Override
    public JsonElement serialize(Author author, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jAuthor = new JsonObject();
        jAuthor.addProperty("idn", author.getId());

        //JsonObject->object; JsonArray->String[]/Boolean[]/Number[]/Character[]; JsonPrimitive->String/Boolean/Number/Character
        JsonArray jNames = new JsonArray();
        for (String name : author.getNames()) {
            jNames.add(new JsonPrimitive(name));
        }
        jAuthor.add("namess", jNames);
        return jAuthor;
    }
}
