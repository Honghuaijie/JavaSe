import java.util.Scanner;
class Exercise {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = (int)(Math.random()*6) + 1;
		int num2 = (int)(Math.random()*6) + 1;
		int num3 = (int)(Math.random()*6) + 1;
		

		System.out.print("��Ѻ�������ӡ���С����");
		String userResult = sc.next();


		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		String result;

		if(num1 == num2 && num2 == num3){
			result = "����";
		}else if( (num1 + num2 + num3) > 9 ) {
			result = "��";
		}else {
			result = "С";
		}

		System.out.println("user: " + userResult + " result: " + result);
		if (result.equals(userResult)){
			System.out.print("�¶��ˣ������:" + result);
		}else {
			System.out.print("�´��ˣ������:" + result);
		}
	}
}
