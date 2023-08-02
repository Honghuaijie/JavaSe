package com.hong1._this;

/**
 * ClassName: User
 * Package: com.hong1._this
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 17:07
 * @Version 1.0
 * 不积跬步无以至千里
 */
class User {
    String name;
    int age;

    public User(){
        System.out.println("此处有50行初始化代码");
    }

    public User(String name){
        this();
        this.name = name;
    }

    public User(String name, int age){
        this(name);
        this.age =age;
    }
}

public class UserTest{
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User("hhj");
        User u3 = new User("hhj",20);
    }
}
