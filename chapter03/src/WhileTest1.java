import java.util.Scanner;

class WhileTest1{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*101);
		int m,k;
		Boolean flag = true;
		k = 0;
		while(flag){
			System.out.print("����������");
			m = sc.nextInt();

			if(num == m) {
				System.out.print("�¶���");
				flag = false;
			}else if (num > m)
			{
				System.out.println("��С��");
			}else {
				System.out.println("�´���");
			}
			k++;
		}

		System.out.println("һ������ " + k + "��");

		sc.close();
	}
}
