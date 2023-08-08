package com.hong4.override;

/**
 * ClassName: Person
 * Package: com.hong4.override
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 19:28
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Person {

    //子类如果想要重写info的方法，那么子类重写方法的返回值必须是Person，或者是Person的子类
    public Person info(){
        return null;
    }
}
