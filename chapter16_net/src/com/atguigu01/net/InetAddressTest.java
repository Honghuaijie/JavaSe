package com.atguigu01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Package: com.atguigu01.net
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/2 17:45
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("127.0.0.1"); //获取指定ip对应的InetAddress实例
            System.out.println(inet1);
            InetAddress inet2 = InetAddress.getLocalHost();//获取本地ip对应的InetAddress的实例
            System.out.println(inet2);
            InetAddress inet3 = InetAddress.getByName("www.niit.edu.cn"); //获取指定ip对应的InetAddress实例


            //两个常用方法
//            System.out.println(inet1.getHostName());  //得到域名，没有域名显示的是ip地址
//            System.out.println(inet1.getHostAddress()); // 得到主机名


            System.out.println(inet3.getHostName());  //得到域名，没有域名显示的是ip地址
            System.out.println(inet3.getHostAddress()); // 得到主机名


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
