package test1;

import java.math.BigDecimal;

public class tast3 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal a2 = BigDecimal.valueOf(b);
        BigDecimal c = a1.add(a2);//加
        //BigDecimal c = a1.subtract(a2);//减
        //BigDecimal c = a1.multiply(a2);//乘
        //BigDecimal c = a1.divide(a2);//除
        double rs = c.doubleValue();
        System.out.println(rs);
    }
}
