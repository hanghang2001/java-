package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date2 {
    public static void main(String[] args) {
        Date d1 =new Date();
        System.out.println(d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss EEE a");
        String rs = sdf.format(d1);
        System.out.println(rs);
    }
}
