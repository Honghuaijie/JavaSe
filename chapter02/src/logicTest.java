/*
�����������ʹ��4���߼������

1. & && | || ! ^
2.˵����
�١��߼��������ԵĶ���boolean���͵ı���
�ڡ��߼����������Ľ��Ҳ��boolean����
�ۡ��߼��������ʹ�������жϽṹ��ѭ���ṹ��

*/


class logicTest{
	public static void main(String[] args) 
	{
		/*
		���� & &&
		��ͬ�㣺�������ű��Ķ��ǡ��ҡ��Ĺ�ϵ��ֻ�е��������ߵ�����ֵ����trueʱ�������Ϊtrue
		
		ִ�й��̣�
			1��������������true����&��&& ����ִ�з����ұߵĲ���
			2��������������false����&��ִ�з����ұߵı��ʽ
									&& ����ִ�з����ұߵı��ʽ
		��ͬ�㣺& ���߱��ʽ��Ҫִ��
				&& ������falseʱ����ı��ʽ��ִ��
		3�������У������Ƽ�ʹ��&&
		*/

		boolean b1 = true;
		b1 = false;
		int num1 = 10;

		if (b1 & (num1++ > 0))
		{
			System.out.println("��ǰ���¹�");
		}else{
			System.out.println("�ҽй��¸�");
		}

		System.out.println("num1= " + num1);

		boolean b2 = true;
		b2 = false;

		int num2 = 10;

		if (b2 && (num2++ > 0))
		{
			System.out.println("��ǰ���¹�");
		}else{
			System.out.println("�ҽй��¸�");
		}

		System.out.println("num2= " + num2);

		int a,b;
		a = b = 20;
		boolean bo1;
		bo1 = (++a % 3 == 0) && (a++ % 7 == 0);
		System.out.println("a= " + a + "bo1= " + bo1);
		boolean bo2;
		bo2 = (b++ % 3 ==0) && (++b % 7 == 0);
		System.out.println("b= " + b + "bo2= " + bo2);

	}

}
