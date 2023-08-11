package com.atguigu01._static.exer1;

/**
 * ClassName: Account
 * Package: com.atguigu01._static.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 10:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Account {
    private int id;
    private String passwd;
    private double balance;
    private static double rate; //利率
    private static double minbalance = 50; //限制你最低需要存多少钱
    private static int init = 1001;  //用于初始化账户
    public Account(){
        id = init;
        init++;
        passwd = "12345";
        balance = 50;
    }

    public Account(String passwd,double balance){
        this();
        this.passwd = passwd;
        this.balance = balance<50? 50: balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", passwd='" + passwd + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }
}
