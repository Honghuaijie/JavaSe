/*
��λ�ȡһ�������
1.����ʹ��java�ṩ��API��MATH���random()
2.random()�����Ժ󣬻᷵��һ��[0.0,1.0)��Χ��double�������
3.����1����ȡһ��[0,100]֮������������  random()*(100-0+1) + 0
4.��λ�ȡһ��[a,b]��Χ���������
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
