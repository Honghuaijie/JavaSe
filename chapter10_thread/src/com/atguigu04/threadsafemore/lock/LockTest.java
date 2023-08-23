package com.atguigu04.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:使用Runnable接口的方式，实现买票
 *
 * @Author honghuaijie
 * @Create 2023/8/22 23:42
 * @Version 1.0
 * 不积跬步无以至千里
 */

class SalaryTicket extends Thread{
    private static int ticket = 100;

    //1.创建Lock的实例，需要确保多个线程公用一个lock实例，需要考虑将此对象声明为static final
    private static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {

        while (true){
            try {
                //2.执行lock方法，锁定对共享资源的调用
                lock.lock();
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket--);
                }else{
                    break;
                }
            } finally {
                //3.unlock方法调用，释放对共享数据的锁定
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {

        SalaryTicket s1 = new SalaryTicket();
        SalaryTicket s2 = new SalaryTicket();
        SalaryTicket s3 = new SalaryTicket();

        s1.setName("窗口一");
        s2.setName("窗口二");
        s3.setName("窗口三");

        s1.start();
        s2.start();
        s3.start();



    }
}
