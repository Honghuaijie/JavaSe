package com.atguigu10._enum.apply;

/**
 * ClassName: Emplyee
 * Package: com.atguigu10._enum.apply
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 10:51
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Emplyee {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三",20,Status.BUSY);
        System.out.println(e1.toString());
    }
}
