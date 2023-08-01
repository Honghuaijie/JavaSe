package come.hong5.method_more._01overload;

/**
 * ClassName: OverloadTest
 * Package: come.hong5.method_more._01overload.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/31 11:59
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest o1 = new OverloadTest();
        o1.add(10,20);
    }

//    public void add(int i ,int j){
//        System.out.println("444");
//    }


    public void add(double i , double j){
        System.out.println("111");
    }

    //o1.add(10,20); 以下两个方法分开使用可以，但是和在一起就不行了
//    public void add(int i , double j){
//        System.out.println("222");
//    }

    public void add(double i , int j){
        System.out.println("333");
    }


//    public void add(int i , int j){
//        System.out.println("222");
//    }
}
