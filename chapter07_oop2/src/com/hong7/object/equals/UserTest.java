package com.hong7.object.equals;

import java.util.Objects;

/**
 * ClassName: UserTest
 * Package: com.hong7.object.equals
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 14:21
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("张三",12);
        User u2 = new User("张三",12);

        System.out.println(u1.equals(u2));

        String s1 = new String("hong");
        String s2 = new String("hong");
        System.out.println(s1.equals(s2));

    }

}


class User{
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    //重写equals（）；
    //手动实现
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//
//        if(obj instanceof User){
//            User user = (User)obj;
//            if(this.age == user.age && this.name.equals(user.name)){
//                return true;
//            }
//        }
//        return false;
//    }

    //IDEA自动实现

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

}