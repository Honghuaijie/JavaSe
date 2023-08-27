package com.atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringDemo
 * Package: com.atguigu01.string
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/24 10:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StringDemo {
    @Test
    public void test1(){
        String s1 = "String"; //字面量的定义方式
        String s2 = "String";
        System.out.println(s1 == s2); //true
    }

    /**
     * String的不可变性
     * ① 当堆字符串变量重新赋值时，需要重新指定一个字符串常量的位置进行赋值，不能在原有的位置修改
     * ② 当对现有的字符串进行拼接操作时，需要重新开辟空间保存拼接以后的字符串。不能在原有的位置修改
     * ③ 当调用字符串replace的方法时，替换现有的某个字符时，需要重新开辟空间保存修改以后的字符串，不能在原有的位置修改
     *
     */

    @Test
    public void test2(){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        s2 = "hw";
        System.out.println(s1 == s2);

    }
    
    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s2.replace('l', 'w');
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        char[] c1 = {'a','b','c'};
        char[] c2 = {'a','b','c'};
        System.out.println(c1 == c2);
    }
}
