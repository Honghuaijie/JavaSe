package come.hong7.encapsulation.exer4.test1;

/**
 * ClassName: Order
 * Package: come.hong7.encapsulation.exer4.test1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 16:02
 * @Version 1.0
 * 不积跬步无以至千里
 */
class Order {
    //声明不同权限的属性
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    //声明不同权限的方法
    private void methodPrivate(){
    }
    void methodDefault(){
    }

    public void methodPublic() {
    }

    //测试同包同类中
    public void test(){
        //测试属性
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

        //测试方法
        methodPrivate();
        methodDefault();
        methodPublic();
    }

}
