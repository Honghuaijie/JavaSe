package com.atguigu01.string.exer3;

/**
 * ClassName: User
 * Package: com.atguigu01.string.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 13:56
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class User {
    private String name;
    private String passwd;

    public User(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
