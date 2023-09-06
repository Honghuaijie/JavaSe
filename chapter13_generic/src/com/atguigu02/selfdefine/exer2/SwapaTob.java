package com.atguigu02.selfdefine.exer2;

/**
 * ClassName: SwapaTob
 * Package: com.atguigu02.selfdefine.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/28 13:02
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class SwapaTob {
    public static void main(String[] args) {

        Integer[] integers = new Integer[]{1,2,3,4,5,6,7};
        method1(integers,1,6);

        for (Integer i : integers){
            System.out.print(i + "\t");
        }


//        method2(integers);
//        for (Integer i : integers){
//            System.out.print(i + "\t");
//        }

        method1(integers,1,3);
        System.out.println();
        for (Integer i : integers){
            System.out.print(i + "\t");
        }

        method2(integers);
        System.out.println();
        for (Integer i : integers){
            System.out.print(i + "\t");
        }

    }

    public static <E> void method1(E[] e, E a, E b){
        //不能使用二分查找，因为数组是无序的
        //int aindex = Arrays.binarySearch(e,a);
        int aindex,bindex;
        aindex = -1;
        bindex = -1;
        for (int i = 0; i < e.length; i++) {
            if(e[i] == a && aindex == -1){
                aindex = i;
            }
            if(e[i] == b  && bindex == -1){
                bindex = i;
            }
        }
        if(aindex !=-1 && bindex != -1){
            E temp = e[aindex];
            e[aindex] = e[bindex];
            e[bindex] = temp;
        }



    }

    public static <E> void method2( E[] e){

        for (int i = 0,j=e.length-1; i < j; i++,j--) {
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;

        }
    }
}
