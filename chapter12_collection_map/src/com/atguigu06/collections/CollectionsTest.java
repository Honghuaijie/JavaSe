package com.atguigu06.collections;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionsTest
 * Package: com.atguigu06.collections
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 16:18
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CollectionsTest {

    /**
     * **排序操作：**
     *
     * - reverse(List)：反转 List 中元素的顺序
     * - shuffle(List)：对 List 集合元素进行随机排序
     * - sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
     * - sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
     * - swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
     */

    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(5);
        System.out.println(list);

        //reverse 反转
        Collections.reverse(list);
        System.out.println(list);

        //shuffle
        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Integer && o2 instanceof  Integer){
                    int i1 = (Integer)o1;  //自动插箱
                    int i2 = (Integer)o2;  //自动插箱
                    return -(i1-i2);
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(list);

        //swap
        Collections.swap(list,0, 2);
        System.out.println(list);

    }


    /**
     * **查找**
     *
     * - Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
     * - Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
     * - Object min(Collection)：根据元素的自然顺序，返回给定集合中的最小元素
     * - Object min(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最小元素
     * - int binarySearch(List list,T key)在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且必须是可比较大小的，即支持自然排序的。而且集合也事先必须是有序的，否则结果不确定。
     * - int binarySearch(List list,T key,Comparator c)在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且集合也事先必须是按照c比较器规则进行排序过的，否则结果不确定。
     * - int frequency(Collection c，Object o)：返回指定集合中指定元素的出现次数
     */
    @Test
    public void test2(){
        List list = new ArrayList();
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 43);
        User u3 = new User("Rose", 13);
        User u4 = new User("Jack", 23);
        User u5 = new User("Tony", 33);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u5);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;

                    int value = u1.getName().compareTo(u2.getName());
                    if(value !=0){
                        return value;
                    }

                    return u1.getAge()-u2.getAge();
                }
                throw  new RuntimeException("类型不匹配");
            }
        };


        System.out.println(Collections.max(list, comparator));
        System.out.println(Collections.min(list, comparator));

        System.out.println(Collections.binarySearch(list, new User("Tony", 33)));
        System.out.println(Collections.binarySearch(list, new User("Tony", 32),comparator));


        System.out.println(Collections.frequency(list, new User("Tony", 33)));

    }


    /**
     * **复制、替换**
     *
     * - void copy(List dest,List src)：将src中的内容复制到dest中
     * - boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
     * - 提供了多个unmodifiableXxx()方法，该方法返回指定 Xxx的不可修改的视图。
     */

    @Test
    public void test3(){
        List list = Arrays.asList(1,9,3,7,7,5);

        System.out.println(list);
        //错误的写法
        //List list1 = new ArrayList();
        //Collections.copy(list1,list);

        List list1 = Arrays.asList(new Object[list.size()]);
        Collections.copy(list1,list);
        System.out.println(list);
        System.out.println(list1);

        //此时的list2只能读，不能写
        List list2 = Collections.unmodifiableList(list);
//        list2.add("aa");
        System.out.println(list2.get(2));

    }


    /**
     * **添加**
     * - boolean addAll(Collection  c,T... elements)将所有指定元素添加到指定 collection 中。
     */

    @Test
    public void test4(){
        List list = new ArrayList();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(7);
        list.add(5);
        System.out.println(list);

        Collections.addAll(list,1,2,3);
        System.out.println(list);


    }

    /**
     * **同步**
     *
     * - Collections 类中提供了多个 synchronizedXxx() 方法，该方法可使将指定集合包装成线程同步的集合，
     * 从而可以解决多线程并发访问集合时的线程安全问题：
     */

    @Test
    public void test5(){
        List list = new ArrayList();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(7);
        list.add(5);
        System.out.println(list);
        Collections.synchronizedCollection(list);

        new Thread(){
            @Override
            public void run() {
                for (Object o : list){
                    System.out.println(o);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(list);

            }
        }).start();



    }
}
