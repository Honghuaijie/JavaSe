package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferStreamTest
 * Package: com.atguigu03.buffered
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 16:52
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BufferStreamTest {

    /**
     * 使用缓冲流和字节流复制图片
     */

    @Test
    public void test1()throws IOException{
        //1.创建File类和 相关的流对象
        File srcFile = new File("wash.jpg");
        File destFile = new File("wash_copy1.jpg");

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //2.具体的读入和写出操作
        byte[] buffer = new byte[50];
        int len;

        while((len = bis.read(buffer)) != -1){
            bos.write(buffer,0,len);
        }

        //3.流资源的关闭
        //外层的流的关闭
        //由于外层流的关闭也会自动的对内层流进行关闭操作，所以可以省略对内层流关闭的操作
        bis.close();
        bos.close();

        //内层的流的关闭
        //fis.close();
        //fos.close();
    }
}
