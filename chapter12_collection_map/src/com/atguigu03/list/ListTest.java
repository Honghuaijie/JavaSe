package com.atguigu03.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: com.atguigu03.list
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 17:23
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ListTest {

    /**
     *
     *    增：
     *         add(Object obj)
     *         addAll(Collection coll)
     *    删：
     *         remove(Object obj)
     *         remove(int index)
     *    改：
     *         set(int index, Object ele)
     *
     *    查：
     *         get(int index)
     *         subList(int fromIndex, int toIndex)
     *         indexOf(Object obj)
     *         lastIndexOf(Object obj)
     *    插入：
     *         add(int index,Object obj)
     *         addAll(int index,Collection eles)
     *    长度：
     *         size()
     *
     *    遍历：
     *
     *       Iterator
     */

    @Test
    public void test1(){
        List list = new ArrayList();

        //add(Object obj)
        list.add(null);
        list.add(2); //自动装箱
        list.add("123");
        list.add(new Person("Tom", 15));

        //删除索引位置为2的元素
        list.remove(2);  //remove(int index)
        //删除元素为2的元素
        list.remove(Integer.valueOf(2));  //remove(Object obj)
        System.out.println(list);

        list.add(1,"abc");  //add(int index,Object obj)
        list.addAll(1, Arrays.asList(1,2,3));  //addAll(int index,Collection eles)


        list.set(1, "SSS");
        System.out.println(list.get(2));

        System.out.println(list);

    }
    @Test
    public void test2(){
        List list = new ArrayList();

        //add(Object obj)
        list.add(null);
        list.add(2); //自动装箱
        list.add("123");
        list.add(new Person("Tom", 15));
        list.add(4, "122");  //插入的位置不能超过本身集合长度

        Iterator iterator = list.iterator();

        //方式1： 迭代器
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //方式2；增强for
//        for (Object obj : list){
//            System.out.println(obj);
//        }

        //方式3：for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
