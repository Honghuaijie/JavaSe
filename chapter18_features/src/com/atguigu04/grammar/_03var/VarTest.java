package com.atguigu04.grammar._03var;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * ClassName: VarTest
 * Package: com.atguigu04.grammer._03var
 * Description:
 * 局部变量的类型推断
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 21:24
 * @Version: v1.0
 */
public class VarTest {

    @Test
    public void test1() {
        //1.局部变量的实例化
        var list = new ArrayList<String>();

        var set = new LinkedHashSet<Integer>();

        //2.增强for循环中的索引
        for (var v : list) {
            System.out.println(v);
        }

        //3.传统for循环中
        for (var i = 0; i < 100; i++) {
            System.out.println(i);
        }

        //4. 返回值类型含复杂泛型结构
        var iterator = set.iterator();
        //Iterator<Map.Entry<Integer, Student>> iterator = set.iterator();
    }


}

