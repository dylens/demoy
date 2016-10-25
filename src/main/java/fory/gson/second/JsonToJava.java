package fory.gson.second;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fory.gson.second.module.Book;
import fory.gson.second.serialiser.BookSerialiser;

public class JsonToJava {

    public static void main(String[] args){
        GsonBuilder builder=new GsonBuilder();
        builder.registerTypeAdapter(Book.class, new BookSerialiser());
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        Book book=new Book();
        book.setTitle("go game");
        book.setIsbn10("is bn 10");
        book.setAuthors(new String[]{"a","b"});

        System.out.println(gson.toJson(book));
    }

}
