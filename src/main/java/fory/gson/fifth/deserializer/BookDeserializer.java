package fory.gson.fifth.deserializer;

import com.google.gson.*;
import fory.gson.fifth.module.Author;
import fory.gson.fifth.module.Book;

import java.lang.reflect.Type;

public class BookDeserializer implements JsonDeserializer<Book>{

    @Override
    public Book deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();

        final String title = jsonObject.get("title").getAsString();
        final String isbn10 = jsonObject.get("isbn-10").getAsString();

        Author[] authors = context.deserialize(jsonObject.get("authors"), Author[].class);

        final Book book = new Book();
        book.setTitle(title);
        book.setIsbn10(isbn10);
        book.setAuthors(authors);
        return book;
    }
}
