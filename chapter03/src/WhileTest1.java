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
			System.out.print("请输入数字");
			m = sc.nextInt();

			if(num == m) {
				System.out.print("猜对了");
				flag = false;
			}else if (num > m)
			{
				System.out.println("猜小了");
			}else {
				System.out.println("猜大了");
			}
			k++;
		}

		System.out.println("一共猜了 " + k + "次");

		sc.close();
	}
}
