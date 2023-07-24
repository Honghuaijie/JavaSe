package hong.one;

/**
 * ClassName: OneArrayTest
 * Package: hong.one
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/24 16:01
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OneArrayTest {
    public static void main(String[] args) {

        //1.数组的声明与初始化
        //复习：变量的定义格式：数据类型 变量名 = 变量值
        int num1 = 10;
        int num2; // 声明
        num2 = 20; //初始化


        // 1.1声明数组
        double[] prices;

        //数组属于引用类型，引用类型一般都要new创建
        // 1.2初始化
        //静态初始化：数组变量的赋值与数组元素的赋值操作同时进行
        prices = new double[]{20.32,43.21,43.22};

//        String[] foods;
//        foods = new String[]{"白海西","张三","李四"};

        //声明和初始化
        //动态初始化：数组变量的赋值与数组元素的赋值操作分开进行
        //数组一旦初始化完成，其长度就确定了，并且长度不可更改
        String[] foods = new String[4] ;

        //其他正确的方式
        int arr1[] = {1,2,3,4};

        // 2.数组元素的调用
        // 通过角标的方式，获取数组的元素
        System.out.println(prices[2]);

        foods[0]="张三";
        foods[1]="李四";
        foods[2]="王五";

    }
}
