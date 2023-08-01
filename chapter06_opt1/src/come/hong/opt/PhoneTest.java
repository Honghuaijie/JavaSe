package come.hong.opt;
/**
 * ClassName: PhoneTest
 * Package: come.hong.opt
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/30 12:53
 * @Version 1.0
 * 不积跬步无以至千里
 */

/*
* 面向对象完成具体功能的操作的三步骤：
* 1. 创建类，并设计类的成员（属性、方法）
* 2. 实例类的对象，Phone p1 = new Phone();
* 3. 通过对象，调用其内部的属性和方法，完成相关功能
* */
public class PhoneTest {  //是手机类的测试类
    public static void main(String[] args) {
        //创建phone对象
        // 数据类型 变量名 = 变量值
        Phone p1 = new Phone();
        //通过phone的对象，调用其内部的属性和方法
        p1.name = "huawei mata50";
        p1.price = 6999;

        System.out.println("name: " + p1.name + " price: " + p1.price);

        //调用方法
        p1.call();
        p1.sendMessage("你好啊");
        p1.playGame();
    }


}
