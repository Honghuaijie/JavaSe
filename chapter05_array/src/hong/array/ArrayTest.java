package hong.array;

import java.util.Arrays;

/**
 * ClassName: ArrayTest
 * Package: hong.array
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/26 14:58
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ArrayTest {
    public static void main(String[] args) {
        //1.比较两个数组的元素是否依次相等
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};

        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2.输出数组元素的信息
        System.out.println(Arrays.toString(arr1));

        //3.将指定数填写到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        //4.使用快速算法实现的排序  从小到大
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5.二分查找（前提是有序的）
        System.out.println(Arrays.binarySearch(arr2,22));
    }
}
