package com.hong5._super;

/**
 * ClassName: Teacher
 * Package: com.hong5._super
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 20:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Teacher extends Person{

    public Teacher(){
        System.out.println("Tearcher----");
    }

    public Teacher(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("老师多吃饭");
    }

    public void sleep(){
        System.out.println("老师少睡觉");
    }
    public int getAge(){
        return 22;
    }

    public void show(){
        eat();
        //对父类中被重写的方法进行调用
        super.eat();
    }
}
