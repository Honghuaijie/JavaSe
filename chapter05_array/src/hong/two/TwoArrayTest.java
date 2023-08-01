package hong.two;

/**
 * ClassName: TwoArrayTest
 * Package: hong.two
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/25 9:46
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TwoArrayTest {
    public static void main(String[] args) {
//                数组的声明和初始化
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //动态初始化
        String[][] arr2 = new String[3][3];
        double[][] arr3 = new double[3][];


//      调用数组的指定元素
//      调用数组的指定元素
        System.out.println(arr1[0][0]);
        System.out.println(arr1[0]);

        arr2[0][0] = "Tom";
        System.out.println(arr2[0]);

        arr3[0] = new double[4];
        arr3[0][1]=12.3;
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0]);

//      数组的长度：length
        System.out.println(arr1.length);
//      数组的遍历


    }
}
