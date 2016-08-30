package fory.play;

import java.util.Date;

public class PlayB {

    public static void main(String[] args) {
        String ibcDate = "/Date(1467529200000-0700)/";
        String ibcDate2 = "/Date(1468576248354-0700)/";
        Date date = new Date(1467529200000l);

        System.out.print(date);
    }

}
