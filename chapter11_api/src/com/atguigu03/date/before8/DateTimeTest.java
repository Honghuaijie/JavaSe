package com.atguigu03.date.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Package: com.atguigu03.date.before8
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 16:02
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class DateTimeTest {
    /**
     * Date类的使用
     *
     * |-- java.util.Date
     *    > 两个构造器的使用
     *    > 两个方法的使用：①toString ②long getTime()
     *      |-- java.sql.Date：对应着数据库中的date类型
     *
     */

    @Test
    public void test1(){
        Date date1 = new Date(); //创建一个基于当前系统的Date实例
        System.out.println(date1.toString());
        System.out.println(date1.getTime());  //1692950970579

        Date date2 = new Date(1292950970579L);
        System.out.println(date2);

    }

    @Test
    public void test2(){
        java.sql.Date date1 = new java.sql.Date(1292950970579L);
        System.out.println(date1);
        System.out.println(date1.getTime());
    }


    /**
     *
     * SimpleDateFormat类:用于日期时间的格式化和解析
     *
     * 格式化： 日期 -->字符串
     * 解析：  字符串 --> 日期
     */

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date1 = new Date();
        //格式化： 日期 -->字符串
        String strDate = sdf.format(date1);
        System.out.println(strDate);  //23-8-25 下午4:32

        //解析：  字符串 --> 日期
        Date date2 = sdf.parse("23-8-25 下午5:32" );
        System.out.println(date2);

    }

    @Test
    public void test4() throws ParseException, InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //手动传入一个日期格式
        Date date1 = new Date();
        //格式化： 日期 -->字符串
        String strDate = sdf.format(date1);
        System.out.println(strDate);
        Thread.sleep(1000);
        //解析：  字符串 --> 日期
        Date date2 = sdf.parse(sdf.format(new Date()) );
//        Date date3 = sdf.parse("23-8-25 下午5:32" ); //解析失败，因为传入的参数字符串不符合当前可以识别的格式
        System.out.println(date2);

    }

    /**
     * Calender 日历类（抽象类）
     * ①实例化 由于Calendar是一个抽象类，所以我们需要创建其子类的实例。这里我们通过Calendar的静态方法
     *          getInstance() 获取
     * ② 常用方法：
     *      get(int field)
     *      set(int field,xx)
     *      add(int field,xx)
     *      Date getTime();
     *      setTime(Date);
     *
     *
     *
     */
    @Test
    public void test5(){
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getClass());
        //get(int field)
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        //set(int field,xx)
        calendar.set(Calendar.DAY_OF_MONTH, 26);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add(int field,xx)
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //Date getTime();  Calendar -->Date
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = calendar.getTime();
        String strDate = sdf.format(date);
        System.out.println(strDate);
        //setTime(Date);   Date 重置calendar里面的
        calendar.setTime(new Date());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        date = calendar.getTime();
        strDate = sdf.format(date);
        System.out.println(strDate);




    }
}
