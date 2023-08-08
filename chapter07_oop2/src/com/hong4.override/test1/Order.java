package com.hong4.override.test1;

/**
 * ClassName: Order
 * Package: com.hong4.override.test1
 * Description:权限类
 *
 * @Author honghuaijie
 * @Create 2023/8/5 14:07
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Order {
    public static void main(String[] args) {
        Order o1 = new Order();
        o1.orderPrivate = 1;
        o1.orderDefault = 1;
        o1.orderProtected  = 1;
        o1.orderPublic = 1;

        o1.methodPrivate();
        o1.methodDefault();
        o1.methodProtected();
        o1.methodPublic();
    }
    private int orderPrivate;
     int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    //方法
    private void methodPrivate(){

    }

    void methodDefault(){

    }

    protected void methodProtected(){

    }

    public void methodPublic(){

    }

}
