package fory.play;

public class PlayD {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(2016));

        //is leap year
        System.out.println(2016 & 3);//Ϊ0����4�ı���
        //&&
        //(
        System.out.println(2016 % 100 != 0);
        //||
        System.out.println(2016 % 400 == 0);
        //)
    }

}
