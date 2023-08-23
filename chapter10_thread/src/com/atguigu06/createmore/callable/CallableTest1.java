package com.atguigu06.createmore.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: CallableTest1
 * Package: com.atguigu06.createmore.callable
 * Description:输出偶数，并且返回一个偶数的和
 *
 * @Author honghuaijie
 * @Create 2023/8/23 16:40
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class CallableTest1 {
    public static void main(String[] args) {
        //2.创建callable实现类的对象
        NumThread1 m1 = new NumThread1();

        //3.将此实现类的对象作为FutureTask的构造器的参数
        FutureTask futureTask = new FutureTask(m1);

        //4 将futureTask作为参数传入thread构造器。
        Thread t1 = new Thread(futureTask,"分线程");

        t1.start();

        System.out.println("main");

        try {
            System.out.println("sum:" + futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}

class NumThread1 implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 == 0 ){
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sum+=i;
            }
            Thread.sleep(100);
        }

        return sum;
    }
}
