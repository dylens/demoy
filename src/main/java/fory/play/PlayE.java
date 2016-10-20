package fory.play;

import java.time.LocalDate;

public class PlayE {

    public static void main(String[] args) {
        LocalDate parse = LocalDate.parse("2016-10-20");
        System.out.println(parse.toString());

        System.out.println(getDate("201610", 1));
    }

    public static String getDate(String yearMonth, int day) {
        LocalDate date = LocalDate.of(Integer.parseInt(yearMonth.substring(0, 4)), Integer.parseInt(yearMonth.substring(4)), day);
        return date.toString();
    }

}
