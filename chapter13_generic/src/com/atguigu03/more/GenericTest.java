package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest
 * Package: com.atguigu03.more
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 15:00
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class GenericTest {
    @Test
    public void test1(){
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

//        list1 = list2;  //不行
        /**
         * 反证法
         * 加上list1 = list2 可行
         * list1.add("AA")
         *
         * list1.add(123)
         *
         * String str = list2.get() ;// 相当于去除的123赋值给了Str，错误的
         */
    }

    @Test
    public void test2(){
        List<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list = list1;

    }
}
