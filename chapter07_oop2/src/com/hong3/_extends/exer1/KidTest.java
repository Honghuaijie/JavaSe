package com.hong3._extends.exer1;

/**
 * ClassName: KidTest
 * Package: com.hong3._extends.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 13:14
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class KidTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.sex = 0;
        someKid.salary = 1;
        someKid.yearsOld = 1;
        someKid.printAge();
        someKid.manOrWoman();
        someKid.employeed();
    }
}
