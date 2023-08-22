package com.atguigu01.create.thread;

/**
 * ClassName: EvenNumberTest
 * Package: com.atguigu01.create.thread
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/20 15:48
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber t1 = new PrintNumber();
        t1.start();  //创建线程
//        t1.run();

        //注意，不能让已经start的线程，再次执行start（），否则报异常IllegalThreadStateException
//        t1.start();  //创建线程
        PrintNumber t2 = new PrintNumber();
        t2.start();

        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "：" + i );
            }
        }


    }
}

class PrintNumber extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "：" + i + "------------------");
            }
        }
    }
}
