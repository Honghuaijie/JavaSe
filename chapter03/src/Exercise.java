import java.util.Scanner;
class Exercise {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = (int)(Math.random()*6) + 1;
		int num2 = (int)(Math.random()*6) + 1;
		int num3 = (int)(Math.random()*6) + 1;
		

		System.out.print("请押宝（豹子、大、小）：");
		String userResult = sc.next();


		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		String result;

		if(num1 == num2 && num2 == num3){
			result = "豹子";
		}else if( (num1 + num2 + num3) > 9 ) {
			result = "大";
		}else {
			result = "小";
		}

		System.out.println("user: " + userResult + " result: " + result);
		if (result.equals(userResult)){
			System.out.print("猜对了，结果是:" + result);
		}else {
			System.out.print("猜错了，结果是:" + result);
		}
	}
}
