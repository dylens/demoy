package fory.play;

public class PlayM {

    public static void main(String[] args) {
        String a = "1";
        System.out.println("1" == a);//true

        /*
        -----------------------------------------
         */
        String b = "a";
        String b1 = "1" + b;
//        b1.intern();
        System.out.println(b1 == "1a");//false

//        String b = "a";
//        String b1 = "1" + b;
//        b1.intern();
//        System.out.println(b1 == "1a");//true

        /*
        -----------------------------------------
         */
        String c = "c";
        String d = "d";
        System.out.println("cd" == "c" + "d");//true
        System.out.println("cd" == c + d);//false
        System.out.println("cd" == (c+d).intern());//true

    }
}