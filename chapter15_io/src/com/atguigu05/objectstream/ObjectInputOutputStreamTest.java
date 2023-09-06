package com.atguigu05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ObjectInputOutputStreamTest
 * Package: com.atguigu05.objectstream
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/1 23:52
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ObjectInputOutputStreamTest {
    /**
     * 序列化过程：使用objectoutputstream流实现。将内存中的Java对象保存在文件中或者通过网络传输出去
     */
    @Test
    public void test1() throws IOException {
        File file = new File("object.txt");
        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeUTF("江山如此多娇，引无数英雄尽折腰");
        oos.flush();

        oos.writeObject(new String("你好"));
        oos.flush();

        oos.close();

    }



    /**
     * 反序列化过程：使用ObjectInputStream流实现，将文件中的数据或者通过网络传输过来的数据，还原为内存中的Java对象
     */

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        File file = new File("object.txt");
        FileInputStream fis = new FileInputStream(file);

        ObjectInputStream ois = new ObjectInputStream(fis);
        String str = ois.readUTF();
        System.out.println(str);
        String s1 = (String) ois.readObject();
        System.out.println(s1);
        ois.close();
    }

    /**
     * 演示自定义类的对象的序列化和反序列化过程
     * @throws IOException
     */
    @Test
    public void test3() throws IOException {
        File file = new File("object1.dat");
        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Person("Tom",12));
        oos.writeObject(new Person("Tom",12,new Account(120)));
        oos.flush();
        oos.close();

    }

    @Test
    public void test4() throws IOException, ClassNotFoundException {
        File file = new File("object1.dat");
        FileInputStream fis = new FileInputStream(file);

        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        Person person2 = (Person) ois.readObject();
        System.out.println(person);
        System.out.println(person2);
        ois.close();
    }

}
