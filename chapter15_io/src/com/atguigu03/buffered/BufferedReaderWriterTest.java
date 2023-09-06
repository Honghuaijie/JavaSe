package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedReaderWriterTest
 * Package: com.atguigu03.buffered
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 17:12
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BufferedReaderWriterTest {
    /**
     * 使用bufferedReader和BufferedWriter实现文本文件的复制
     *
     * 注意：开发中还是要用try-catch-finall来处理流的异常
     */

    @Test
    public void test1() throws IOException {
        //1造文件、造流
        File srcFile = new File("dbcp_utf-8.txt");
        File destFile = new File("dbcp_utf-8_copy.txt");

        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));

        //2文件的读写操作
        String data;
        while ((data = br.readLine()) !=null){
            System.out.println(data);
            bw.write(data);
            bw.newLine(); //表示换行操作
            bw.flush(); //刷新的方法。每当调用此方法，就会自动的将内存中的数据写出到磁盘文件
        }
        System.out.println("复制成功!");

        //3、流资源的关闭
        br.close();
        bw.close();
    }
}
