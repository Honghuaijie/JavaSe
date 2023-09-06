package com.atguigu02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileStreamTest
 * Package: com.atguigu02.filestream
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 15:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class FileStreamTest {

    /**
     * 使用字节流，复制图片wash.jpg为wash_copy
     */

    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1、创建相关的file类对象;
            File file = new File("wash.jpg");
            File file1 = new File("wash_copy.jpg");
            //2. 创建字节流

            fis = new FileInputStream(file);
            fos = new FileOutputStream(file1);

            //3.具体的操作步骤
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流资源
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 使用字节流，复制文本文件hello.txt为hello_copt.txt
     */

    @Test
    public void test2(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1、创建相关的file类对象;
            File file = new File("hello.txt");
            File file1 = new File("hello_copy.txt");
            //2. 创建字节流

            fis = new FileInputStream(file);
            fos = new FileOutputStream(file1);

            //3.具体的操作步骤
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流资源
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
