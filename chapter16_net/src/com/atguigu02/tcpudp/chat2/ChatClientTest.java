package com.atguigu02.tcpudp.chat2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: ChatClientTest
 * Package: com.atguigu02.tcpudp.chat2
 * Description:
 *   客户端
 * @Author honghuaijie
 * @Create 2023/9/3 11:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ChatClientTest {
    public static void main(String[] args) {
        //1.连接服务器，端口9090
        try {
            Socket socket = new Socket("127.0.0.1",9090);

            Send send = new Send(socket);
            send.start();

            Receive receive = new Receive(socket);
            receive.start();

            send.join(); //当发送”bye“后，线程就会关闭，客户端也应该关闭

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

//发送数据给服务器
class Send extends Thread{
    Socket socket;

    public Send(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            OutputStream outputStream = socket.getOutputStream();
            PrintStream ps = new PrintStream(outputStream);
            while (true){
                System.out.print("自己的话");

                String str = scanner.nextLine(); //接受一整行

                if ("bye".equals(str)){
                    break;
                }
                ps.println(str);
            }
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

//接受服务器发送过来的数据
class Receive extends Thread{
    Socket socket;

    public Receive(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            Scanner input = new Scanner(inputStream);  //将输入流都输入到input中
            while (input.hasNextLine()){
                String str =input.nextLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}