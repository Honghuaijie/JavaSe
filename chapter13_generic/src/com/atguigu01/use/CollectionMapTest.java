package com.atguigu01.use;

import org.junit.Test;

import java.util.*;

/**
 * @author 尚硅谷-宋红康
 * @create 11:39
 */
public class CollectionMapTest {

    //体会集合中使用泛型前的场景
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(77);
        list.add(79);
        list.add(66);
        list.add(99);
        list.add("aaa");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            //在强转时可能会出现类型不匹配的问题ClassCastException
            Integer score = (Integer) iterator.next();
            int i = score;
            System.out.println(score);
        }
    }



    //在集合中使用泛型的例子
    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        list.add(77);
        list.add(79);
        list.add(66);
        list.add(99);
        //编译不通过，保证类型的安全


        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            //因为添加的都是Integer类型，避免了强转操作
            Integer score = iterator.next();
            int i = score;
            System.out.println(score);
        }
    }


    /**
     * 泛型使用map
     */

    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Tom",20);
        map.put("Jerry",32);
        map.put("Joy",40);

//        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        //jdk7新特性
        var entrySet = map.entrySet();
        var iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry= iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + "-->" + value);
        }



    }


    @Test
    public void test4(){
        ArrayList<Object> list = new ArrayList<>();
        list.add("aaa");

        System.out.println(list);
    }


}
