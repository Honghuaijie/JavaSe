package hong.search_sort.exer3;

import java.util.Arrays;

/**
 * ClassName: ArrDemo
 * Package: hong.search_sort.exer3
 * Description:求数组的最大子序列和
 *
 * @Author honghuaijie
 * @Create 2023/7/28 17:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
//    求数组的最大子序列和

public class ArrDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,-2,3,10,-4,7,2,-5};
        int[] arr2 = new int[arr.length]; //存放子数组
        int maxSum=0; //记录最大子序列的和
        int n; //控制子数组的索引
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum +=arr[j];
                if(sum > maxSum){
                    maxSum=sum;
                    n = 0;
                    arr2 = new int [j-i+1];
                    for (int k = i; k <=j; k++) {
                        arr2[n++] = arr[k];
                    }
                }
            }
        }

        System.out.println(maxSum);

        System.out.println(Arrays.toString(arr2));
    }
}
