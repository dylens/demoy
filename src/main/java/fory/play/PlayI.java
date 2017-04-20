package fory.play;

import org.apache.commons.lang3.StringUtils;

public class PlayI {

    public static void main(String[] args) {
        String s1 = "P123D";
        String s2 = "123D";
        System.out.println(getR(s1));
        System.out.println(getR(s2));

        System.out.println();

        String s3 = "1P123D";
        String s4 = "1PAD";
        System.out.println(getR(s3));
        System.out.println(getR(s4));
    }

    private static String getR(String s) {
        return s.substring(getBeginIndexOfP(s), StringUtils.indexOf(s, "D"));
    }

    private static int getBeginIndexOfP(String s) {
        int indexOfP = StringUtils.indexOf(s, "P");
        return indexOfP >= 0 ? indexOfP + 1 : 0;
    }
}