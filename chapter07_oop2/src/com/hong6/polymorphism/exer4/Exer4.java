package com.hong6.polymorphism.exer4;

/**
 * ClassName: Exer4
 * Package: com.hong6.polymorphism.exer4
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/8 11:39
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class Exer4 {
    public static void main(String[] args) {
        Man m1 = new Man();
        Man m2 = new Man();
        Man m3 = new Man();

        Woamn w1 = new Woamn();
        Woamn w2 = new Woamn();
        Woamn w3 = new Woamn();

        meeting(m1,w1,m2,w2,m3,w3);
    }

    public  static void meeting(Person ...ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man){
                ((Man) ps[i]).smoke();
            }
            if(ps[i] instanceof Woamn){
                ((Woamn)ps[i]).makeup();
            }
            System.out.println("-------");
        }
    }
}
