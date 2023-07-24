/*
求最大公约数和最小公倍数
*/

class ForTest2{
	public static void main(String[] args) 
	{
		int n = 12;
		int m = 24;
		int min = m > n ? n : m;
		//求最大公约数
		for(int i = min ; i>0; i--){
			if (n % i == 0 && m % i == 0)
			{
				System.out.println("最大公约数：" + i);
				break;
			}
		}

		//最大公倍数

		int max = m > n ? m : n;
		for (int j = max; j <= n * m ; j ++ )
		{ 
			if (j % n == 0 && j % m == 0)
			{
				System.out.println("最大公倍数：" + j);
				break;
			}
		}

	}
}
