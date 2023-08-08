package com.hong6.polymorphism.exer2;

/**
 * ClassName: AnimalTest
 * Package: com.hong6.polymorphism.apply
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/6 19:20
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest a = new AnimalTest();
        a.adopt(new Dog());
        a.adopt(new Cat());

//        Animal d1 = new Dog();
//        Animal c1 = new Cat();


    }

    public void adopt(Animal animal){ //Animal animal = new Dog()
        animal.eat();
        animal.jump();

        if(animal instanceof Dog){
            Dog d2 = (Dog)animal;
            d2.watchDoor();
        }

        if(animal instanceof Cat){
            Cat c2 = (Cat)animal;
            c2.catchMouse();
        }
    }
}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void jump(){
        System.out.println("动物跳");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void jump(){
        System.out.println("狗急跳墙");
    }
    public void watchDoor(){
        System.out.println("狗看家");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫爬墙");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
