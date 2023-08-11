package com.atguigu06._final;

/**
 * ClassName: FinalTest
 * Package: com.atguigu06._final
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 18:40
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class FinalTest {
    public static void main(String[] args) {
//        A.method();
        B b = new B();
//        b.me();
        C c1 = new C();
//        c1.MIN_SCORE = 100;  //报错
    }
}

class A{
    public final void method(){
        System.out.println("static");
    }
}

class B extends A{
//    public void method(){
//
//    }
}

class C {
    //对象创建好后，属性的值就已经确定了，
    //所以用final修饰的变量，一定要在构造器，或者代码块和显式赋值中进行赋值
    final int MIN_SCORE =0;
    final int MAX_SCORE;
    final int AVG_SCORE;
    int  age;
    {
        MAX_SCORE = 100;
    }
    public int  getMin(){
        return MIN_SCORE;
    }
    C(){
        AVG_SCORE = 50;
    }
}

//测试final修饰局部变量
class D{
    public void method1(){
        final int age;
        age =10;

    }

    public void method2(final int age){
//        age++;
    }
}
