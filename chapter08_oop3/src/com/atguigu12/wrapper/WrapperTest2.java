package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest2
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/15 12:56
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class WrapperTest2 {
    /*

     基本数据类型、包装类 ---> String类型：①调用String的重载的静态方法valueOf(xxx xx)
                                ②：基本数据类型 + ""
     String类型 ---> 基本数据类型、包装类:调用包装类的静态方法：parseXxx()
     */

    //String类型 ---> 基本数据类型、包装类:
    @Test
    public void test2(){
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        Integer ii1 = Integer.parseInt(s1);
        System.out.println(i1 + 10);
        System.out.println(ii1);
        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);



//        String s3 = "123a";
//        int i2 = Integer.parseInt(s3);//NumberFormatException
//        System.out.println(i2);


    }
    @Test
    public void test1(){
        int i1 = 10;
        Integer ii1 = i1;
        //方式一：调用String的重载的静态方法valueOf(xxx xx)
        System.out.println(String.valueOf(i1));  //将i1转成String类型
        System.out.println(String.valueOf(ii1));

        //方式二：基本数据类型 + ""
        System.out.println(i1 + "");
        System.out.println(ii1 + "");

    }
}
