package com.atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringDemo1
 * Package: com.atguigu01.string
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/24 13:05
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StringDemo1 {

    /**
     * 测试String的连接符： +
     *
     */
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = "hello" + s2;  //自动调用了StringBuilder的toString方法（）相当于新建了一个对象
        String s6 =  s1 + "world";
        String s7 =  s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);

        System.out.println();
        String s8 = s5.intern();//inter返回的是字符串常量池中的字面量的地址
        System.out.println(s8 == s3);

    }

    @Test
    public void test2(){
        final String s1 = "hello";  //变量加上final就变成了常量
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = "hello" + s2;  //自动调用了StringBuilder的toString方法（）相当于新建了一个对象
        String s6 =  s1 + "world";
        String s7 =  s1 + s2;


        System.out.println(s3 == s6);
        System.out.println(s1 == "hello");



        System.out.println();
        String s8 = s5.intern();//inter返回的是字符串常量池中的字面量的地址
        System.out.println(s8 == s3);

    }

    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "world";


        String s3 = s1.concat(s2);
        String s4 = "hello".concat(s2);
        String s5 = s1.concat("world");

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
    }

    @Test
    public void test4(){

        String  s1 = "ABC";
        String s2 = s1;  //因为指向的是同一个字符串常量池，所以相同
        s1 = "abc";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
