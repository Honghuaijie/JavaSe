package com.atguigu02.selfdefine;

import java.util.ArrayList;

/**
 * ClassName: Order
 * Package: com.atguigu02.selfdefine
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 11:43
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Order<T> {
    T t;
    String name;

    public Order() {
    }

    public Order(T t, String name) {
        this.t = t;
        this.name = name;
    }

    //泛型方法
    public <E> E method(E e){
        return e;
    }

    //将传入的泛型数组，放入ArraysList方法中
    public static  <E> ArrayList<E> copuFromArrayToList(E[] arr){
        ArrayList<E> arrayList = new ArrayList<>();

        for (E e : arr){
            arrayList.add(e);
        }
        return arrayList;

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
