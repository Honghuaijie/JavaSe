package com.atguigu05.field.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 16:03
 */
public class Test03 {
    public static void main(String[] args) {
        Sub s = new Sub();
    }
}
class Base{
    Base(){
        //此method前面省略了this，这个this就是当前对象就是sub对象
        method(100);
    }
    {
        System.out.println("base");
    }
    //当类全部加载完成以后，此方法已被子类重写
    public void method(int i){
        System.out.println("base : " + i);
    }
}
class Sub extends Base{
    Sub(){
        super();
        super.method(70);
    }
    {
        System.out.println("sub");
    }
    public void method(int j){
        System.out.println("sub : " + j);
    }
}
