package com.atguigu03.threadsafe.notsafe;

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

class SalaryTicket implements Runnable{
    int ticket = 100;
    @Override
    public void run() {

        while (true){
            if(ticket > 0){
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket--);
            }else{
                break;
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
