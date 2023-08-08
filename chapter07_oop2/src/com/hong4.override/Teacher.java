package com.hong4.override;

/**
 * ClassName: Teacher
 * Package: com.hong4.override
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 19:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Teacher extends Person{
    //因为Student是Person的子类，所以可以重写
    public Student info(){
        return null;
    }
}
