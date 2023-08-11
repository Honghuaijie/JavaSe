package com.atguigu01._static;

/**
 * ClassName: ChineseTest
 * Package: com.atguigu01._static
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 9:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ChineseTest {
    public static void main(String[] args) {
//        Chinese.country = "中国";
        Chinese c1 = new Chinese("张三",12);
        Chinese c2 = new Chinese("李四",12);
//        c1.country = "china";
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.country);
        System.out.println(c2.country);

        c1.country = "chinese";
        System.out.println(c1.country);
        System.out.println(c2.country);

    }

}

class Chinese{
    String name;
    int age;

    static String country;
    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
        country = "中国";
        System.out.println(toString());
        method();
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void method(){
        System.out.println("静态方法");
        //调用静态的结构
        System.out.println(country);
        show();

        //调用非静态的结构
//        System.out.println(name);
//        toString();
    }

    public static void show(){
        System.out.println("我是静态的测试方法");
    }
}