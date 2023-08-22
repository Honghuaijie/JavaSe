package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/15 10:42
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class WrapperTest {
    /*
    基本数据类型 -->包装类：①使用包装类的构造器 ②（建议）调用包装类的valueOf(xxx xx)
    包装类 -->基本数据类型:调用包装类中的xxxValue()
     */

//    自动装箱
    @Test
    public void test4(){
        //自动装箱：基本数据类型 -->包装类
        int i1 = 10;
        Integer ii1 = i1;
        Boolean bb2 = false;
        System.out.println(ii1);

        //自动拆箱  包装类 --> 基本数据类型
        int i2 = ii1;
        boolean b2 = bb2;
    }


//    包装类 -->基本数据类型
    @Test
    public void test2(){
        Integer i = Integer.valueOf("10");
        int i1 = i.intValue();
        System.out.println(i1);
    }



//    基本数据类型 -->包装类：①使用包装类的构造器 ②（建议）调用包装类的valueOf(xxx xx)
    @Test
    public void test1(){
        int i1 = 10;
        Integer ii1 = new Integer(i1);
        System.out.println(ii1);

        float f1 = 12.3f;
        String s1  = "12.54";
        Float ff1 = new Float(s1);
        System.out.println(s1);

        boolean b1 = false;
        s1 = "false1";
        Boolean bb1 = new Boolean(s1);
        System.out.println(bb1);

        //推荐使用
        Integer i = Integer.valueOf("10");

        Float af = Float.valueOf("12.3");
        Boolean ab = Boolean.valueOf("true");
        System.out.println(ab);


    }

    @Test
    public void test3(){
        Account a1 = new Account();
        System.out.println(a1.b1);
        System.out.println(Boolean.valueOf(a1.b1));
        System.out.println(a1.b2);

    }

}

class Account{
    boolean b1;

    Boolean b2;
}
