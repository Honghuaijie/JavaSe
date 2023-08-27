package com.atguigu05.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * ClassName: MapTest
 * Package: com.atguigu05.map
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 12:02
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put(null,null);
        map.put(null,"123");
        map.put("456","123");
        map.put("hong","123");

        System.out.println(map);
    }

    @Test
    public void test2(){
        Map map = new Hashtable();
//        map.put(null,null); //NullPointerException
        map.put(null,"null"); //NullPointerException


        System.out.println(map);
    }
}
