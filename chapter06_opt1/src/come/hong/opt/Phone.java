package come.hong.opt;

/**
 * ClassName: Phone
 * Package: come.hong.opt
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/29 14:38
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Phone {
    //属性
    String name;
    double price;

    //方法
    public void call(){
        System.out.println("手机能够拨打电话");
    }

    public void sendMessage(String message){
        System.out.println("发送信息:" + message);
    }

    public void playGame(){
        System.out.println("手机可以玩游戏");
    }
}
