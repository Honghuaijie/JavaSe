package com.hong5._super;

/**
 * ClassName: Person
 * Package: com.hong5._super
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 20:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person {
    String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){
        System.out.println("person------");
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(){
        System.out.println("人睡觉");
    }

    public void doSport(){
        System.out.println("人运动");
    }
}
