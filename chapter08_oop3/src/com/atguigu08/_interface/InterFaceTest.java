package com.atguigu08._interface;

/**
 * ClassName: InterFaceTest
 * Package: com.atguigu08._interface
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 10:15
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class InterFaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
//        Flyable.MIN_SPEED = 100;  //报错

        //接口的多态性
        Flyable f1 = new Bullet();
        f1.fly();
        System.out.println(f1.MAX_SPEED);

        Attackable a1 = new Bullet();
        a1.attackAble();


    }
}

interface Flyable{
    public static final int  MIN_SPEED = 0;

    //可以省略 public static final
    int MAX_SPEED = 100;

    public abstract void fly();

}
interface Attackable{
    //省略public abstract
    void attackAble();


}

class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {
        System.out.println("子弹飞");
    }

    @Override
    public void attackAble() {
        System.out.println("子弹攻击");
    }
}

interface AA extends Flyable, Attackable{

}