package com.atguigu02.selfdefine.exer1;

import java.util.*;

/**
 * ClassName: DAO
 * Package: com.atguigu02.selfdefine.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 12:48
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class DAO<T> {
    Map<String,T> map = new HashMap<>();

    //： 保存 T 类型的对象到 Map 成员变量中
    public void save(String id,T entity){
        map.put(id,entity);
    }
    //：从 map 中获取 id 对应的对象
    public T get(String id){
        return map.get(id);

    }
    //：替换 map 中key为id的内容,改为 entity 对象
    public void update(String id,T entity){
        if(map.get(id) != null){
            map.put(id,entity);
        }
    }
    //：返回 map 中存放的所有 T 对象
    public List<T> list(){
        Collection<T> values = map.values();
        List<T> list = new ArrayList<>(values);

        return list;
    }
    //：删除指定 id 对象
    public void delete(String id){
        map.remove(id);
    }

}
