class ConditionExer{
	public static void main(String[] args) 
	{
		//今天是周2.10天以后是周几
		
		int week = 2;
		week +=5;
		week %= 7;

		System.out.println("今天是周2,10天以后是周 " + (week == 0? "日": week));

	}
}
