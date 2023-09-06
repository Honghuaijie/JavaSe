package com.atguigu02.tcpudp.chat2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: ChatServerTest
 * Package: com.atguigu02.tcpudp.chat2
 * Description:
 *      服务器
 * @Author honghuaijie
 * @Create 2023/9/3 11:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ChatServerTest {
    static ArrayList<Socket> sockets = new ArrayList<>();
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);

            //不断的接收socket
            while (true){
                Socket socket = serverSocket.accept();

                sockets.add(socket);

                MessageHandler mh = new MessageHandler(socket);
                mh.start();//
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //将该客户端发送的数据，发送给所有客户端
    static class MessageHandler extends Thread{

        Socket socket;

        public MessageHandler(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                String ip = socket.getInetAddress().getHostAddress();
                sendToOther(ip + "上线了");
                InputStream inputstream = socket.getInputStream();
                InputStreamReader isr =new InputStreamReader(inputstream);
                Scanner input = new Scanner(isr);
//                BufferedReader br = new BufferedReader(isr);
                String str;
                while ((str = input.nextLine()) !=null){
                    //(2)给其他在线客户端转发
                    sendToOther(ip+":"+str);
                }
                sendToOther(ip+"下线了");

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                //从在线人员中移除我
                sockets.remove(socket);
            }

        }

        //封装一个方法：给其他客户端转发xxx消息
        public void sendToOther(String message) throws IOException{

            for (Socket socket :sockets){
                OutputStream outputStream = socket.getOutputStream();
                PrintStream ps = new PrintStream(outputStream);
                ps.println(message);
            }
        }
    }


}
