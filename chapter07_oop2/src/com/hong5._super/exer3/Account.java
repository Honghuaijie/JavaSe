package com.hong5._super.exer3;

/**
 * ClassName: Account
 * Package: com.hong5._super.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/6 10:12
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(){

    }

    public Account(int id, double balance , double annuallnterestRate){
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    //取钱
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("取了:" + amount + "，还剩多少"+ balance +"钱");
        }else{
            System.out.println("输入金额有误或余额不足");
        }
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("存了:" + amount + "，还剩多少"+ balance +"钱");
        }
    }

    //月利率
    public double getMonthlyInterest(){
        return annuallnterestRate / 12;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }
}
