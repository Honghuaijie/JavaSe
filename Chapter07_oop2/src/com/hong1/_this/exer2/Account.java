package com.hong1._this.exer2;

/**
 * ClassName: Account
 * Package: com.hong1._this.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 18:10
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    //存款
    public void deposit(double amt){
        if(amt > 0){
            balance +=amt;
            System.out.println("当前余额为：" + balance);
        }
    }
    //取款
    public void withdraw(double amt){
        if(amt > 0 && balance >= amt){
            balance -= amt;
            System.out.println("当前余额为：" + balance);
        }else{
            System.out.println("余额不足");
        }
    }

}
