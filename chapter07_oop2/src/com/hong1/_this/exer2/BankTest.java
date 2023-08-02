package com.hong1._this.exer2;

/**
 * ClassName: BankTest
 * Package: com.hong1._this.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 18:23
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.addCustomer("hong","huaijie");
        Customer c1 = bank1.getCustomer(0);
        c1.setAccount(new Account(2000));
        c1.getAccount().deposit(1000);
        c1.getAccount().withdraw(4000);

        bank1.addCustomer("zhang","san");
        Customer c2 = bank1.getCustomer(1);
        c2.showInfo();
        c2.setAccount(new Account(1000));
        c2.getAccount().withdraw(100);
        c2.getAccount().deposit(100);
        System.out.println(bank1.getNumberOfCustomers());

    }
}
