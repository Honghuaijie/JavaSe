package com.atguigu03.threadsafe.notsafe;

/**
 * ClassName: WindowTest1
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:使用Thread继承的方式，实现买票 -->存在线程安全问题
 *
 * @Author honghuaijie
 * @Create 2023/8/23 0:28
 * @Version 1.0
 * 不积跬步无以至千里
 */

class SalaryTicket1 extends Thread{
    static int ticket=100;
    @Override
    public void run() {

        while (true){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                }else{
                    break;
                }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        SalaryTicket1 s1 = new SalaryTicket1();
        SalaryTicket1 s2 = new SalaryTicket1();
        SalaryTicket1 s3 = new SalaryTicket1();

        s1.setName("窗口一");
        s2.setName("窗口二");
        s3.setName("窗口三");
        s1.start();
        s2.start();
        s3.start();

    }

}
