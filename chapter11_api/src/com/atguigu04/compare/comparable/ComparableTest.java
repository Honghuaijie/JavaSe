package com.atguigu04.compare.comparable;

import com.atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: ComparableTest
 * Package: com.atguigu04.compare.comparable
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/25 22:23
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ComparableTest {
    @Test
    public void test(){
        String[] strings = new String[]{"Tom","Jerry","LIli","Tony","Lucy"};
        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    @Test
    public void test2(){
        Product[] products = new Product[5];
        products[0] = new Product("Huawei",6299);
        products[1] = new Product("Xiaomi",4999);
        products[2] = new Product("VivoX90pro",5999);
        products[3] = new Product("Iphone14proMax",9999);
        products[4] = new Product("Aonor",6299);

        Arrays.sort(products); //升序

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

    }
}

