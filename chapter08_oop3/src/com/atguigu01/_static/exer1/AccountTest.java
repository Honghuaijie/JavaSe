package com.atguigu01._static.exer1;

/**
 * ClassName: AccountTest
 * Package: com.atguigu01._static.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 10:46
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class AccountTest {
    public static void main(String[] args) {
        Account.setRate(0.002);
        Account a1 = new Account();
        Account a2 = new Account("22222",100);
        Account a3 = new Account("333333",10);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1.getRate());
    }
}
