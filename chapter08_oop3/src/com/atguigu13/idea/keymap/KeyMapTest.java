package com.atguigu13.idea.keymap;

import java.util.Date;
import java.util.HashMap;

/**
 * ClassName: KeyMapTest
 * Package: com.atguigu13.idea.keymap
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/15 15:37
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class KeyMapTest {
    public static void main(String[] args) {
        String s = new String("1232");

        Object o = s;
        methopd1((String) o);


    }

    private static void methopd1(String o) {
        String s1 = o;
        HashMap map = new HashMap();

        Date date = new Date();

        Person person = new Person("hong",12);

        System.out.println("你好");
    }
}

class Person{
    String name;
    int age123;
    Person(){

    }

    Person (String name){
        this.name = name;
    }

    Person(String name,int age ){
        this.name = name;
        this.age123 = age;
    }

    public void eat(){
        System.out.println("吃");
    }

    public void sleep(){
        System.out.println("睡");
    }
}

interface A{
    void method1();
}

interface B{
    void method1();
}

class Student extends Person implements  A,B{
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void method1() {

    }
}
