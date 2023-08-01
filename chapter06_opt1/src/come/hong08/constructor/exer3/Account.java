package come.hong08.constructor.exer3;

/**
 * ClassName: Account
 * Package: come.hong08.constructor.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 17:08
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(String i,double b,double air){
        id = i;
        balance = b;
        annualInterestRate = air;
    }
    public Account(){

    }

    public void setId(String i){
        id = i;
    }
    public String getId(){
        return id;
    }

    public void setBalance(double sb){
        balance = sb;
    }
    public double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double sair){
        annualInterestRate = sair;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void withdraw(double num){
        if(num <= balance  && num >0) {
            balance -= num;
            System.out.println("取款成功，还剩余：" + balance);
        }else{
            System.out.println("余额不足");
        }
    }

    public void deposit(double num){
        if(num > 0){
            balance +=num;
            System.out.println("存款成功，当前余额为：" + balance);
        }

    }
}
