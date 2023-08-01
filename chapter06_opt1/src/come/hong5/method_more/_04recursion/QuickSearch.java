package come.hong5.method_more._04recursion;

import java.util.Arrays;

/**
 * ClassName: QuickSearch
 * Package: come.hong5.method_more._04recursion
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 10:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class QuickSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        System.out.println(Arrays.toString(arr));
        search(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void search(int[] arr ,int start, int end){
        if(start < end) {
            int low; //控制数组的前半部分
            int high; //控制数组的后半部分
            int base = arr[start];//中间量
            low = start;
            high = end+1;
            //核心思想就是 arr[low]<arr[base]<arr[high]
            while(true){

                while(low < end && arr[++low] < base);

                while(high > start && arr[--high] >base);

                if(low < high){
                    swap(arr,low,high);
                }else{
                    break;
                }

            }

            swap(arr,start,high);
            search(arr,start,high-1);
            search(arr,high+1,end);
        }




    }

    public  static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
}
