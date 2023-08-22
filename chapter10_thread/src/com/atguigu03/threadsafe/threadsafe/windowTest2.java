package com.atguigu03.threadsafe.threadsafe;

/**
 * ClassName: windowTest2
 * Package: com.atguigu03.threadsafe.threadsafe
 * Description:使用同步方法解决继承Thread类中的线程安全问题。
 *
 * @Author honghuaijie
 * @Create 2023/8/23 1:00
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class windowTest2 {
    public static void main(String[] args) {
        SalaryTicket2 s1 = new SalaryTicket2();
        SalaryTicket2 s2 = new SalaryTicket2();
        SalaryTicket2 s3 = new SalaryTicket2();

        s1.setName("窗口一");
        s2.setName("窗口二");
        s3.setName("窗口三");
        s1.start();
        s2.start();
        s3.start();

    }
}

class SalaryTicket2 extends Thread{
    static int ticket=100;
    static Object obj = new Object();

    static boolean isFlag = true;
    @Override
    public void run() {

        while (isFlag){
            show();
        }
    }

//    public synchronized void show(){ //同步监视器为this ,this是s1,s2,s3
    public static synchronized void show(){ //同步监视器为当前类
        if(ticket > 0){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        }else{
            isFlag = false;
        }
    }
}
