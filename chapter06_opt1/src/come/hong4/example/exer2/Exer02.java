package come.hong4.example.exer2;

/**
 * ClassName: Exer02
 * Package: come.hong4.example.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/30 16:40
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer02 {
    public static void main(String[] args) {
        Exer02 e2 = new Exer02();
        e2.method1();
        System.out.println(e2.method2());
        System.out.println(e2.method3(5, 4));
    }

    public void method1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }

    public int method3(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m*n;
    }
}
