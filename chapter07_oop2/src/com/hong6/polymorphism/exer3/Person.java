package com.hong6.polymorphism.exer3;

/**
 * ClassName: Person
 * Package: com.hong6.polymorphism.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 11:27
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person {
    protected String name="person";
    protected int age=50;

    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}

class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}

//大学生类
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}
