package com.hong6.polymorphism;

/**
 * ClassName: ManTest
 * Package: com.hong6.polymorphism
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/6 16:42
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ManTest {
    public static void main(String[] args) {
//      在多态的场景下，调用方法时。
//      编译时：认为方法是左边声明的父类的类型的方法（即被重写的方法）
//      执行时，实际执行的是子类重写父类的方法。
        //编译看左边，运行看右边
        Person p1 = new Man();
        p1.eat();
        p1.walk();
//        p1.isSmoking = true;

        //测试属性是否满足多态性？  不满足
        System.out.println(p1.age);  //编译和运行都是看左边


        /*
        * 多态的弊端？
        * 问题：Person p1 = new Man();
        *    创建的对象在内存中是否加载了Man类中声明的特有属性和方法？  加载了
        * 问题：能不能直接调用Man类中声明的特有属性和方法？ 不能
        *
        * */
    }
}
