/*
�������ͺ͸����ͱ�����ʹ��
*/


class VariableTest1{
	public static void main(String[] ages){
		//1.�������ͱ�����ʹ��
		// byte \ short \int \long 

	byte b1 =12;
	byte b2 = 127;
	//byte b3 = 128;

	short s1 = 1234;

	int i1 = 12345;
	// ����long���ͱ���ʱ����Ҫ�ṩ��׺����׺Ϊ��l'���ߡ�L��
	long l1 = 12353135135L;

	
	// 2. ���Ը������ͱ�����ʹ��
	// float \ double 

	double d1 = 12.3;
	// ����float���ͱ���ʱ����Ҫ�ṩ��׺����׺Ϊ��f'���ߡ�F��
	float f1 = 12.3f;
	System.out.println("f1 = " + f1);

	// float���ͱ�����ΧҪ����long���͵ı�����Χ�����Ǿ��Ȳ��ߡ�

	//���Ը����ͱ��� �ľ���
	// ���ۣ�ͨ�����Է��ָ����ͱ����ľ��Ȳ��ߣ��˹��ڿ����У���Ӵ���ߵľ��ȣ���Ҫʹ��BigDecimal���滻�����ͱ���
	// ����1
	System.out.println(0.1+0.2);
	
	// ����2
	float ff1 = 123123123f;
	float ff2 = ff1 + 1;
	System.out.println(ff1);
	System.out.println(ff2);
	System.out.println(ff1 == ff2);

	}

}