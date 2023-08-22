package com.atguigu05.exer.exer4;

/**
 * ClassName: DivisionDemo
 * Package: com.atguigu05.exer.exer4
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/8/18 20:53
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            System.out.println(divide(i, j));

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (NumberFormatException e ){
            e.printStackTrace();
        }catch (BelowZeroException e){
            e.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally{
            System.out.println("程序运行结束");
        }

    }

    public static int divide(int i, int j) throws BelowZeroException{
        if(i >= 0 && j >= 0){
            return i / j;

        }else{
            throw new BelowZeroException("不能输入负数");
        }
    }
}
