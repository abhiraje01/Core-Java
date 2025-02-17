class Sum_Of_Even_Digit            //Created a Class
{
	public static void main(String[] args)        //Main Method
	{
		int num=2345;              //declaring num variable and initializing
		int sum=0;                 //declaring and initializing sum variable

		while (num>0)             //using while loop
		{
			int rem=num%10;      //getting last digit
			if (rem%2==0)         //checking the last digit is even or not
			{
				sum=sum+rem;        //adding the last digit 
			}
			num/=10;           //deleting the last digit
		}
		System.out.println(sum);          //Printing The Sum
	}
}
