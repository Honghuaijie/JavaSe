package com.atguigu08._interface.jdk8;

/**
 * ClassName: CompareA
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 16:27
 * @Version 1.0
 * 不积跬步无以至千里
 */
public interface CompareA {
    //jdk8中，静态方法
    public static void method1(){
        System.out.println("我是静态方法");
    }

    //方法：jdk8中，默认方法
    public default void method2(){
        System.out.println("我是默认方法");
    }

    public default void method3(){
        System.out.println("Compare: method3");
    }

    public default void method4(){
        System.out.println("Compare: method4");
    }

    //定义私有方法
    private void method5(){
        System.out.println("私有方法");
    }
}
