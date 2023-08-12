package com.atguigu08._interface.apply;

/**
 * ClassName: UsbTest
 * Package: com.atguigu08._interface.apply
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/12 11:29
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class UsbTest {
    public static void main(String[] args) {
        //1.创建接口实现类的对象
        Computer c1 = new Computer();
        printer p1 = new printer();
        c1.transferData(p1);

        //2.创建接口实现类的匿名对象
        c1.transferData(new printer());

        //3.创建接口匿名实现类的对象
        USB usb1 = new USB() {
            @Override
            public void start() {
                System.out.println("照相机正在工作");
            }

            @Override
            public void stop() {
                System.out.println("照相机结束工作");

            }
        };
        c1.transferData(usb1);

        //4.创建接口匿名实现类的匿名对象
        c1.transferData(new USB(){
            public void start(){
                System.out.println("USB开始工作");
            }
            public void stop(){
                System.out.println("USB结束工作");
            }
        });


    }
}

class Computer{

    public void transferData(USB usb){
        System.out.println("设备连接成功");
        usb.start();

        System.out.println("设备细节工作");

        usb.stop();
    }
}

class printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");

    }
}

interface  USB{
    //声明常量
    //usb的长、宽、高


    //方法
    void start();
    void stop();
}
