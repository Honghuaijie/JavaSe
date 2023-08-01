package come.hong5.method_more._03valuetransfer.interview;

/**
 * ClassName: Answer
 * Package: come.hong5.method_more._03valuetransfer.interview
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/31 16:55
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Answer {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void method(int a, int b){
        a = a *10;
        b = b *10;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }

    public static void method1(int a, int b){

    }
}
