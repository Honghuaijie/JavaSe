package com.hong7.object.tostring;

/**
 * @author 尚硅谷-宋红康
 * @create 1:04
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1= new User("hong",12);
        System.out.println(u1);
        System.out.println(u1.toString());
    }
}

class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name = " + name + ",age = " + age + "}";
    }
}