package com.hong7.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Package: com.hong7.object.equals.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 15:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(12,"hong");
        Order o2 = new Order(12,"hong");
        System.out.println(o1.equals(o2));

        Order o3 = new Order(12,new String("hong"));
        Order o4 = new Order(12,new String("hong"));
        System.out.println(o3.equals(o4));


    }
}
