package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest3
 * Package: com.atguigu02.tcpudp
 * Description:
 * 从客户端发送文件给服务端，服务端保存到本地，并返回“发送成功”给客户端，并关闭相应的连接
 *
 * @Author honghuaijie
 * @Create 2023/9/2 22:34
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TCPTest3 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        FileInputStream fis = null;  //覆写文件流
        OutputStream ops = null; //客户端输入流
        InputStream is = null; //服务器端输入流
        ByteArrayOutputStream baos = null;
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

            //表明客户端不再继续发送数据
            socket.shutdownOutput();
            System.out.println("文件发送成功");

            //接受来自于服务器端的数据
             is = socket.getInputStream();
             baos =  new ByteArrayOutputStream();
             byte[] buffer1 = new byte[5];
             int len1;
             while((len1 = is.read(buffer1)) != -1){
                 baos.write(buffer1,0,len1);
             }
            System.out.println(baos.toString());


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
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (baos != null)
                    is.close();
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
        OutputStream os = null; //此流是服务器向客户端发送数据
        try {
            int port = 9090;

            //1.创建serverSocket和接收socket
            serverSocket = new ServerSocket(port);
            System.out.println("服务器端已开启");
            socket = serverSocket.accept();


            System.out.println("服务器接受到了 " + socket.getInetAddress().getHostAddress() + "的连接");
            //接受数据
            //2.得到socket的输入流
            is = socket.getInputStream();
            //3.创建File类和输出流
            File srcFile = new File("wash2.jpg");
            fos = new FileOutputStream(srcFile);
            bois = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;

            //读写过程
            while ((len = is.read(buffer)) != -1) {
                bois.write(buffer, 0, len);
            }

            fos.write(bois.toByteArray());
            System.out.println("文件复制成功");

            //服务端发送数据给客户端
            os = socket.getOutputStream();
            os.write("你的图片很漂亮，我接受了".getBytes());

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
            try {
                if (os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;

        }


    }

}
