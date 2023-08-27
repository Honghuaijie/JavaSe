package com.atguigu03.date.exer2;

import java.util.Calendar;

/**
 * ClassName: CalendarTest
 * Package: com.atguigu03.date.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 19:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println(calendar.getTime());

    }
}
