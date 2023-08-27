package com.atguigu03.date.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * ClassName: DateTimeTest
 * Package: com.atguigu03.date.jdk8
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 18:28
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class DateTimeTest {


    /**
     * JDK8中的 localDate\ LocalTime \ LocalDateTime
     *
     */

    @Test
    public void test1(){
        //now() 获取当前日期和时间对应的实例
        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);  //2023-08-25
        System.out.println(localTime);  //18:31:59.117
        System.out.println(localDateTime);  //2023-08-25T18:31:59.117

        //of() 获取指定的日期、时间的实例
        LocalDate localDate1 = LocalDate.of(2020, 8, 25);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 8, 25, 18, 31, 59,1);
        System.out.println(localDate1);
        System.out.println(localDateTime1);
        System.out.println(localDate1.getMonth());
        System.out.println(localDateTime1.getMonthValue());
    }

    @Test
    public void test2(){
        //getXXX
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getDayOfMonth());

        //withXXX  体现了不可变性
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(15);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);

        //plusXXX
        LocalDateTime localDateTime2 = localDateTime.plusDays(10);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //isLeapYear() 判断是否是闰年


    }

    /**
     * instant
     */

    @Test
    public void test3(){
        Instant instant = Instant.now();
        System.out.println(instant);//2023-08-25T10:58:16.190Z  会比中国的时间少8个小时

        //了解
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime); //2023-08-25T19:00:51.105+08:00

        Instant instant1 = Instant.ofEpochMilli(15645564654532L);
        System.out.println(instant1);  //2465-10-14T22:10:54.532Z

        System.out.println(instant1.toEpochMilli());  //15645564654532

    }

    /**
     * DateTimeFormatter
     */

    @Test
    public void test4(){
        //自定义的格式：ofPattern("yyyy-MM-dd hh:mm:ss")
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        //格式化： 日期、时间 -->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateTiemStr = dateTimeFormatter.format(localDateTime);
        System.out.println(dateTiemStr);

        //解析： 字符串-->日期、时 间
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse("2023-08-25 12:08:54");
        LocalDateTime localDateTime1 = LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime1);  //2023-08-25T12:08:54
    }
}
