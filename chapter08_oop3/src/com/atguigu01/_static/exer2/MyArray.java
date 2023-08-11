package com.atguigu01._static.exer2;

/**
 * ClassName: MyArray
 * Package: com.atguigu01._static.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/9 11:00
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class MyArray {


    public static int max(int[] arr){
        int max,maxi;
        max = arr[0];
        maxi= 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max =arr[i];
                maxi = i;
            }
        }

        return maxi;
    }

    public static int min(int[] arr){
        int min,mini;
        min = arr[0];
        mini= 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min =arr[i];
                mini = i;
            }
        }

        return mini;
    }

    public static int sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static double avg(int[] arr){
        return sum(arr) / (double)arr.length;
    }

    //数组的遍历
    public static void show(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i !=arr.length-1){
                System.out.print(arr[i] + ",");
            }else{
                System.out.print(arr[i] );
            }
        }
        System.out.print("]");
        System.out.println();
    }

    //数组复制
    public static int[] copyArr(int[] arr){
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //数组反转
    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }
    }

    //快速数组排序
    public static void sort(int[] arr,int start,int end){
        if(start < end){
            int left,right;
            left = start;
            right = end+1 ;
            int num = arr[start];
            while (true){
                //先筛选左边的
                while(left < end && arr[++left] < num) ;

                while(right > start && arr[--right] > num) ;

                if(left < right){
                    swap(arr,left,right);
                }else{
                    break;
                }

            }
            swap(arr,start,right);
            sort(arr,start,right-1);
            sort(arr,right+1,end);
        }

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //查找
    public static int find(int[] arr, int num){
        sort(arr,0,arr.length-1);

        int start,end,mid;
        start = 0;
        end = arr.length-1;
        while (start < end){
            mid = (start + end) /2;
            if(num > arr[mid]){
                start = mid +1;
            }else if ( num < arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }

        return -1;
    }






}
