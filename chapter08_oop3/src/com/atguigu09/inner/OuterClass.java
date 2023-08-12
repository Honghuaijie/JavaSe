package com.atguigu09.inner;

/**
 * ClassName: OuterClass
 * Package: com.atguigu09.inner
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 20:15
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OuterClass {

    public static void main(String[] args) {
        //创建静态的成员内部类的实例
        Person.Dog dog = new Person.Dog();
        dog.eat();
        //创建非静态的成员内部类的实例
        Person p1 = new Person();
        Person.Bird bird  = p1.new Bird();
        bird.fly();
        bird.show("黄鹂");
        bird.show2();
    }

}

class Person{  //外部类
    String name = "Tom";
    int age =0;

    static String area;

    public void fly(){
        System.out.println("人坐工具飞");
    }
    public void eat(){
        System.out.println("人吃饭");
    }

    //静态的成员内部类
    //静态的成员内部类中无法调用外部类的非静态结构
    static class Dog{
        public void eat(){
            System.out.println("狗吃骨头");
            System.out.println(area);
        }
    }
    //非静态的成员内部类
    class Bird{
        String name = "啄木鸟";
        public void fly(){
            System.out.println("鸟飞");
        }

        //在成员内部类中调用外部类的属性
        public void show(String name){
            System.out.println(age); //这里的age省略了Person.this
            System.out.println(name);
            System.out.println(this.name);
            //调用外部类的属性
            System.out.println(Person.this.name);
        }

        //在成员内部类中调用外部类的方法
        public void show2(){
            fly();
            eat();
            Person.this.fly();
        }
    }



    public void method(){
        //局部内部类

        class InnerTest{

        }
    }




}
