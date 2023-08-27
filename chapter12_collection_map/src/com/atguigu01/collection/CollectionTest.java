package com.atguigu01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ClassName: CollectionTest
 * Package: com.atguigu01.collection
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 14:52
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CollectionTest {

    /**
     *
     *  （1）add(Object obj)：添加元素对象到当前集合中
     *  （2）addAll(Collection other)：添加other集合中的所有元素对象到当前集合中，
     *          即this = this ∪ other
     */

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("123");
        coll.add(Integer.valueOf(123));
        coll.add(123); //自动装箱
        coll.add(new Object());
        coll.add(new Person("hong", 12));

        System.out.println(coll);

        Collection coll1 = new ArrayList();
        coll1.add("123");
        coll1.add(123);
//        coll1.addAll(coll);
        coll1.add(coll);
        System.out.println(coll1);
        //size()
        System.out.println(coll1.size());


    }


    /**
     * （3）int size()：获取当前集合中实际存储的元素个数
     * （4）boolean isEmpty()：判断当前集合是否为空集合
     * （5）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
     * （6）boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。
     *              即coll集合是否是当前集合的“子集”
     * （7）boolean equals(Object obj)：判断当前集合与obj是否相等
     */

    @Test
    public void test2(){
        //add()
        Collection coll = new ArrayList();
        coll.add(new Person("hong", 12));
        coll.add("123");
        coll.add(Integer.valueOf(123));
        coll.add(123); //自动装箱
        coll.add(null);
        //size()
        System.out.println(coll.size());

        //isEmpty()
//        Collection coll1 = new ArrayList();
//        System.out.println(coll1.isEmpty());

        //contains(Object obj)  根据obj的equals方法来判断集合中每个元素是否与obj相等--obj.equals(集合中的元素)
        System.out.println(coll.contains("123"));
        System.out.println(coll.contains(123));
        System.out.println(coll.contains(null));
        System.out.println(coll.contains(new Person("hong", 12)));


//        containsAll(Collection coll)
        Collection coll1 = new ArrayList();
        coll1.add(new Person("hong", 12));
        coll1.add("133");
        System.out.println(coll.containsAll(coll1));
    }


    /**
     * （8）void clear()：清空集合元素
     * （9） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
     * （10）boolean removeAll(Collection coll)：从当前集合中删除所有与coll集合中相同的元素。即this = this - this ∩ coll
     * （11）boolean retainAll(Collection coll)：从当前集合中删除两个集合中不同的元素，使得当前集合仅保留与coll集合中的元素相同的元素，即当前集合中仅保留两个集合的交集，即this  = this ∩ coll；
     */
    @Test
    public void test3(){

        Collection coll = new ArrayList();
        coll.add(new Person("hong", 12));
        coll.add("123");
        coll.add(Integer.valueOf(123));
        coll.add(123); //自动装箱
        coll.add(null);
        System.out.println(coll);
        //clear()：
//        coll.clear();

//        remove(Object obj)
        System.out.println(coll.remove(new Person("hong", 12)));
        System.out.println(coll.remove(123));

        System.out.println(coll);
    }


    /**
     * （12）Object[] toArray()：返回包含当前集合中所有元素的数组
     * （13）hashCode()：获取集合对象的哈希值
     * （14）iterator()：返回迭代器对象，用于集合遍历
     */

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(new Person("hong", 12));
        coll.add("123");
        coll.add(123); //自动装箱
        coll.add(null);

        System.out.println(coll);
        //toArray()
        Object[] objects = coll.toArray();
        System.out.println(Arrays.toString(objects));

        //hashCode();
        System.out.println(coll.hashCode());


    }

    @Test
    public void test5(){
        String[] strings = new String[]{"AA","BB","CC"};
        Collection strings1 = Arrays.asList(strings);
        Collection coll = Arrays.asList("aa","bb",1223);
        System.out.println(coll);
    }
    
    @Test
    public void test6(){
        Integer[] integers = new Integer[]{1,2,3};
        List list1 = Arrays.asList(integers);  // Arrays.asList(1,2,3)
        System.out.println(list1.size()); //3

        int[] arr = new int[]{1,2,3};
        List ints = Arrays.asList(arr);
        System.out.println(ints.size()); //1

    }
}
