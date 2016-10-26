package fory.gson.fifth;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fory.gson.fifth.deserializer.AuthorDeserializer;
import fory.gson.fifth.deserializer.BookDeserializer;
import fory.gson.fifth.module.Author;
import fory.gson.fifth.module.Book;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Book.class, new BookDeserializer());
        builder.registerTypeAdapter(Author.class, new AuthorDeserializer());
        Gson gson = builder.create();

        try (Reader reader = new InputStreamReader(Main.class.getResourceAsStream("/book2.json"), "UTF-8")) {
            final Book book = gson.fromJson(reader, Book.class);
            System.out.println(book);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
