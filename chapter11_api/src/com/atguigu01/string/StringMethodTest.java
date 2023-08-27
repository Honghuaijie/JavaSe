package com.atguigu01.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Package: com.atguigu01.string
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/24 18:26
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StringMethodTest {

    @Test
    public void test1(){
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a','b','c'});
        System.out.println(s3);
    }


    /**
     * String 与常见的其他结构之间的转换
     *
     * 1.String与基本数据类型、包装类之间的转换（复习）
     *
     *
     */
    @Test
    public void test2(){
        int num = 10;
        //方式一:
        String s1 = String.valueOf(num);
        //方式二：
        String s2 = num + "";

        String s3 = "97";
        char c1 = (char) Integer.parseInt(s3);
        System.out.println(c1);
    }

    //String 和char[]之间的转换
    @Test
    public void test3(){
        String s1 = "hello";

        //String > char[] ：调用String的toCharArray()
        char[] arr = s1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //char[] > String
        char[] c1 = new char[]{'a','b','c'};
        String str1 = String.valueOf(c1);
        String str2 = new String(c1);
        System.out.println(str1);
        System.out.println(str2);
    }

    //String > byte[] 之间的转换（难度）

    /**
     * 在utf-8中一个汉字占3个字节，一个字母占用1个字节
     * 在gbk字符集中，一个汉字占用2字节，一个字母占用1个字节
     *
     * utf-8和gbk都向下兼容了ascii码
     *
     * 编码与解码
     * 编码： String -->字节或字节数组
     * 解码： 字节或字节数组 --> String
     *
     * 要求：解码时使用的字符集必须与编码时使用的字符集一致
     */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("abc中国");
        //String -->byte[]: 调用String的getBytes方法
        byte[] arr1 = str.getBytes(); // 默认使用的字符集是utf-8

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println();
        // str.getBytes(String charsetName):使用指定字符集
        byte[] arr2 = str.getBytes("gbk");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //byte[] -->String:
        String s2 = new String(arr1);  // 默认使用的字符集是utf-8
        String s3 = new String(arr2,"gbk");
        System.out.println(s2);
        System.out.println(s3);

    }

}
