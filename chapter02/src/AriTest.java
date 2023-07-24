/*
测试运算符的使用1：算术运算符的使用

1. +（正号） -（负号） + - * / % ++ -- +(连接)

*/



class AriTest{
	public static void main(String[] args) 
	{
		// 除法：/
		int m1 = 12;
		int n1 = 5;
		int k1 = m1 / n1;   // 2
		System.out.println(k1);
		System.out.println(m1 / n1 * n1);  // 10
		
		//取模（取余）： %
		int i1 = 12;
		int j1 = 5;
		System.out.println(i1 % j1);  //2

		//开发中，经常用来判断某个数是否能整除另一个数 num1%num2 == 0
		// 比如：判断num1是否是偶数： num1 % 2 == 0
		

		// 结论：取模以后，结果与被模数的符号相同
		int i2 = -12;
		int j2 = 5;
		System.out.println(i2 % j2);  //-2


		int i3 = 12;
		int j3 = -5;
		System.out.println(i3 % j3);  //2


		int i4 = -12;
		int j4 = -5;
		System.out.println(i4 % j4);  //-2
	
		
		// ++(自增）
		
		short s1 = 10;

		//方式1：
		//s1 = (short)(s1 + 1);
		//System.out.println(s1);

		//方式2
		s1++;
		System.out.println(s1);

		//+(连接运算法)：只适用于String与其他类型的变量间运算，运算结果为String类型
		
		
		//*************************
		//案例1：随意给出一个整数，打印显示它的个位数、十位数、百位数的值
		
		int num = 187;
		int x = num % 10;
		int y = num /10 % 10;
		int z = num /100 % 10;
		System.out.println("个位数：" + x);
		System.out.println("十位数：" + y);
		System.out.println("百位数：" + z);


		//案例2：为提抗洪水、战士连续作战89小时，变成计算共多少天零多少个小时

		int num2 = 89;
		int day = num2 / 24;
		int hour = num2 % 24;
		System.out.println("共作战" + day + "天零" + hour + "小时");

		//练习3:
		byte num3 = 127;
		num3++;
		System.out.println(num3); // -128

		//练习4：
		int i = 1;
		int j = i++ + ++i * i++;
		System.out.println("j=" + j);

		//练习5：
		//int i = 2;
		//int j = i++;
		//System.out.println(j);  //2

		int m = 2;
		m = m++;
		System.out.println(m);
	}
}
