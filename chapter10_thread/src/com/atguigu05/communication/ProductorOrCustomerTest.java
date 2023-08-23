package com.atguigu05.communication;

/**
 * ClassName: ProductorOrCustomerTest
 * Package: com.atguigu05.communication
 * Description:
 *  案例2：生产者&消费者
 *      生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
 *      固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
 *      了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
 *      取走产品。
 *
 *      知识点
 *      涉及到了多线程
 *      有共享数据
 *      是否有线程安全问题
 *      线程间的通信
 *
 * @Author honghuaijie
 * @Create 2023/8/23 15:31
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ProductorOrCustomerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor p1 = new Productor(clerk,"生产者");
        Productor p2 = new Productor(clerk,"生产者");
        Customer c1 = new Customer(clerk,"消费者1");
        Customer c2 = new Customer(clerk,"消费者2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}


//店员
class Clerk{

    private int proNumber ;

    //增加产品
    public synchronized void addProduct(){
        if(proNumber >=20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            proNumber++;
            System.out.println(Thread.currentThread().getName() + "生产了第：" + proNumber + " 个产品");

            notifyAll();
        }


    }

    //减少产品
    public synchronized void minusProduct(){
        if (proNumber <=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName() + "消费了第： " + proNumber + "个产品");
            proNumber--;
            notify();
        }



    }

}

//生产者
class Productor extends Thread{
    private Clerk clerk ;

    public Productor(Clerk clerk,String name){
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.addProduct();

        }
    }
}

//消费者
class Customer extends Thread{

    private Clerk clerk ;

    public Customer(Clerk clerk,String name){
        super(name);
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.minusProduct();
        }


    }
}
