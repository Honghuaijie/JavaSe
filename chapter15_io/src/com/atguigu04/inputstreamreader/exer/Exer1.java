package com.atguigu04.inputstreamreader.exer;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: Exer1
 * Package: com.atguigu04.inputstreamreader.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/1 14:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer1 {
    @Test
    public void test2() throws IOException {
        File srcFile = new File("康师傅的话.txt");
        File destFile = new File("寄语.txt");

        InputStreamReader isr = new InputStreamReader(new FileInputStream(srcFile),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile), "utf-8");

        char[] cBuffer = new char[1024];
        int len;
        while ((len = isr.read(cBuffer)) != -1 ){
            osw.write(cBuffer,0,len);
        }

        isr.close();
        osw.close();
    }
}
