package com.atguigu03.date.exer2;

import java.time.LocalDateTime;

/**
 * ClassName: LocalDateTimeTest
 * Package: com.atguigu03.date.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 19:20
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println(localDateTime1);
    }
}
