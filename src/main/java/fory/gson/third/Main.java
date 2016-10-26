package fory.gson.third;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fory.gson.third.module.Author;
import fory.gson.third.module.Book;
import fory.gson.third.serializer.AuthorSerializer;
import fory.gson.third.serializer.BookSerializer;

public class Main {

    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Book.class, new BookSerializer());
        builder.registerTypeAdapter(Author.class, new AuthorSerializer());
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        Book book = new Book();
        book.setTitle("title");
        book.setIsbn10("isbn10");
        Author author1 = new Author();
        author1.setId(1);
        author1.setNames(new String[]{"first name", "middle name", "last name"});

        Author author2 = new Author();
        author2.setId(2);
        author2.setNames(new String[]{"first name2", "middle name2", "last name2"});
        book.setAuthors(new Author[]{author1, author2});

        System.out.println(gson.toJson(book));
    }

}
