package com.atguigu04.grammar._07record;

/**
 * ClassName: Person
 * Package: com.atguigu04.grammar._07record
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/6 15:51
 * @Version 1.0
 * 不积跬步无以至千里
 */
public record Person(int id, String name) {
    //还可以在record声明的类中定义静态字段、静态方法、构造器或实例方法。
    static String info = "我是一个人";

    public static void show(){}

    public Person(){
        this(0,null);
    }

    public void show1(){
    }


    //不能在record声明的类中定义实例字段；类不能声明为abstract；不能声明显式的父类等。
}

//abstract record dog(int id ){}

//record Cat(int id) extends Thread{}

//class Stduent extends Person{}