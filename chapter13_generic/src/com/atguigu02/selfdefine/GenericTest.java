package com.atguigu02.selfdefine;

import org.junit.Test;

/**
 * ClassName: GenericTest
 * Package: com.atguigu02.selfdefine
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 11:43
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class GenericTest {
    @Test
    public void test(){
        //如果没有指明具体的类型，就默认为object
        Order order  = new Order();
        Object t = order.getT();

        Order<String> order1 = new Order<>();
        String t1 = order1.getT();



    }

    @Test
    public void test1(){
        SubOrder1 subOrder1 = new SubOrder1();
        Object t = subOrder1.getT();

    }

    @Test
    public void test2(){
        SubOrder2 subOrder2 = new SubOrder2();
        String t = subOrder2.getT();
    }

    @Test
    public void test3(){
        SubOrder3<String> subOrder3  = new SubOrder3<>();
        String t = subOrder3.getT();
    }

    @Test
    public void test4(){
        SubOrder4<String,Integer> subOrder4 = new SubOrder4<>("Person","Tom",20);
        Integer e = subOrder4.getE();

    }

    @Test
    public void test5(){
        SubOrder5<Integer> subOrder5 = new SubOrder5<>("Person","Tom",5);
        Integer e = subOrder5.getE();
    }

    @Test
    public void test6(){
        Order o1 = new Order();
        String[] strings = new String[]{"TOm","Jeryy","123"};
        Integer[] integers = new Integer[]{1,2,3,4,5};
        System.out.println(o1.copuFromArrayToList(integers));
        System.out.println(o1.copuFromArrayToList(strings));
    }

    @Test
    public void test7(){
        String[] strings = new String[]{"TOm","Jeryy","123"};
        Integer[] integers = new Integer[]{1,2,3,4,5};
        System.out.println(Order.copuFromArrayToList(strings));
    }




}
