package com.atguigu04.block.exer;

/**
 * ClassName: User
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 16:22
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;

    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis(); //获取当前系统时间（距离1970年1月1号0时0分0秒到现在的毫秒数
    }

    public User(){
        userName = System.currentTimeMillis() + "";
        password = "123456";
    }

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String getInfo(){
        return "用户名：" + userName + "，密码：" + password + "，注册时间：" + registrationTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

}
