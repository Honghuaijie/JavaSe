 /*
 �����������ʹ��5��λ�����
 
 1. << >> >>> & | ^ ~

 2.˵����
��<< >> >>> & | ^ ~ �� ��ԵĶ�����ֵ���͵ı������߳���������Ľ��Ҳ����ֵ
�� <<: ��һ����Χ�ڣ�ÿ�����ƶ�һλ���������ԭ�еĻ����� * 2��(��������������������)
�� <<: ��һ����Χ�ڣ�ÿ�����ƶ�һλ���������ԭ�еĻ����� / 2��
3.�����⣺��Ч�ķ�ʽ���� 2*8��
2 << 3  ���� 8 << 1
 
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
		//����2����ν�������int���ͱ�����ֵ�� String�أ�

		int m= 10;
		int n = 20;

		//��������������ֵ
		m = m ^ n;
		n = m ^ n;
		m = m ^ n;
		System.out.println("m= " + m +  " n= " + n);

	}
}
