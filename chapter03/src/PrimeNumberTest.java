/*
找出100以内的素数
*/
class PrimeNumberTest 
{
	public static void main(String[] args) 
	{

		int count,i,j;
		Boolean falg;
		count = 0;
		long start = System.currentTimeMillis();
		for (i = 2;  i <= 100000 ; i++ )
		{
			falg = true;
			for ( j = 2; j <= Math.sqrt(i) ; j++ )
			{
				if (i % j == 0)
				{
					falg = false;
					break;
				}
			}

			if(falg) {
				//System.out.print(i + "\t");
				count++;
			}
		}

		long end = System.currentTimeMillis();

		
		System.out.println(" 素数的个数有:" + count );
		System.out.println(" 花费的时间有:" + (end-start) );
	}
}
