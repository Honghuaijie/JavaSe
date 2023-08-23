package com.atguigu04.threadsafemore.singleton;

/**
 * ClassName: BankTest
 * Package: com.atguigu04.threadsafemore.singleton
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/23 10:39
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {


        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getBank();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getBank();
            }
        };

        t1.start();
        t2.start();


        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
    }
}

class Bank {
    private static volatile Bank bank;

    private Bank() {

    }

//    //实现线程安全的方式1
//    public static  Bank getBank(){ //默认的同步监视器就是Bank.class
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        if(bank == null){
//            bank = new Bank();
//        }
//        return bank;
//
//    }

//    //实现线程安全的方式2
//    public static  Bank getBank() { //默认的同步监视器就是Bank.class
//
//        synchronized (Bank.class) {
//            if (bank == null) {
//
//                try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//                bank = new Bank();
//            }
//        }
//        return bank;
//
//    }



//    实现线程安全的方式3:相较于方式1和方式2来讲，效率更高,为了避免出现指令同牌，需要将bank声明为volatitle
    public static Bank getBank() {

        if (bank == null) {
            synchronized (Bank.class) {
                if (bank == null) {

//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                    bank = new Bank();
                }
            }
        }
        return bank;

    }
}
