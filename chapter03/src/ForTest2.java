/*
�����Լ������С������
*/

class ForTest2{
	public static void main(String[] args) 
	{
		int n = 12;
		int m = 24;
		int min = m > n ? n : m;
		//�����Լ��
		for(int i = min ; i>0; i--){
			if (n % i == 0 && m % i == 0)
			{
				System.out.println("���Լ����" + i);
				break;
			}
		}

		//��󹫱���

		int max = m > n ? m : n;
		for (int j = max; j <= n * m ; j ++ )
		{ 
			if (j % n == 0 && j % m == 0)
			{
				System.out.println("��󹫱�����" + j);
				break;
			}
		}

	}
}
