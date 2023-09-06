package com.atguigu02.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ClassName: ListTest
 * Package: com.atguigu02.list
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/30 10:50
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ListTest {
    @Test
    public void test(){
        ArrayList<String> list = new ArrayList<>();

        list.add("AA");
        list.add("BB");
        list.add("BB");
        list.add("BB");
        list.add("BB");
        list.add("BB");
        list.add("BB");
        list.add("BB");
        list.add("BB");
        list.add("BB");
        list.add("BB");

    }

    @Test
    public void test2(){
        LinkedList<String> list = new LinkedList<>();

        list.add("AA");
        list.add("BB");


    }
}
