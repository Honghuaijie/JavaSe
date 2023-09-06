package com.atguigu02.tcpudp;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: UDPTest
 * Package: com.atguigu02.tcpudp
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/3 11:55
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class UDPTest {
    //发送端
    @Test
    public void sender() throws Exception {
        //1.创建DatagramSocket的实例
        DatagramSocket ds = new DatagramSocket();

        //2.将数据、目的地的IP，目的地的端口号，都封装到DatagramPacket数据报
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        //数据报的数据只能是1028*64个字节
        byte[] bytes = "我是发送端".getBytes("utf-8");

        DatagramPacket  packet = new DatagramPacket(bytes,0,bytes.length,inetAddress,port);
        //2、发送数据
        ds.send(packet);

        ds.close();

    }


    //接收端
    @Test
    public void receiver() throws Exception {
        //1.创建DatagramSocket的实例
        DatagramSocket ds = new DatagramSocket(9090);

        //2.创建数据报对象，用来接收发送端发过来的数据
        byte[] buffer = new byte[1028*64];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        //3.接受数据
        ds.receive(packet);
        //4.获取数据，并打印到控制台上

//        String str = new String(buffer,0,packet.getLength());
        String str = new String(packet.getData(),0,packet.getLength());
        System.out.println(str);

    }
}
