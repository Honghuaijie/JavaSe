package com.atguigu01._static.exer2;

/**
 * ClassName: MyArrayTest
 * Package: com.atguigu01._static.exer2
 * Description: 测试MyArray工具类
 *
 * @Author honghuaijie
 * @Create 2023/8/9 12:22
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class MyArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{23,56,1,78,34,90,12,45,67,89};

        System.out.println(arr[MyArray.max(arr)]);
        System.out.println(arr[MyArray.min(arr)]);
        System.out.println(MyArray.sum(arr));
        System.out.println(MyArray.avg(arr));
        MyArray.show(arr);
        int[] newArr = MyArray.copyArr(arr);
        MyArray.show(newArr);
        MyArray.reverse(newArr);
        MyArray.show(newArr);
        MyArray.sort(arr,0,arr.length-1);
        MyArray.show(arr);
        System.out.println(MyArray.find(newArr, 78));

    }
}
