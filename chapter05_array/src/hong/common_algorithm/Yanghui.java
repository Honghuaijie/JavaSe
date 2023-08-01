package hong.common_algorithm;

/**
 * ClassName: Yanghui
 * Package: hong.common_algorithm
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/25 12:00
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Yanghui {
    public static void main(String[] args) {
        int[][] yang = new int[10][];

        for (int i = 0; i < yang.length; i++) {
            yang[i] = new int[i+1];
            yang[i][0] = 1;
            yang[i][i] = 1;
            for (int j = 1; j < i; j++) {
                yang[i][j] = yang[i-1][j-1] + yang[i-1][j];
            }

            for (int j = 0; j < yang[i].length; j++) {
                System.out.print(yang[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
