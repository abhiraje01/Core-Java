class HappyNo
{
	public static void main(String[] args)
	{
		int num=13;
		
		int sum=0;
		int num1=num;

		while (num>0)
		{
			int rem=num%10;
			int square=rem*rem;
			num=num/10;
			sum=square+num;
			
		}
		System.out.println(sum);
		if (sum==1)
			System.out.println(num1 + "  Is Happy No.");
		else
			System.out.println(num1+ " Is Not a Happy No.");

	}
}