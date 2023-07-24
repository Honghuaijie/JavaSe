/*
测试运算符的使用2：赋值运算符

1. =、+=、-=、/=、*=

2.说明：
①当"="两侧数据类型不一致时，可以使用自动类型转换或者强制类型转换原值来处理

② 支持连续赋值
③ +=、-=、/=、*= 这些操作不会改变变量本身的数据类型

*/

class SetValueTest{
	public static void main(String[] args) 
	{
		int i = 5;

		long l = 10; // 自动类型提升

		byte b = (byte)i; //强制类型转换

		//连续赋值
		//操作方式1：
		int a1 = 10;
		int b1 = 10;

		// 操作方式2：连续赋值
		int a2,b2;
		a2 = b2 = 10;

		System.out.println(a2 + "," + b2);
		// 操作方式3
		int a3 = 20, b3 = a3;
		System.out.println(a3 + "," + b3);
		
		// **********************
		// +=的使用
		byte by1 = 10;
		by1 +=5; // by1 = (byte)(by1 + 5)

		System.out.println(by1);
	
	
	}
}
