/*
��δӼ����ϻ�ȡ��ͬ���ͣ������������͡�String���ͣ��ı�����ʹ��scanner��

1.ʹ��scanner��ȡ��ͬ�������ݵĲ���
����1������ import java.util.Scanner
����2���ṩ���򴴽���һ��Scanner���ʵ��
����3������Scanner���еķ�������ȡָ�����͵ı���
����4���ر���Դ������Scanner���close����

2.���������������������������䡢������ء����Ƿ�������Ա�������
*/
import java.util.Scanner;
class  ScannerTest{
	public static void main(String[] args) 
	{
		//����2���ṩ���򴴽���һ��Scanner���ʵ��
		Scanner scan = new Scanner(System.in);

		//����3������Scanner���еķ�������ȡָ�����͵ı���
		System.out.println("����������" );
		String name = scan.next();
		System.out.println("name = " + name);

		System.out.println("����������" );
		int age = scan.nextInt();
		System.out.println("age = " + age);

		System.out.println("����������" );
		double weight = scan.nextDouble();
		System.out.println("weight = " + weight);

		System.out.println("�Ƿ���������false��������true" );
		Boolean isSingle = scan.nextBoolean();
		System.out.println("isSingle = " + isSingle);


		System.out.println("����Ա�:(��\\Ů)" );
		char gender = scan.next().charAt(0);
		System.out.println("gender = " + gender);

		
		scan.close();

	}
}
