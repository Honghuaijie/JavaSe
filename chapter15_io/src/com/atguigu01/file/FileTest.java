package com.atguigu01.file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileTest
 * Package: com.atguigu01.file
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 9:30
 * @Version 1.0
 * 不积跬步无以至千里
 */

public class FileTest {

    /**
     * public File(String pathname) ` ：以pathname为路径创建File对象，可以是绝对路径或者相对路径，
     *                  如果pathname是相对路径，则默认的当前路径在系统属性user.dir中存储。
     * public File(String parent, String child) ` ：以parent为父路径，child为子路径创建File对象。
     * public File(File parent, String child)` ：根据一个父File对象和子文件路径创建File对象
     *
     *  关于路径：
     *
     * - **绝对路径：**从盘符开始的路径，这是一个完整的路径。
     * - **相对路径：**相对于`项目目录`的路径，这是一个便捷的路径，开发中经常使用。
     *          - IDEA中，main中的文件的相对路径，是相对于"`当前工程`"
     *          - IDEA中，单元测试方法中的文件的相对路径，是相对于"`当前module`"
     */
    @Test
    public void test1(){
        //public File(String pathname)
        File file1 = new File("D:\\io.txt");
        File file2 = new File("ab");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file2.getAbsoluteFile());
    }

//    public static void main(String[] args) {
//        File file2 = new File("ab");
//        System.out.println(file2.getAbsoluteFile());
//    }

    @Test
    public void test2(){
        //public File(String parent, String child)
        //参数1：一定是一个文件目录
        //参数2：可以是一个文件，也可以是一个文件目录
        File file = new File("D:\\io", "ab.txt");
        File file2 = new File("D:\\io", "abc");



        //public File(File parent, String child)
        //参数1：一定是一个文件目录
        //参数2：可以是一个文件，也可以是一个文件目录
        File file1 = new File(file2, "ab.txt");
        System.out.println(file1.getAbsoluteFile());
    }
}
