package com.atguigu11.annotation;

/**
 * ClassName: AnnotationTest
 * Package: com.atguigu11.annotation
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/13 19:34
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class AnnotationTest {
    public static void main(String[] args) {
        int num = 20;
        @SuppressWarnings("unused")
        Person p1 = new Person("hong");
        System.out.println(p1);
    }
}


@MyAnnotation(value = "class")
class Person{
    String name;
    int age;

    @MyAnnotation()
    public Person(){}
    @Deprecated
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
