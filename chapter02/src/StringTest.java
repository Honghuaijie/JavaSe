/*
基本数据类型与String的运算

一、关于String的理解
1.String类，属于引用数据类型。俗称字符串。
2.String类型的变量，可以使用一对“”的方式进行赋值。  
3.shring声明的字符串内部，可以包含0个、1个或者多个

二、String与基本数据类型变量间的运算
1、这的基本数据类型包括Boolean在内的8种；
2、String与基本数据类型变量间只能做连接运算，使用"+"表示
											（"+"有三种含义：
												1.表示整数，一般省略。
												2.表示加法
												3.表示连接）
3、运算的结果只能是String类型


*/

class  StringTest{
	public static void main(String[] args) 
	{
		String str1 = "Hello World!";
		System.out.println("str1");
		System.out.println(str1);
	
		
		String str2 = "";
		String str3 = "a"; //char c1 = 'a';
	
		//测试连接运算
		int num1 = 10;
		boolean b1 = true;
		String str4 = "hello";
		System.out.println(b1 + str4 );

		String str5 = str4 + b1;
		String str6 = str4 + b1 + num1;
		System.out.println(str6 ); //hellotrue10

		//思考：如下的声明编译能通过嘛
		//String str7 = b1 + num1 + str4; //不能

		//如何将string类型的变量转换为基本数据类型？
		int num2 = 10;
		String str9 = num2 + ""; // "10"
		//编译不通过
		//int num3 = (int)str9;

		//使用Integer 
		int num3 = Integer.parseInt(str9);
		System.out.println(num3);
	}
}
