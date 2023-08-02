package com.hong1._this.exer1;

/**
 * ClassName: Boy
 * Package: com.hong1._this.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 17:20
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Boy {
    private String name;
    private int age;

    public Boy(){

    }

    public Boy(String name, int age){
        this.name =name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void marry(Girl girl){
        System.out.println("我要娶：" + girl.getName());
    }

    public void shout(){
        if(getAge() > 22){
            System.out.println("我终于可以结婚了");
        }else{
            System.out.println("我只能谈恋爱了");
        }
    }
}
