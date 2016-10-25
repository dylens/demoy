package fory.gson.second.serialiser;

import com.google.gson.*;
import fory.gson.second.module.Book;

import java.lang.reflect.Type;

public class BookSerialiser implements JsonSerializer<Book> {

    @Override
    public JsonElement serialize(final Book book, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", book.getTitle());
        jsonObject.addProperty("isbn-10", book.getIsbn10());

//        final JsonElement jsonAuthors=context.serialize(book.getAuthors());
//        jsonObject.add("authors",jsonAuthors);

        JsonArray jsonArray = new JsonArray();
        for (String author : book.getAuthors()) {
            JsonPrimitive jAuthor=new JsonPrimitive(author);
            jsonArray.add(jAuthor);
        }
        jsonObject.add("authors", jsonArray);

        return jsonObject;
    }
}
