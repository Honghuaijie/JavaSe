package com.atguigu02.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName: IteratorTest
 * Package: com.atguigu02.iterator
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 16:20
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(null);
        coll.add("123");
        coll.add(123); //自动装箱
        Iterator iterator = coll.iterator();
        System.out.println(iterator.getClass());

        //方式1：
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());  //如果超出了集合的长度就会报错NoSuchElementException

        //方式2
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式3：
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
