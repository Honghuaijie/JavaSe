package hong.search_sort.exer2;

/**
 * ClassName: BinarySearchTest
 * Package: hong.search_sort.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/26 9:58
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        int start,end,mid,num;
        num = 100;
        start=0;
        end = arr2.length-1;
        mid = (start + end) / 2;

        while(start <= end){
            mid = (start + end) / 2;
            if(num > arr2[mid]){
                start = mid+1;

            }else if(num < arr2[mid]){
                end = mid-1;

            }else{
                System.out.println("找到了，该数坐标为：" + mid);
                break;
            }
        }
        if(start >end){
            System.out.println("没找到");
        }

    }
}
