package com.atguigu02.singleton;

/**
 * ClassName: BankTest
 * Package: com.atguigu02.singleton
 * Description:实现饿汉式
 *
 * @Author honghuaijie
 * @Create 2023/8/9 13:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BankTest {
    public static void main(String[] args) {
        Bank b1 = Bank.getBank();
        Bank b2 = Bank.getBank();
        System.out.println(b1 == b2);
    }
}

class Bank{

    //1.将构造器私有化
    private Bank(){

    }

    //2.实例化当前类的实例，初始化对象
    //4.此属性必须声明为static
    private static Bank bank = new Bank();

    //3.通过get方法获取当前类的实例
    public static Bank getBank(){
        return bank;
    }
}
