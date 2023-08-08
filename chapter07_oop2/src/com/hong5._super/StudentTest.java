package com.hong5._super;

/**
 * ClassName: StudentTest
 * Package: com.hong5._super
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 20:18
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class StudentTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("zhang",20);
        Teacher t2 = new Teacher();

        System.out.println(t1.getAge());

    }
}
