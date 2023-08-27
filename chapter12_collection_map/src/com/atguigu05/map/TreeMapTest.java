package com.atguigu05.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName: TreeMapTest
 * Package: com.atguigu05.map
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 14:45
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TreeMapTest {
    /**
     * 自然排序
     */
    @Test
    public void test1(){
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 43);
        User u3 = new User("Rose", 13);
        User u4 = new User("Jack", 23);
        User u5 = new User("Tony", 33);

        Map map = new TreeMap();

        map.put(u1, 78);
        map.put(u2, 76);
        map.put(u3, 88);
        map.put(u4, 45);
        map.put(u4, 66);
        map.put(u5, 99);

        Set entrySet = map.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }

    }

    /**
     * 定制排序
     */
    @Test
    public void test2(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if( o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    int value = u1.getName().compareTo(u2.getName());
                    if(value !=0){
                        return value;
                    }
                    return u1.getAge() - u2.getAge();
                }

                throw new RuntimeException("类型不匹配");
            }
        };
        Map map = new TreeMap(comparator);

        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 43);
        User u3 = new User("Rose", 13);
        User u4 = new User("Jack", 23);
        User u5 = new User("Tony", 33);


        map.put(u1, 78);
        map.put(u2, 76);
        map.put(u3, 88);
        map.put(u4, 45);
        map.put(u4, 66);
        map.put(u5, 99);

        Set entrySet = map.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }


    }
}
