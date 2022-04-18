package date;

import java.util.Date;

public class date1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        long time2 = System.currentTimeMillis();
        time2 += (60 * 60 + 121) *1000;

        Date d2 = new Date(time2);
        System.out.println(d2);
    }
}
