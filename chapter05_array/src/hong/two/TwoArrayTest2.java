package hong.two;

/**
 * ClassName: TwoArrayTest2
 * Package: hong.two
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/25 9:50
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TwoArrayTest2 {
    public static void main(String[] args) {
//          数组元素的默认初始化值
//        动态初始化方式1：String[][] arr2 = new String[3][3];
//        外层元素默认存储地址值，内层元素默认与一维数组元素的不同类型的默认值规定相同
        int[][] arr1 = new int[3][3];
        System.out.println(arr1[0]);
        System.out.println(arr1[0][0]);
        System.out.println("***************");
        //***********************
        //动态初始化2： String[][] arr2 = new String[3][];
        int[][] arr2 = new int[3][];
        System.out.println(arr2[0]);   //null  为什么是null，引用数据类型的默认值都是null
        //System.out.println(arr2[0][0]);  // 报错


//      二维数组的内存解析


    }
}
