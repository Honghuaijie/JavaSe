package com.atguigu02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: FileReaderWriterTest
 * Package: com.atguigu02.filestream
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 13:00
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class FileReaderWriterTest {
    /**
     * 需求：读取hello.txt中的内容，显示在控制台上
     */

    @Test
    public void test1() throws IOException {
        //1.创建File类的对象，对应着hello.txt文件
        File file = new File("hello.txt");

        //创建输入型的字符流，用于读取数据
        FileReader fileReader = new FileReader(file);


        //3.读取数据，并显示在控制台上。
        int data = fileReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }

        //4.流资源的关闭操作（必须要关闭，否则会内存泄露
        fileReader.close();
    }

    /**
     * 需求：读取hello.txt中的内容，显示在控制台上,
     * 使用try-catch关闭流资源
     */

    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            //1.创建File类的对象，对应着hello.txt文件
            File file = new File("hello.txt");

            //创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);


            //3.读取数据，并显示在控制台上。
            int data = fileReader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.流资源的关闭操作（必须要关闭，否则会内存泄露
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }


    /**
     * 需求：读取hello.txt中的内容，显示在控制台上,
     * 使用try-catch关闭流资源
     * 减少与磁盘的交互
     */

    @Test
    public void test3() {
        FileReader fileReader = null;
        try {
            //1.创建File类的对象，对应着hello.txt文件
            File file = new File("hello.txt");

            //创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);


            //3.读取数据，并显示在控制台上。
            char[] cbuffer = new char[5];
            int len;
            while ((len = fileReader.read(cbuffer)) != -1) {   //fileReader.read(cbuffer)返回的是读取字符的长度
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuffer[i]);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流资源的关闭操作（必须要关闭，否则会内存泄露
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    /**
     * 需求：将内存中的数据写入指定的文件
     */

    @Test
    public void test4() {
        FileWriter fw = null;
        try {
            File file = new File("info.txt");

            //2.创建输出流
            //覆盖文件使用的构造器
//            fw = new FileWriter(file);
//            fw = new FileWriter(file,false);
            //在现有的文件基础上，追加内容使用的构造器
            fw = new FileWriter(file, true);

            //3.写出的具体操作
            fw.write("hello world\n");
            fw.write("i am china people\n");
            fw.write("you are beautiful\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭流资源
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 将helll文件中的数据输入到info1中
     */

    @Test
    public void test5() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file = new File("info.txt");
            File file1 = new File("info2.txt");

            //读file
            fr = new FileReader(file);
            //写file1
            fw = new FileWriter(file1,true);
            char[] cbuffer = new char[5];
            int len;

            while ((len = fr.read(cbuffer)) != -1) {
                fw.write(cbuffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
