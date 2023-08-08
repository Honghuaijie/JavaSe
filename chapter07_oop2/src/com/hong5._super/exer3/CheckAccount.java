package com.hong5._super.exer3;

/**
 * ClassName: CheckAccount
 * Package: com.hong5._super.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/6 10:23
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CheckAccount extends Account{
    private double overdraft;  //可透支的限额

    public CheckAccount(int id, double balance , double annuallnterestRate,double overdraft){
        super(id,balance,annuallnterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount){
        if(amount < getBalance()){
            setBalance(getBalance() - amount);
        }else{
            double over = amount - getBalance();
            if(overdraft > over){
                setBalance(0);
                overdraft -= over;
            }else{
                System.out.println("超过可透支额的限额");
            }
        }
    }

    //打印账户余额，和可透支额
    public void show(){
        System.out.println("账户余额：" + getBalance() + "，可透支额：" + overdraft );
    }


    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
