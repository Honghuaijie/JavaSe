package com.atguigu04.block;

/**
 * ClassName: BlockTest
 * Package: com.atguigu04.block
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 15:46
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BlockTest {
    public static void main(String[] args) {
        Block b1 = new Block();
        System.out.println(b1.age);

    }
}

class Block{
    String name;
    static int balance;

    Block(){
        System.out.println("我是构造方法");
    }

    //非静态代码块
    {

        System.out.println("我是非静态代码块");
        age =23;
    }
    int age=10;


    //静态代码块

    static {
        System.out.println("我是静态代码块2");
        balance =23;
    }
    static {
        System.out.println("我是静态代码块1");
    }

}
