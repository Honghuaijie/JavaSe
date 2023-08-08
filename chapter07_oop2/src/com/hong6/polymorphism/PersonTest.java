package com.hong6.polymorphism;

/**
 * ClassName: PersonTest
 * Package: com.hong6.polymorphism
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 10:50
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class PersonTest {
    public static void main(String[] args) {
        //向上转型
        Person p1 = new Man();
        p1.eat();
        p1.walk();
//        p1.isSmoking
//        p1.deSport();//报错
        //如果想使用子类特有的方法，就需要向下转型
        //向下转型



        if(p1 instanceof Person){
            Man m1 = (Man)p1;
            m1.eat();
            m1.walk();
            m1.deSport();
            System.out.println(m1.name);
            System.out.println(m1.age);
            System.out.println(m1.isSmoking);
        }
    }
}
