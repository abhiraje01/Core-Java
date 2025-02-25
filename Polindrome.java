class Polindrome            //creating a class
{
	public static void main(String[] args)          //main method
	{
		int num=1861;                          //declaring and initializing num variable
		int rev=0;                             //declaring and initializing rev variable
		int num1=num;                            //declaring and initializing num1 variable

		while (num>0)                        //while loop
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (rev==num1)
		{
			System.out.println(num1+ " Is Polindrome Number");
		}
		else 
			System.out.println(num1+ " Is Not Polindrome Number"); 
	}
}
