/*
��������������String������

һ������String�����
1.String�࣬���������������͡��׳��ַ�����
2.String���͵ı���������ʹ��һ�ԡ����ķ�ʽ���и�ֵ��  
3.shring�������ַ����ڲ������԰���0����1�����߶��

����String������������ͱ����������
1����Ļ����������Ͱ���Boolean���ڵ�8�֣�
2��String������������ͱ�����ֻ�����������㣬ʹ��"+"��ʾ
											��"+"�����ֺ��壺
												1.��ʾ������һ��ʡ�ԡ�
												2.��ʾ�ӷ�
												3.��ʾ���ӣ�
3������Ľ��ֻ����String����


*/

class  StringTest{
	public static void main(String[] args) 
	{
		String str1 = "Hello World!";
		System.out.println("str1");
		System.out.println(str1);
	
		
		String str2 = "";
		String str3 = "a"; //char c1 = 'a';
	
		//������������
		int num1 = 10;
		boolean b1 = true;
		String str4 = "hello";
		System.out.println(b1 + str4 );

		String str5 = str4 + b1;
		String str6 = str4 + b1 + num1;
		System.out.println(str6 ); //hellotrue10

		//˼�������µ�����������ͨ����
		//String str7 = b1 + num1 + str4; //����

		//��ν�string���͵ı���ת��Ϊ�����������ͣ�
		int num2 = 10;
		String str9 = num2 + ""; // "10"
		//���벻ͨ��
		//int num3 = (int)str9;

		//ʹ��Integer 
		int num3 = Integer.parseInt(str9);
		System.out.println(num3);
	}
}
