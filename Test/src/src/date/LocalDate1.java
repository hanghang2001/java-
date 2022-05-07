package date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDate1 {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println(nowDate);
        int year = nowDate.getYear();
        System.out.println(year);
    }
}
