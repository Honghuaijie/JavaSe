package com.atguigu01.create.runnable;

/**
 * ClassName: EveNumberTest
 * Package: com.atguigu01.create.runnable
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/20 16:26
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class EveNumberTest {
    public static void main(String[] args) {
        Runnable r1 = new EvenNumberPrint();
        Thread t1 = new Thread(r1);
        //问题：为什么start明明调用的是自己类中的run方法，怎么执行了r1中实现的方法
        //答 因为原码中写了 ：if (target != null) {
        //            target.run();
        //        }
        t1.start();




        new Thread(r1){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + "：" + i);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + "：" + i);
                    }
                }
            }
        }).start();

        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
    }
}

class EvenNumberPrint implements Runnable{
    public  int money = 100;

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
    }
}
