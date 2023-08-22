package com.atguigu03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest1
 * Package: com.atguigu03.threadsafe.runnablesafe
 * Description:谁用同步方法解决实现Runnable接口的线程安全问题
 *
 * @Author honghuaijie
 * @Create 2023/8/23 0:45
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class WindowTest1 {
    public static void main(String[] args) {
        SalaryTicket1 s1 = new SalaryTicket1();

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

class SalaryTicket1 implements Runnable{
    int ticket = 100;
    boolean isFlag = true;
    @Override
    public void run() {

        while (isFlag){
            show();
        }
    }

    public synchronized void show(){ //此时同步监视器为this,是唯一的
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        }else{
            isFlag = false;
        }
    }
}
