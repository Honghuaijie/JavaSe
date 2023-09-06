package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPtest2
 * Package: com.atguigu02.tcpudp
 * Description:
 * 客户端发送文件给服务器，服务器将本间保存在本地
 *
 * @Author honghuaijie
 * @Create 2023/9/2 22:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TCPtest2 {

    //客户端
    @Test
    public void client() {
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream ops = null;
        try {
            //1.创建socket
            int port = 9090; //服务器的端口号
            socket = new Socket("127.0.0.1", port);

            //2.创建File流和输入流
            File srcFile = new File("wash.jpg");
            fis = new FileInputStream(srcFile);
            byte[] buffer = new byte[1024];
            int len;
            //使用socket的getOutputStream输出流
            ops = socket.getOutputStream();
            while ((len = fis.read(buffer)) != -1) {
                ops.write(buffer, 0, len);
            }
            System.out.println("输发送成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流和socket
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ops != null)
                    ops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
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
        InputStream is = null;  //此流是用来读取客户端传送来的数据
        FileOutputStream fos = null; // 此流是用来将客户端传来文件输出到本地
        ByteArrayOutputStream bois = null; //此流是将客户端输入的字节保存到一个byte数组中

        try {
            int port = 9090;

            //创建serverSocket和接收socket
            serverSocket = new ServerSocket(port);
            System.out.println("服务器端已开启");
            socket = serverSocket.accept();




            System.out.println("服务器接受到了 " + socket.getInetAddress().getHostAddress() + "的连接");
            //接受数据
            //得到socket的输入流
            is = socket.getInputStream();
            //创建File类和输出流
            File srcFile = new File("wash1.jpg");
            fos = new FileOutputStream(srcFile);
            bois = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;

            while ((len = is.read(buffer)) != -1) {
                bois.write(buffer, 0, len);
            }

            fos.write(bois.toByteArray());
            System.out.println("文件复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流和serverSocket
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bois != null)
                    bois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null)
                    serverSocket.close();
                System.out.println("服务器端已关闭");
            } catch (IOException e) {
                e.printStackTrace();

            }

        }


    }

}
