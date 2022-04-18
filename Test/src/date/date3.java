package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date3 {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2021年08月06日 11：11：11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
        Date d = sdf.parse(dateStr);

        long time = d.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 +6) *1000;

        System.out.println(sdf.format(time));
    }
}
