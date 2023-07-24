 /*
 测试运算符的使用5：位运算符
 
 1. << >> >>> & | ^ ~

 2.说明：
①<< >> >>> & | ^ ~ ： 针对的都是数值类型的变量或者常量，运算的结果也是数值
② <<: 在一定范围内，每向左移动一位，结果就在原有的基础上 * 2；(对于正数，负数都适用)
③ <<: 在一定范围内，每向右移动一位，结果就在原有的基础上 / 2；
3.面试题：高效的方式计算 2*8？
2 << 3  或者 8 << 1
 
 */



class BitTest{
	public static void main(String[] args) 
	{
		int num1 = 7;
		System.out.println("num1 << 1 : " + (num1 << 1));
		System.out.println("num1 << 2 : " + (num1 << 2));
		System.out.println("num1 << 3 : " + (num1 << 15));

		int num2 = -7;
		System.out.println("num1 << 1 : " + (num2 << 1));
		System.out.println("num1 << 2 : " + (num2 << 2));
		System.out.println("num1 << 3 : " + (num2 << 15));
		System.out.println("***************************" );
		//案例2：如何交换两个int类型变量的值？ String呢？

		int m= 10;
		int n = 20;

		//交换两个变量的值
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		System.out.println("m= " + m +  " n= " + n);

	}
}
