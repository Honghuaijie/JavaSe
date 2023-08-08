package com.hong6.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Package: com.hong6.polymorphism.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 11:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest i1 = new InstanceTest();
        Person p1 = new Person();
        Student s1 = new Student();
        Graduate g1 = new Graduate();

        i1.method(p1);
        i1.method(s1);
        i1.method(g1);

    }
    public void method(Person e){
        System.out.println(e.getInfo());
        System.out.println("*****----");
        if( e instanceof Graduate){
            System.out.println("a graduated student");
        }

        if( e instanceof Student){
            System.out.println("a  student");
        }

        if( e instanceof Person){
            System.out.println("a  Person");
        }
    }
}
