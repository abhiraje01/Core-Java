class SumOfEachDigit                      //Created a Class
{
	public static void main(String[] args)         //Main Method
	{
		int num=2345;               //Declaring and Initializing Num Varible 
		int sum=0;               //Declaring and Initializing a sum variable

		while (num>0)                 //using While Lopp
		{
			int rem=num%10;               //taking last digit from Given Number
			sum=sum+rem;            //Doing Addition of sum(initially Zero)+rem(last Digit)
			num/=10;            //Deleting Last Digit
		}
		System.out.println(sum);         //printing the sum
		
	}
}
