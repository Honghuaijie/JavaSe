package com.atguigu10._enum.exer1;

/**
 * ClassName: GirFriendTest
 * Package: com.atguigu10._enum.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 10:55
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class GirFriendTest {
    public static void main(String[] args) {
        System.out.println(GirFriend.XIAOLI.name());
    }
}

enum GirFriend{
    XIAOLI(20);


    private  int age;

    GirFriend(int age) {
        this.age = age;
    }
}
