package fory.gson.third.serialiser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import fory.gson.third.module.Book;

import java.lang.reflect.Type;

public class BookSerialiser implements JsonSerializer<Book> {

    @Override
    public JsonElement serialize(Book book, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jBook = new JsonObject();
        jBook.addProperty("title", book.getTitle());
        jBook.addProperty("isbn-10", book.getIsbn10());

        JsonElement JAuthors = context.serialize(book.getAuthors());
        jBook.add("authors", JAuthors);

        return jBook;
    }
}
