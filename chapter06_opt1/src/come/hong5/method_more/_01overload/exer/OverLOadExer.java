package come.hong5.method_more._01overload.exer;

/**
 * ClassName: OverLOadExer
 * Package: come.hong5.method_more._01overload.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/31 12:32
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OverLOadExer {

    public static void main(String[] args) {
        OverLOadExer o2 = new OverLOadExer();
        o2.mol(2);
        o2.mol(2,3);
        o2.mol("你好");

        System.out.println(o2.max(1,2));
        System.out.println(o2.max(2.0,3.0));
        System.out.println(o2.max(3.0,1.0,5.0));
    }

    public void mol(int x){
        System.out.println(x*x);
    }

    public void mol(int x, int y){
        System.out.println(x*y);
    }
    public void mol(String s) {
        System.out.println(s);
    }

    public int max(int x, int y){
        return Math.max(x, y);
    }
    public double max(double x, double y){
        return Math.max(x, y);
    }

    public double max(double x, double y, double z){
        return x>y?x>z? x:z : y>z?y:z;
    }

}
