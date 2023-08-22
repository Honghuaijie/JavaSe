package com.atguigu03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:使用Runnable接口的方式，实现买票 -->存在线程安全问题
 *               同时使用同步代码块解决上述买票中的现成安全问题
 *
 * @Author honghuaijie
 * @Create 2023/8/22 23:42
 * @Version 1.0
 * 不积跬步无以至千里
 */

class SalaryTicket implements Runnable{
    int ticket = 100;
    Object obj  = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            synchronized (obj) { //obj是唯一的嘛？ 是的
            synchronized (this) { //this是唯一的嘛？ this是s1，s1只造了一个，是唯一的

                    if(ticket > 0){

                        System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket--);
                    }else{
                        break;
                    }
            }

        }

    }
}

public class WindowTest {
    public static void main(String[] args) {
        SalaryTicket s1 = new SalaryTicket();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();



    }
}
