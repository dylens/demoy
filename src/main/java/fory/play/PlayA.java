package fory.play;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PlayA {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        System.out.println("start time: " + sdf.format(new Date()));
        for (int i = 0; i < 100000; i++) {

        }
        System.out.println("end time: " + sdf.format(new Date()));

    }

}
