package fory.gson.fifth.module;

import java.util.Arrays;

public class Book {

    private String isbn10;

    private String title;

    private Author[] authors;

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn10='" + isbn10 + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}