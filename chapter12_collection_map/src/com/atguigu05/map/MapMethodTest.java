package com.atguigu05.map;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: MapMethodTest
 * Package: com.atguigu05.map
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/27 13:37
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class MapMethodTest {
    /**
     * - 添加、修改操作：**
     *   - Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
     *   - void putAll(Map m):将m中的所有key-value对存放到当前map中
     * - 删除操作：
     *   - Object remove(Object key)：移除指定key的key-value对，并返回value
     *   - void clear()：清空当前map中的所有数据
     * - 元素查询的操作：**
     *   - Object get(Object key)：获取指定key对应的value
     *   - boolean containsKey(Object key)：是否包含指定的key
     *   - boolean containsValue(Object value)：是否包含指定的value
     *   - int size()：返回map中key-value对的个数
     *   - boolean isEmpty()：判断当前map是否为空
     *   - boolean equals(Object obj)：判断当前map和参数对象obj是否相等
     * - 元视图操作的方法：**
     *   - Set keySet()：返回所有key构成的Set集合
     *   - Collection values()：返回所有value构成的Collection集合
     *   - Set entrySet()：返回所有key-value对构成的Set集合
     */

    @Test
    public void test1(){
        Map map = new HashMap();
        //put(obj,obj)
        map.put("name", "Tom");
        Object v1 = map.put("age", 12);
        Object oldValue = map.put("age", 20); //12
        System.out.println(v1);
        System.out.println(oldValue);
        System.out.println(map);


        //putAll(map)
        Map map1 = new HashMap();
        map1.put("Tom", 12);
        map1.put("Jerry", 20);
        map1.putAll(map);
        System.out.println(map1);

        //value remove(key)
        Object value = map1.remove("name");
        Object value1 = map1.remove("qwerqwer");
        System.out.println(value);
        System.out.println(value1);
        System.out.println(map1);

        //claer()
        map1.clear();
        System.out.println(map1);
    }


    @Test
    public void test2(){
        Map map = new HashMap();
        //put(obj,obj)
        map.put("name", "Tom");
        map.put("age", 12);
        map.put("age", 20);
        map.put("Person", new Person("Jerry", 20));
        map.put("Person1", new Person("Jerry", 20));
        map.put(new Person("Jerry", 20),"Person");
        System.out.println(map);

        //get()
        Object value = map.get("name");
        System.out.println(value);

        //containsKey 、containsValue
        System.out.println(map.containsKey("Person"));
        System.out.println(map.containsKey(new Person("Jerry", 20)));

        System.out.println(map.containsValue(new Person("Jerry", 20)));

        //size()
        System.out.println(map.size());

        //isEmpty()
        System.out.println(map.isEmpty());


    }

    @Test
    public void test3(){
        Map map = new HashMap();
        //put(obj,obj)
        map.put("name", "Tom");
        map.put("age", 12);
        map.put("age", 20);
        map.put("Person", new Person("Jerry", 20));
        map.put("Person1", new Person("Jerry", 20));
        map.put(new Person("Jerry", 20),"Person");
        System.out.println(map);

        Set setKey = map.keySet();
        Collection value = map.values();
        Set setEntry = map.entrySet();

        System.out.println(setKey);
        System.out.println(value);
        System.out.println(setEntry);
    }

    /**
     * 遍历
     */
    @Test
    public void test4(){
        Map map = new HashMap();
        //put(obj,obj)
        map.put("name", "Tom");
        map.put("age", 12);
        map.put("age", 20);
        map.put("Person", new Person("Jerry", 20));
        map.put("Person1", new Person("Jerry", 20));
        map.put(new Person("Jerry", 20),"Person");
        System.out.println(map);

        Set keySet = map.keySet();
        for (Object obj : keySet){
            System.out.println(obj);
        }

        Collection values = map.values();
        for (Object obj : values){
            System.out.println(obj);

        }

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
