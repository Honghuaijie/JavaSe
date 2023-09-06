package com.atguigu04.inputstreamreader;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: InputStreamReaderTest
 * Package: com.atguigu04.inputstreamreader
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 18:59
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class InputStreamReaderTest {

    @Test
    public void test1() throws IOException {

        File file = new File("dbcp_utf-8.txt");

        FileInputStream fis = new FileInputStream(file);

//        InputStreamReader isr = new InputStreamReader(fis); //此时使用的是IDEA默认的UTF-8的字符集
        InputStreamReader isr1 = new InputStreamReader(fis,"utf-8"); //显示的使用UTF-8的字符集

        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr1.read(cBuffer)) != -1){
            String str = new String(cBuffer,0,len);
            System.out.println(str);
        }
        isr1.close();
    }

    /**
     * 读取到的数据出现了乱码
     * 因为dbcp_utf-8.txt文件使用的是utf-8字符集进行的编码， 所以在读取文件时使用的解码集必须也是utf-8，
     * 否则会出现乱码
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {

        File file = new File("dbcp_utf-8.txt");

        FileInputStream fis = new FileInputStream(file);

        InputStreamReader isr1 = new InputStreamReader(fis,"gbk"); //显示的使用gbk的字符集

        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr1.read(cBuffer)) != -1){
            String str = new String(cBuffer,0,len);
            System.out.println(str);
        }
        isr1.close();
    }


    @Test
    public void test3() throws IOException {

        File file = new File("dbcp_gbk.txt");

        FileInputStream fis = new FileInputStream(file);

        InputStreamReader isr1 = new InputStreamReader(fis,"gbk"); //显示的使用gbk的字符集

        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr1.read(cBuffer)) != -1){
            String str = new String(cBuffer,0,len);
            System.out.println(str);
        }
        isr1.close();
    }

    /**
     * 需求，将gbk格式的文件转换为utf-8格式的文件存储
     *
     */
    @Test
    public void test4() throws IOException {
        File srcFile = new File("dbcp_gbk.txt");
        File destFile = new File("dbcp_gbk_to_utf8.txt");

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        InputStreamReader isr = new InputStreamReader(fis, "gbk"); //参数2是解码集。必须要与编码集一致
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        //这里不能用byte数组，因为通过字符转换编码
        char[] cBuffer = new char[1024];
        int len;

        while ((len = isr.read(cBuffer)) != -1){
            String str = new String(cBuffer,0,len);
            osw.write(str);
        }

        isr.close();;
        osw.close();
    }
}
