package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest1
 * Package: com.atguigu03.more
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 16:09
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class GenericTest1 {

    /**
     *  ?的使用
     */
    @Test
    public void test1(){
        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = null;
        list = list1;
        list = list2;

        method(list1);
        method(list2);
    }

    public void method(List<?> list){


    }

    @Test
    public void test2(){
        List<?> list = null;
        List<String> list1 = new ArrayList<>();

        list = list1;
        list1.add("AA");
        //读取数据
        Object obj = list.get(0);
        System.out.println(obj);


        //写入数据
//        list.add("aa");
        //特例：可以将null写入集合中
        list.add(null);
    }


    /**
     * 测试 ： 有限制条件的通配符的使用
     *
     *  ？ extend A
     *  ？ super A
     *
     *
     */


    //？ extend A
    @Test
    public void test3(){
        List<? extends Father> list = null;

        List<Object> list1 = null;
        List<Father> list3 = null;
        List<Son> list4 = null;

//        list = list1;
        list = list3;
        list = list4;
    }


    @Test
    public void test3_1(){
        List<? extends Father> list = null;

        List<Father> list3 = new ArrayList<>();

        list = list3;
        list3.add(new Father());

        //读取数据
        Father f1 = list.get(0);

        //写入数据:不可以写入数据
        list.add(null);
//        list.add(new Son());

    }

    @Test
    public void test4(){
        //？ extend A
        List<? super Father> list = null;

        List<Object> list1 = null;
        List<Father> list3 = null;
        List<Son> list4 = null;

        list = list1;
        list = list3;
//        list = list4;
    }

    @Test
    public void test4_1(){
        List<? super Father> list = null;
        List<Father> list3 = new ArrayList<>();

        list3.add(new Father());
        list = list3;

        //读取数据
        Object obj= list.get(0);

        //写入数据 :可以将father及其子类的对象添加进来
        //list.add(new Object());
        list.add(new Father());
        list.add(new Son());

    }
}
