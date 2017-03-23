package java1702.javase.oop;

import java.util.Calendar;

/**
 * Created by zhenya.1291813139.com
 * on 2017/3/23.
 * JavaSE_20171.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 0, 8);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
