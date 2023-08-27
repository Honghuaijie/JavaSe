package com.atguigu04.set.exer1;

import java.util.*;

/**
 * ClassName: Exer1
 * Package: com.atguigu04.set.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 10:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(345);
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(345);
        list.add(345);
        list.add(345);
        list.add(345);
        list.add(345);
        list.add(345);
        list.add(345);
        list.add(345);
        list.add(345);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(123);

        System.out.println(list);

        List newList = duplicateList(list);

        System.out.println(newList);

    }

    //方式一：使用set
    public static List duplicateList(List list){
//        Set set = new TreeSet();
//        List newList = new ArrayList();
//        Iterator iterator = list.iterator();
//
//        for(Object obj : list){
//            set.add(obj);
//        }
//
//        System.out.println(set);
//
//        for (Object obj : set){
//            newList.add(obj);
//        }
//
        Set set = new TreeSet(list);
        List newList = new ArrayList();

        for (Object obj : set){
            newList.add(obj);
        }
        return newList;

    }

    //方式2：使用contains

//    public static List duplicateList(List list){
//        List newList = new ArrayList();
//
//        for (Object obj : list){
//            if(!newList.contains(obj)){
//                newList.add(obj);
//            }
//
//        }
//        return  newList;
//    }
}
