package com.atguigu07._abstract;

/**
 * ClassName: Student
 * Package: com.atguigu07._abstract
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/11 19:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
public  class Student extends Person {

    String school;

    Student(){

    }

    Student(String name,int age, String school){
        super(name,age);
    }

    public void eat(){
        System.out.println("student are eating");
    }

    public void walk(){
        System.out.println("student are walking");
    }



}
