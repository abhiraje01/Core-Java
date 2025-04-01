class SpyNo                    //Creating a class
{
	public static void main(String[] args)                     //main Method
	{
		int num=1234;                     //Declaring and Initializing num Variable
		int sum=0;               //Declaring and Initializing Sum Variable
		int mul=1;              //Declaring and Initializing Mul Variable
		int num1 = num;            //Declaring and Initializing Num1 Variable

		while (num>0)
		{
			int rem=num%10;    //Getting Last Digit
			mul=mul*rem;           //Multiplying mul and rem
			sum=sum+rem;
			num=num/10;        //Declaring and Initializing num Variable
		}
		if (sum==mul)
		{
			System.out.println(num1 +" Is Spy No.");            //printing the statement
		}
		else 
			System.out.println(num1 + " Is Not a Spy No.");              //printing the statement
	}
}
