package com.hong6.polymorphism;

/**
 * ClassName: Woman
 * Package: com.hong6.polymorphism
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/6 16:37
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Woman  extends Person {
    private boolean doBeauty;

    public void eat(){
        System.out.println("女人少吃饭");
    }

    public void walk(){
        System.out.println("女人多走路");
    }

    public void doShopping(){
        System.out.println("女人购物");
    }

}
