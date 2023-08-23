package com.atguigu05.communication;

/**
 * ClassName: PrintNumberTest
 * Package: com.atguigu05.communication
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/23 15:03
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();

        Thread t1 = new Thread(p,"线程1");
        Thread t2 = new Thread(p,"线程2");

        t1.start();
        t2.start();
    }
}

class PrintNumber implements Runnable{
    int number = 1;
    Object obj = new Object();
    @Override
    public void run() {

        while(true){
            synchronized (obj) {
                obj.notify();
                if(number <=100){
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "输出：" + number);
                    number++;
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    break;
                }
            }
        }
    }
}
