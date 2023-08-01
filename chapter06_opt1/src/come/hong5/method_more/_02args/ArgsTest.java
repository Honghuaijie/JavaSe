package come.hong5.method_more._02args;

/**
 * ClassName: ArgsTest
 * Package: come.hong5.method_more._02args
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/31 14:55
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ArgsTest {

    public static void main(String[] args) {
        ArgsTest a1 = new ArgsTest();
        a1.print();
        a1.print(1);
        a1.print(1,2);
//        a1.print(1,2,3);

    }

    public void print(int i,int ...nums){
        System.out.println("5555");
    }

    //编译不通过
//    public void print(int ...nums,int i){
//
//    }

    // int ... nums === int[] nums
    public void print(int ... nums){
        System.out.println("111");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public void print(int x){
        System.out.println("222");
    }
    public void print(int x,int y){
        System.out.println("222");
    }
}
