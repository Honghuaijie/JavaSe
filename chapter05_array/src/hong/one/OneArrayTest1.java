package hong.one;

/**
 * ClassName: OneArrayTest1
 * Package: hong.one
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/24 16:49
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OneArrayTest1 {
    public static void main(String[] args) {
        // 5.数组元素的默认初始化值
        //整型：0
        int[]  arr1 = new int[3];
        System.out.println(arr1[0]);

        //浮点型:0.0
        double[]  arr2 = new double[3];
        System.out.println(arr2[0]);
        //字符型：0  （或者 '\u0000')
        char[]  arr3 = new char[3];
        System.out.println(arr3[0]+1);  // 0+1=1
        //boolean型:false
        boolean[]  arr4 = new boolean[3];
        System.out.println(arr4[0]);
        //引用数据类型:null
        String[]  arr5 = new String[3];
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        //6.数组的内存解析
    }
}
