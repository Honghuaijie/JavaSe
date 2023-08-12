package com.atguigu09.inner;

/**
 * ClassName: OuterClassTest1
 * Package: com.atguigu09.inner
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 20:51
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OuterClassTest1 {

    public Comparable getInstance(){
        //提供了实现了Comparable接口的类
        // 方式一：提供了接口的实现类的对象
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//
//        MyComparable my = new MyComparable();
//        return my;


        // 方式二：提供了接口的实现类的匿名对象
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

        // 方式三：提供了接口的匿名实现类的对象
//        Comparable c1 = new Comparable(){
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
//
//        return c1;

        // 方式四：提供了接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

    }

}
