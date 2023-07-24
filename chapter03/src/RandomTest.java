/*
如何获取一个随机数
1.可以使用java提供的API：MATH类的random()
2.random()调用以后，会返回一个[0.0,1.0)范围的double性随机数
3.需求1：获取一个[0,100]之间的随机整数？  random()*(100-0+1) + 0
4.如何获取一个[a,b]范围的随机整数
(int)(Math.random() * (b-a+1)) + a
*/

class  RandomTest
{
	public static void main(String[] args) 
	{
		double d1 = Math.random()*101;
		System.out.println("d1 = " + d1);
	}
}
