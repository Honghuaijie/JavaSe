package com.atguigu03.date.exer1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: DateToSqlTest
 * Package: com.atguigu03.date.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 17:13
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class DateToSqlTest {
//    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String sqlDate = sdf.format(date);
//        System.out.println(sqlDate);
//    }

    //    拓展：
//    将控制台获取的年月日（比如：2022-12-13）的字符串数据，保存在数据库中。
//            （简化为得到java.sql.Date的对象，此对象对应的时间为2022-12-13）。

    @Test
    public void test1() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年月日");
        String strDate = sc.next();
        //1.将日期格式确定好
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //2.将输入的日期 解析为Date类型
        Date date1 = sdf.parse(strDate);
        //3.获取输入日期的时间戳，作为参数传入sql的Date类中
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);

    }

}
