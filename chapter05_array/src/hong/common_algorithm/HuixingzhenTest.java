package hong.common_algorithm;

import java.util.Scanner;

/**
 * ClassName: HuixingzhenTest
 * Package: hong.common_algorithm
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/25 12:11
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class HuixingzhenTest {
    public static void main(String[] args) {

        System.out.print("输入数字：");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        int n,m,k;
        k=1; // 1向右、2向下、3向左、4向上
        n=m=0; //n表示行，m表示列

        for (int s = 1; s <= num*num; s++) {
            if(k == 1){
                if(m < num && arr[n][m] == 0){
                    arr[n][m++] = s;
                }else {
                    k=2;
                    n++;
                    m--;
                    s--;
                }
            }else if(k == 2){
                if(n < num && arr[n][m] == 0){
                    arr[n++][m]=s;
                }else {
                    k=3;
                    n--;
                    m--;
                    s--;
                }
            }else if(k == 3){
                if(m >= 0 && arr[n][m] == 0){
                    arr[n][m--] = s;
                }else {
                    k=4;
                    m++;
                    n--;
                    s--;
                }
            }else {
                if(n >= 0 && arr[n][m] == 0){
                    arr[n--][m] = s;
                }else{
                    k=1;
                    n++;
                    m++;
                    s--;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
