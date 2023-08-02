package com.hong1._this.exer1;

/**
 * ClassName: Girl
 * Package: com.hong1._this.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/2 17:20
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Girl {
    private String name;
    private int age;

    public Girl(){

    }
    public Girl(String name , int age){
        this.name = name;
        this.age =age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我要嫁给:" + boy.getName());
        boy.marry(this);

    }

    /**
     *
     * 比较两个girl的大小（age)
     * @param girl
     * @return 正数：当前对象大，负数：当前对象小； 等于0：相等
     */
    public int compare(Girl girl){
        if(this.age > girl.age){
            return 1;
        }else if(this.age < girl.age){
            return -1;
        }else{
            return 0;
        }
    }
}
