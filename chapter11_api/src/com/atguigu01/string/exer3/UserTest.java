package com.atguigu01.string.exer3;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.atguigu01.string.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 13:57
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class UserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] users = new User[3];
        users[0] = new User("songhk", "123");
        users[1] = new User("Tom", "8888");
        users[2] = new User("Jerry", "6666");

        System.out.println();

        System.out.print("请输入用户名：");
        String name = sc.next();
        System.out.print("请输入密码：");
        String passwd = sc.next();

        for (int i = 0; i < users.length; i++) {
            if (name.equals(users[i].getName())){
                if(passwd.equals(users[i].getPasswd())){
                    System.out.println("登陆成功：" + name);
                }else {
                    System.out.println("密码有误");
                }
                break;
            }else if(i == users.length-1){
                System.out.println("没有该用户");
            }
        }


    }
}
