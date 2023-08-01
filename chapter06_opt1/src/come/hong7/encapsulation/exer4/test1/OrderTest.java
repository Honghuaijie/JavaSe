package come.hong7.encapsulation.exer4.test1;

/**
 * ClassName: OrderTest
 * Package: come.hong7.encapsulation.exer4.test1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 16:07
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OrderTest {
    public static void main(String[] args) {
        //测试同包不同类
        Order o1 = new Order();

        //测试属性
        o1.orderPublic = 2;
        o1.orderDefault = 3;

        //测试方法
        o1.methodPublic();
        o1.methodDefault();

        //不能调用
        //o1.orderPrivate=4;
        //o1.methodPrivate();
    }
}
