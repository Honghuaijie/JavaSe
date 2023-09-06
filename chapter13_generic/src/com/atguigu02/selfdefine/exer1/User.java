package com.atguigu02.selfdefine.exer1;

/**
 * ClassName: User
 * Package: com.atguigu02.selfdefine.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 12:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class User {
    private int id;
    private int age;
    private String name;

    public User() {
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
