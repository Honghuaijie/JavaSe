package com.hong5._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Package: com.hong5._super.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/6 10:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CheckAccountTest {
    public static void main(String[] args) {
       CheckAccount c1= new CheckAccount(1122,20000,4.5,5000);
       c1.withdraw(5000);
       c1.show();

        c1.withdraw(18000);
        c1.show();

        c1.withdraw(3000);
        c1.show();

    }
}
