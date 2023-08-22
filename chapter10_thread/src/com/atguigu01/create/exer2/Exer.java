package com.atguigu01.create.exer2;

/**
 * 思考题：判断各自调用的是哪个run()？
 */
public class Exer {
    public static void main(String[] args)  {
        A a = new A();
        a.setName("线程A");
        a.start();  //线程A的run()...
        B b = new B(a,"线程B");
        b.start();  //线程B的run()...

    }
}

//创建线程类A
class A extends Thread {
    @Override
    public void run() {

        System.out.println("线程A的run()..." + Thread.currentThread().getName());

    }
}

//创建线程类B
class B extends Thread {
    private A a;

    public B(A a) {//构造器中，直接传入A类对象
//        this.a = a;

        //由于原来的thread的run方法被重写了，所以执行的是
        super(a);
    }
    public B(A a ,String name){
        super(a,name);
    }
//
//    @Override
//    public void run() {
//        System.out.println("线程B的run()..." + Thread.currentThread().getName());
//    }

}
