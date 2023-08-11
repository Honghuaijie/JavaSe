package com.atguigu04.block.exer;

/**
 * ClassName: UserTest
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 16:28
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());
        User u2 = new User("hong","2222");
        System.out.println(u2.getInfo());


    }
}
