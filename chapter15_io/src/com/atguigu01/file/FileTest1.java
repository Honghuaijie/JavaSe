package com.atguigu01.file;

import org.junit.Test;

import java.io.File;
import java.util.Date;

/**
 * ClassName: FileTest1
 * Package: com.atguigu01.file
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/31 9:48
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class FileTest1 {

    /**1.获取文件和目录基本信息
     *- public String getName() ：获取名称
     * - public String getPath() ：获取路径
     * - `public String getAbsolutePath()`：获取绝对路径
     * - public File getAbsoluteFile()：获取绝对路径表示的文件
     * - `public String getParent()`：获取上层文件目录路径。若无，返回null
     * - public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
     * - public long lastModified() ：获取最后一次的修改时间，毫秒值
     */

    @Test
    public void test1(){
        File file = new File("hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile().getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        Date date = new Date(file.lastModified());
        System.out.println(date);
    }



    @Test
    public void test2(){
        File file = new File("D:\\io\\io1");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile().getParent());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        Date date = new Date(file.lastModified());
        System.out.println(date);
    }

    /** 2、列出目录的下一级
     * - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
     * - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
     */

    @Test
    public void test3(){
        File file = new File("F:\\project\\java");

        String[] strList = file.list();
        for (String str: strList){
            System.out.println(str);
        }

        File[] files = file.listFiles();
        for (File file1: files){
            System.out.println(file1);
        }
    }

    @Test
    public void test4(){
//        File file1 = new File("F:\\project\\java\\hello.txt");
//        File file2 = new File("F:\\project\\java\\io1");
//
//        System.out.println(file1.renameTo(file2));
        File file1 = new File("abc.txt");
        File file2 = new File("hello.txt");

        System.out.println(file1.renameTo(file2));

    }
    //将F:\project\java\io下的文件名改为01 前缀
    @Test
    public void test5(){
        File file = new File("F:\\project\\java\\io");
        File[] files = file.listFiles();
        int i=1;
        for (File file1 : files){
            //父目录
            String parent = file1.getParent() +"\\";
            //修改文件名
            String name = (i< 10? "0" + i: String.valueOf(i)) + "-" + file1.getName();
            File file2 = new File(parent + name);
            file1.renameTo(file2);
            i++;
        }

    }
}
