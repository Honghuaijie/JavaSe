package com.hong5._super;

/**
 * ClassName: Student
 * Package: com.hong5._super
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 20:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Student extends Teacher{
    String name;
    int age;


    public void show(){
        doSport();
        this.doSport();
        super.doSport();

    }
}
