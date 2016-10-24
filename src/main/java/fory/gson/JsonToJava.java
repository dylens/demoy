package fory.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fory.gson.module.Person;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class JsonToJava {

    public static void main(String[] args) throws IOException {
        try(Reader reader = new InputStreamReader(JsonToJava.class.getResourceAsStream("/server.json"), "UTF-8")){
            Gson gson = new GsonBuilder().create();
            Person p = gson.fromJson(reader, Person.class);
            System.out.println(p);
        }
    }

}
