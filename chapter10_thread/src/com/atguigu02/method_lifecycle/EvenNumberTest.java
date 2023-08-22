package com.atguigu02.method_lifecycle;

/**
 * ClassName: EvenNumberTest
 * Package: com.atguigu02.method_lifecycle
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/22 13:33
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class EvenNumberTest {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("主线程");

        A a = new A();
        a.setName("线程A");

        a.start();  //线程A的run()...
        for (int i = 1; i < 100; i++) {

            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +
                        Thread.currentThread().getPriority() +  ":" + i
                );
            }

            if(i % 20 == 0){
                a.yield();
            }
        }

    }
}


//创建线程类A
class A extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +
                        Thread.currentThread().getPriority() +  ":" + i
                        );
            }
        }

    }
}

