package com.atguigu07._abstract.template;

/**
 * ClassName: TemplateTest
 * Package: com.atguigu07._abstract.template
 * Description: 抽象类的模版方法的设计模式
 *
 * @Author honghuaijie
 * @Create 2023/8/11 22:16
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p1 = new PrintPrimeNumber();
        p1.spendTime();
    }
}

abstract class Template{


    //测试一段代码花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();

        //要测试的代码
        code();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public abstract void code();
}

class PrintPrimeNumber extends  Template{

    //打印2---10000的质数
    public void code(){

        for (int i = 2; i < 10000; i++) {
            boolean falg = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0 ){
                    falg = false;
                }
            }
            if(falg){
                System.out.println(i);
            }
        }
    }
}
