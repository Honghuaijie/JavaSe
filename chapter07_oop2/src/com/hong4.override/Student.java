package com.hong4.override;

/**
 * ClassName: Student
 * Package: com.hong4.override
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/5 19:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Student extends  Person{

    //重写person里面的info，测试返回值类型
    //这里的引用数据类型的返回值，必须是父类info方法的返回值类型的子类
    @Override
    public Student info(){
        return null;
    }
}
