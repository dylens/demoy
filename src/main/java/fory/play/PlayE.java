package fory.play;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PlayE {

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        gson.toJson("Hello", System.out);
        gson.toJson(123, System.out);
    }

}
