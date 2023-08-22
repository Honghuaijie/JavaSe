package com.atguigu03.threadsafe.exer;

/**
 * ClassName: AccountTest
 * Package: com.atguigu03.threadsafe.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/23 1:22
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account();

        Customer customer1 =new Customer(acct);
        Customer customer2 =new Customer(acct);
        Thread t1 = new Thread(customer1,"甲");
        Thread t2 = new Thread(customer2,"乙");

        t1.start();
        t2.start();


    }
}


class Account {
    double balance = 3000;

    public synchronized void deposit(double amt){  //此处的同步监视器是this，this是acct
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(amt > 0){
            balance +=amt;
            System.out.println(Thread.currentThread().getName() + "：存款成功，账户余额为：" + balance);
        }
    }
}

class Customer implements Runnable {

    Account account;

    public Customer(Account acct){
        this.account = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            account.deposit(1000);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}