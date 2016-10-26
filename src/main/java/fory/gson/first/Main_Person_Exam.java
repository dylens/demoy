package fory.gson.first;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fory.gson.first.module.Person;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main_Person_Exam {

    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Main_Person_Exam.class.getResourceAsStream("/server.json");
        try(Reader reader = new InputStreamReader(resourceAsStream, "UTF-8")){
            Gson gson = new GsonBuilder().create();
            Person p = gson.fromJson(reader, Person.class);
            System.out.println(p);
        }
    }

}
