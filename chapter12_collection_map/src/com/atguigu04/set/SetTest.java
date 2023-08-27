package com.atguigu04.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: SetTest
 * Package: com.atguigu04.set
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 21:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SetTest {
    @Test
    public void test(){
        Set set = new HashSet();

        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add(new Person("Tom", 12));
        set.add(new Person("Tom", 12));

        for (Object o : set){
            System.out.println(o);
        }
    }

    @Test
    public void test1(){
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }

    @Test
    public void test2(){
        Set set = new HashSet();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add(new Person("Tom", 12));
        set.add(new Person("Tom", 12));

        Iterator iterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            System.out.println(iterator.next());
        }
    }
}
