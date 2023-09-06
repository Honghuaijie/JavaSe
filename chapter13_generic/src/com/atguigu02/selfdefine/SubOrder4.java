package com.atguigu02.selfdefine;

/**
 * ClassName: SubOrder4
 * Package: com.atguigu02.selfdefine.exer3
 * Description:
 *      SubOrder4是一个泛型类
 * @Author honghuaijie
 * @Create 2023/8/28 11:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SubOrder4<T,E> extends Order<T> {
    E e;

    public SubOrder4(T t, String name, E e) {
        super(t, name);
        this.e = e;
    }

    public SubOrder4(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
