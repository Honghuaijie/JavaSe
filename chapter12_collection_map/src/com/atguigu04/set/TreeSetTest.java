package com.atguigu04.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName: TreeSetTest
 * Package: com.atguigu04.set
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 9:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TreeSetTest {

    /**
     * 自然排序
     */
    @Test
    public void test1(){
        Set set = new TreeSet();

        User u1 = new User("Tom", 20);
        User u2 = new User("Jerry", 21);
        User u3 = new User("Doby", 34);
        User u4 = new User("Zonic", 20);
        User u5 = new User("Filouli", 19);

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    /**
     * 定制排序
     * 按姓名从小到大，年龄从大到小
     */

    @Test
    public void test2(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 == o2){
                    return 0;
                }
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    int value = u1.getName().compareTo(u2.getName());
                    if(value != 0 ){
                        return value;
                    }
                    System.out.println("111");
                    return -(u1.getAge() - u2.getAge());
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        Set set = new TreeSet(comparator);

        User u1 = new User("Tom", 20);
        User u2 = new User("Jerry", 21);
        User u3 = new User("Rose", 34);
        User u4 = new User("Jack", 20);
        User u5 = new User("Tony", 19);

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3(){
        char c1 = 'T';
        char c2 = 'J';
        char c3 = 'R';
        int i1 = c1;
        int i2 = c2;
        int i3 = c3;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        Set set = new TreeSet();

        set.add(123);
        set.add(123);
        set.add(3445);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
