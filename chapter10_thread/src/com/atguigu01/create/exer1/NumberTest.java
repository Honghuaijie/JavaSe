package com.atguigu01.create.exer1;

/**
 * ClassName: NumberTest
 * Package: com.atguigu01.create.exer1
 * Description:
 *  练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数。
 * @Author honghuaijie
 * @Create 2023/8/20 16:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class NumberTest {
    public static void main(String[] args) {
        //方式一
//        EvenNumberPrint e1 = new EvenNumberPrint();
//        OddNumberPrint o1 = new OddNumberPrint();
//        e1.start();
//        o1.start();
        //方式二：创建thread的匿名子类的匿名对象。并调用方法
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + "：" + i );
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + "：" + i );
                    }
                }
            }
        }.start();
    }
}


class EvenNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "：" + i );
            }
        }
    }
}

class OddNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + "：" + i );
            }
        }
    }
}