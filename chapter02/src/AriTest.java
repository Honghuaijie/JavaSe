/*
�����������ʹ��1�������������ʹ��

1. +�����ţ� -�����ţ� + - * / % ++ -- +(����)

*/



class AriTest{
	public static void main(String[] args) 
	{
		// ������/
		int m1 = 12;
		int n1 = 5;
		int k1 = m1 / n1;   // 2
		System.out.println(k1);
		System.out.println(m1 / n1 * n1);  // 10
		
		//ȡģ��ȡ�ࣩ�� %
		int i1 = 12;
		int j1 = 5;
		System.out.println(i1 % j1);  //2

		//�����У����������ж�ĳ�����Ƿ���������һ���� num1%num2 == 0
		// ���磺�ж�num1�Ƿ���ż���� num1 % 2 == 0
		

		// ���ۣ�ȡģ�Ժ󣬽���뱻ģ���ķ�����ͬ
		int i2 = -12;
		int j2 = 5;
		System.out.println(i2 % j2);  //-2


		int i3 = 12;
		int j3 = -5;
		System.out.println(i3 % j3);  //2


		int i4 = -12;
		int j4 = -5;
		System.out.println(i4 % j4);  //-2
	
		
		// ++(������
		
		short s1 = 10;

		//��ʽ1��
		//s1 = (short)(s1 + 1);
		//System.out.println(s1);

		//��ʽ2
		s1++;
		System.out.println(s1);

		//+(�������㷨)��ֻ������String���������͵ı��������㣬������ΪString����
		
		
		//*************************
		//����1���������һ����������ӡ��ʾ���ĸ�λ����ʮλ������λ����ֵ
		
		int num = 187;
		int x = num % 10;
		int y = num /10 % 10;
		int z = num /100 % 10;
		System.out.println("��λ����" + x);
		System.out.println("ʮλ����" + y);
		System.out.println("��λ����" + z);


		//����2��Ϊ�Ό��ˮ��սʿ������ս89Сʱ����ɼ��㹲����������ٸ�Сʱ

		int num2 = 89;
		int day = num2 / 24;
		int hour = num2 % 24;
		System.out.println("����ս" + day + "����" + hour + "Сʱ");

		//��ϰ3:
		byte num3 = 127;
		num3++;
		System.out.println(num3); // -128

		//��ϰ4��
		int i = 1;
		int j = i++ + ++i * i++;
		System.out.println("j=" + j);

		//��ϰ5��
		//int i = 2;
		//int j = i++;
		//System.out.println(j);  //2

		int m = 2;
		m = m++;
		System.out.println(m);
	}
}
