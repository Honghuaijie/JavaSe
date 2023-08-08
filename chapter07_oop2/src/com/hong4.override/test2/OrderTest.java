package com.hong4.override.test2;

import com.hong4.override.test1.Order;

/**
 * ClassName: OrderTest
 * Package: com.hong4.override.test2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 14:15
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        o1.orderPublic = 1;
        o1.methodPublic();


    }
}
