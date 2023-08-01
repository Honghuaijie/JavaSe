package come.hong5.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: come.hong5.method_more._03valuetransfer.exer1
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/31 16:33
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject p1 = new PassObject();
        p1.printAreas(new Circle(), 5);
    }

    public void printAreas(Circle c, int time){
        for (int i = 1; i <= time; i++) {
            c.reduis = i;
            System.out.println("reduis:" + c.reduis + "findArea: " + c.findArea());
        }
    }
}
