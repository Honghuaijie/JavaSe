package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClass
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 16:27
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SubClass extends SuperClass implements CompareA,CompareB{

    @Override
    public void method2() {
        System.out.println("subClass:我是重写以后的方法");
    }

    @Override
    public void method3() {
        System.out.println("SubClass: method3");
    }

    public void method4(){
        System.out.println("subclass：method4");
    }

    public void method5(){
    //知识点5：如何在实现类中调用父类或接口中被重写的方法。
        //调用自己类中的方法
        method4();
        //调用父类中的方法
        super.method4();
        //调用接口中的方法
        CompareA.super.method3();
        CompareB.super.method3();
    }


}
