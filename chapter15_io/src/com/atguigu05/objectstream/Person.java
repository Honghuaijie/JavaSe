package com.atguigu05.objectstream;

import java.io.Serializable;

/**
 * ClassName: Person
 * Package: com.atguigu05.objectstream
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/2 0:00
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person implements Serializable {
    transient String name;
    static int age;

    Account account;



    static final long serialVersionUID = 421312L;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public Person(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Account implements Serializable{
    double anlance;
    static final long serialVersionUID = 421312L;

    public Account() {
    }

    public Account(double anlance) {
        this.anlance = anlance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "anlance=" + anlance +
                '}';
    }
}