package com.atguigu02.selfdefine;

/**
 * ClassName: SubOrder5
 * Package: com.atguigu02.selfdefine
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 11:56
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SubOrder5<E> extends Order<String>{
    E e;

    public SubOrder5(String s, String name, E e) {
        super(s, name);
        this.e = e;
    }

    public SubOrder5(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    //不可以在静态方法中使用类的泛型
    public static void method(){
//        System.out.println(e);
    }

    public void setE(E e) {
        this.e = e;
    }
}
