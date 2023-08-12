package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClassTest
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 16:27
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SubClassTest {
    public static void main(String[] args) {
        //知识点1：接口中声明的静态方法，只能被接口来调用，不能使用其实现类调用
        CompareA.method1();
//        SubClass.method1();

        //知识点2：接口中声明的默认方法可以被实现类继承并重写，
        SubClass s1 = new SubClass();
        s1.method2();

        //知识点3：类实现了两个接口，而在两个接口中定义了同名同参的默认方法，而实现类并没有重写此两个接口
        //默认方法的情况下，会报错  --->接口冲突
        //此时实现类必须重写接口中定义的同名同参的方法


        //知识点4：子类（或实现类）继承了父类并实现了接口，父类和接口中声明了同名同参的方法，其中接口中是默认方法
        //默认情况下，子类（或实现类）在没有重写此方法的情况下，调用的是父类中的方法。---->类的优先原则
        s1.method4();
        System.out.println("1111");
        s1.method5();
    }
}
