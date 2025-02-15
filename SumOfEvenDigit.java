class Sum_Of_Even_Digit 
{
	public static void main(String[] args)        //Main Method
	{
		int num=2345;              //declaring num variable and initializing
		int sum=0;                 //declaring and initializing sum variable

		while (num>0)             //using while loop
		{
			int rem=num%10;
			if (rem%2==0)
			{
				sum=sum+rem;
			}
			num/=10;
		}
		System.out.println(sum);
	}
}
