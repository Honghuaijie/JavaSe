
/*
	整数默认都是int，浮点数默认都是double

	自动类型提升：当容量小于容量大的变量做运算时，结果自动转换成容量大的数据类型
	byte、short、char --->  int ----> long ---->  float ----> double


*/
class VariableTest3{
	public static void main(String[] ages){

		short s1 = 12;
		byte b1 = 12;
		// (short + byte / short + short / byte + byte) == int
		//short s2 = s1 + b1;  //编译不通过
		int i3 = s1 +b1;

		char c1 = 'a';
		//char c2 = c1 + 1; //编译不通过
		int i2 = c1 + 1;


		// *****************************************
		//练习1：
		long l2 = 123L;
		long l3 = 123;   //理解为：自动类型提升（123本来是int类型，但是用long类型来接收了）

		//编译不通过
		//long l4 = 123123123123123;   //123123123123123理解为int类型，因为超出了int范围，所以报错
		long l5 = 123123123123l;  //此时的123123123123就是使用8个字节存储的long类型的值
		
		//练习2：
		float f2 = 12.3f;
		//编译不通过
		//float f3 = 12.3;  //12.3此时是double类型，不能大的向小的转。不满足自动类型提升
		
		//练习3:
		// 规定1： 整型常量，规定为是int类型
		byte b5 = 10;
		//byte b6 = b5 + 1;

		int i11 = b5 + 1;
		// 规定2：浮点型常量，规定是double类型
		double dd1 = b5 + 12.3;

		//练习4：说明为什么不允许变量名是数字开头，为了“自洽”

		/*
		int 123L = 12;
		long l6 = 123L;
		*/
	}
}


