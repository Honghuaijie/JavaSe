package com.atguigu02.selfdefine.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UserTest
 * Package: com.atguigu02.selfdefine.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 12:54
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class UserTest {
    @Test
    public void test1(){
        DAO<User> dao = new DAO<>();
        dao.save("1",new User(1,20,"Tom"));
        dao.save("2",new User(2,22,"Jerry"));

        System.out.println(dao.get("1"));

        dao.update("2",new User(3,24,"JJB"));
        System.out.println(dao.get("2"));

        List<User> list = new ArrayList<>();
        list = dao.list();
        System.out.println(list);

        dao.delete("2");
        list = dao.list();
        System.out.println(list);
    }
}
