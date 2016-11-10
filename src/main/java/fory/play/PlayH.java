package fory.play;

import java.math.BigDecimal;

public class PlayH {

    public static void main(String[] args) {
        //四舍五入，逢5奇进偶舍
        System.out.println(BigDecimal.valueOf(1.115).setScale(2, BigDecimal.ROUND_HALF_EVEN));//1.12
        System.out.println(BigDecimal.valueOf(1.125).setScale(2, BigDecimal.ROUND_HALF_EVEN));//1.12
        System.out.println(BigDecimal.valueOf(1.135).setScale(2, BigDecimal.ROUND_HALF_EVEN));//1.14
        System.out.println(BigDecimal.valueOf(1.145).setScale(2, BigDecimal.ROUND_HALF_EVEN));//1.14
        System.out.println(BigDecimal.valueOf(1.155).setScale(2, BigDecimal.ROUND_HALF_EVEN));//1.16
    }

}
