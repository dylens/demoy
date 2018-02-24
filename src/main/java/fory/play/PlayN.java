package fory.play;

import java.util.ArrayList;
import java.util.List;

public class PlayN {

    public static void main(String[] args) {
//        PlayN n = new PlayN(new N() {
//            @Override
//            public void play(Object o) {
//                System.out.println(o.toString());
//            }
//        });
//        n = new PlayN(n1 -> {
//        });

        List<Rate> rates = new PlayN().getRates();
        for (Rate rate : rates) {
            if (rate.getA() != 0) {
                rate.setA(rate.getA() + 1);
                break;
            }
        }

        for (Rate rate : rates) {
            System.out.println(rate.getA() + " " + rate.getB());
        }
    }

    private List<Rate> getRates() {
        List<Rate> rates = new ArrayList<>();
        rates.add(new Rate(0, 0));
        rates.add(new Rate(1, 1));
        rates.add(new Rate(1, 1));

        return rates;
    }

    class Rate {
        int a;
        int b;

        Rate(int a1, int b1) {
            a = a1;
            b = b1;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
}