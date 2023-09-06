package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPtest
 * Package: com.atguigu02.tcpudp
 * Description:
 * 例题1：客户发送内容给服务器，服务器将内容打印到控制台上
 *
 * @Author honghuaijie
 * @Create 2023/9/2 21:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TCPtest {
    //客户端
    @Test
    public void client()  {
        //1、创建一个Socket
        Socket socket = null;
        OutputStream ops = null;
        try {
            InetAddress inet1 = InetAddress.getByName("127.0.0.1"); //要连接的服务器的IP地址
            int port = 8989; ////要连接的服务器的端口号
            socket = new Socket(inet1, port);
            //2、发送数据
            ops = socket.getOutputStream();
            ops.write("你好，我是客户端，请多多关照".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3、关闭Socket、流

            try {
                if (socket != null)
                    socket.close(); //关闭socket
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (ops != null)
                    ops.close(); //关闭流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    //服务端
    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream ops = null;
        InputStreamReader isr = null;
        try {
            int port = 8989;
            //创建一个ServerSocket
            serverSocket = new ServerSocket(port);
            //调用一个accept(),接受客户端的Socket
            socket = serverSocket.accept();
            System.out.println("服务器端已开启");

            System.out.println("收到了来自于" + socket.getInetAddress().getHostName() +  "的连接");
            //接受数据。方式1：
            ops = socket.getInputStream();
//            isr = new InputStreamReader(ops);
//            char[] buffer = new char[5];
//            int len;
//
//            while ((len = isr.read(buffer)) != -1){
//                String s = new String(buffer,0,len);
//                System.out.print(s);
//            }
            //接受数据。方式2：
            byte[] buffer = new byte[5];
            int len;
            ByteArrayOutputStream bois = new ByteArrayOutputStream();
            while ((len = ops.read(buffer)) !=-1){
                bois.write(buffer,0,len);
            }
            System.out.println(bois.toString());

            System.out.println("\n数据接收完毕 ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭客户端的Socket、流
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //关闭服务器的ServerSocket（一般服务器是不关闭的）
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
