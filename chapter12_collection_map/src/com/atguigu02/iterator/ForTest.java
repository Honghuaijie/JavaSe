package com.atguigu02.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: ForTest
 * Package: com.atguigu02.iterator
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 16:43
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ForTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(null);
        coll.add("123");
        coll.add(123); //自动装箱

        for(Object obj : coll){  //底层使用的还是迭代器
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        String[] strs = new  String[]{"aa","bb","cc"};
        for(String str : strs){
            System.out.println(str);
        }
    }

}
