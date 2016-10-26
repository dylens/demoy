package fory.gson.fourth;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fory.gson.fourth.deserializer.BookDeserializer;
import fory.gson.fourth.module.Book;

import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws Exception {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Book.class, new BookDeserializer());
        Gson gson = gsonBuilder.create();

        try(Reader reader = new InputStreamReader(Main.class.getResourceAsStream("/book.json"), "UTF-8")){
            Book book = gson.fromJson(reader, Book.class);
            System.out.println(book);
        }
    }

}
