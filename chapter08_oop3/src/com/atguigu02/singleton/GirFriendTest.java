package com.atguigu02.singleton;

/**
 * ClassName: GirFriendTest
 * Package: com.atguigu02.singleton
 * Description:懒汉式
 *
 * @Author honghuaijie
 * @Create 2023/8/9 13:34
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class GirFriendTest {
}

class GirFriend{

    //1.将构造器私有化
    private GirFriend(){

    }

    //2.声明当前类的实例
    //4.此属性必须声明为static
    private static GirFriend girFriend;

    //3.通过get方法获取当前类的实例，如果未创建对象，则在方法内创建
    public static GirFriend getGirFriend(){
        if(girFriend == null){
            girFriend = new GirFriend();
        }

        return girFriend;
    }

}
