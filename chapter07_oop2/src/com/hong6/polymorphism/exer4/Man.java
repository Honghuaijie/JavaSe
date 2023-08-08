package com.hong6.polymorphism.exer4;

/**
 * ClassName: Man
 * Package: com.hong6.polymorphism.exer4
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 11:37
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Man extends Person{

    public void eat(){
        System.out.println("男人吃饭");
    }

    public void toilet(){
        System.out.println("男人上洗手间");
    }

    public void smoke(){
        System.out.println("男人抽烟");
    }
}
