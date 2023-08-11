package com.atguigu05.field;

/**
 * ClassName: Test
 * Package: com.atguigu05.field
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 17:08
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Test {
    public static void main(String[] args) {
        Exer e1 = new Exer();
        System.out.println(e1.num);
    }
}

class Exer{
    int num = 1;

    {
        num = 2;
    }

    Exer(){
        num = 4;
    }

    Exer(int num){
        this.num = num;
    }

}
