package date;


import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);


        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int mm = cal.get(Calendar.MONTH) + 1;
        System.out.println(mm);
        int days = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        //修改
        //cal.set(Calendar.HOUR, 12);
        //System.out.println(cal);

        cal.add(Calendar.DAY_OF_YEAR,64);
        Date d = cal.getTime();
        System.out.println(d);
    }
}
