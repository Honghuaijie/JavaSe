package com.atguigu07._abstract;

/**
 * ClassName: Person
 * Package: com.atguigu07._abstract
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/11 19:10
 * @Version 1.0
 * 不积跬步无以至千里
 */
public abstract class Person {
    String name;
    int age;

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void walk();
}
