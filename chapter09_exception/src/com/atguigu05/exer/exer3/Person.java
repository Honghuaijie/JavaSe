package com.atguigu05.exer.exer3;

/**
 * ClassName: Person
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 20:41
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person {
    private String name;
    private  int lifeValue;


    public Person() {
    }

    public Person(String name, int lifeValue) {
        this.name = name;
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue)  {
        if(lifeValue >= 0){
            this.lifeValue = lifeValue;
        }else{
            throw new NoLifeValueException("生命值不能为负数：" + lifeValue);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
