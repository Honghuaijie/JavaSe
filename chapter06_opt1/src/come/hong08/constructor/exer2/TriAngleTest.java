package come.hong08.constructor.exer2;

/**
 * ClassName: TriAngleTest
 * Package: come.hong08.constructor.exer2
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/1 16:58
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle(10,20);
        double area= t1.getBase() * t1.getHeight() / 2;
        System.out.println(area);
    }
}
