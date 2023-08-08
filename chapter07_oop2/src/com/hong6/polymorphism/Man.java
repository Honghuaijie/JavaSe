package com.hong6.polymorphism;

/**
 * ClassName: Man
 * Package: com.hong6.polymorphism
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/6 16:37
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Man extends Person{
    int age = 12 ;
    boolean isSmoking;


    public void eat(){
        System.out.println("男人多吃饭");
    }

    public void walk(){
        System.out.println("男人多走路");
    }

    public void deSport(){
        System.out.println("男人多运动");
    }
}
