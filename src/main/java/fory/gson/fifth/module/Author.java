package fory.gson.fifth.module;

import java.util.Arrays;

public class Author {

    private int id;

    private String[] names;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", names=" + Arrays.toString(names) +
                '}';
    }
}
