package com.atguigu04.compare.comparator;

import com.atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Package: com.atguigu04.compare.comparator
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/26 9:36
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ComparatorTest {
    @Test
    public void test1(){
        Product[] products = new Product[5];
        products[0] = new Product("Huawei",6299);
        products[1] = new Product("Xiaomi",4999);
        products[2] = new Product("VivoX90pro",5999);
        products[3] = new Product("iphone14proMax",9999);
        products[4] = new Product("Aonor",6299);

        //按照价格降序
        Comparator comparator = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return -Double.compare(p1.getPrice(), p2.getPrice());
                }

                throw new RuntimeException("类型不匹配");
            }
        };

        //按照名字升序
        Comparator comparator1 = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return p1.getName().compareTo(p2.getName());
                }

                throw new RuntimeException("类型不匹配");
            }
        };

        Arrays.sort(products,comparator1);

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    @Test
    public void test2(){
        String[] strings = new String[]{"Tom","Jerry","LIli","Tony","Lucy"};
        //按照字符串降序
        Arrays.sort(strings,new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof  String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;

                    return -s1.compareTo(s2);

                }

                throw new RuntimeException("类型不匹配");
            }
        });

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
