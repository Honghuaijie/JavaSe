package com.hong4.override.test1;

/**
 * ClassName: OrderTest
 * Package: com.hong4.override.test1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 14:09
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order();

        o1.orderDefault = 1;
        o1.orderProtected = 1;
        o1.orderPublic = 1;

        o1.methodDefault();
        o1.methodProtected();
        o1.methodPublic();

        //报错
        //o1.orderPrivate = 1;
        //o1.methodPrivate();
    }
}
