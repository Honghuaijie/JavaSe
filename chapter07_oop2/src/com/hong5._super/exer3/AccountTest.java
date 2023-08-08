package com.hong5._super.exer3;

/**
 * ClassName: AccountTest
 * Package: com.hong5._super.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/6 10:19
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class AccountTest {
    public static void main(String[] args) {
        Account user1 = new Account(1122,20000,4.5);
        user1.withdraw(30000);
        user1.withdraw(2500);
        user1.deposit(3000);
        System.out.println(user1.getAnnuallnterestRate()/12);
    }
}
