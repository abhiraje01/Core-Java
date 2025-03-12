class HappyNo                                //Creating a class
{
	public static void main(String[] args)                //main method
	{
		int num=13;                     //declaring and initializing num Variable
		
		int sum=0;                  //Declaring and Initializing sum Variable
		int num1=num;                 //Declaring and Initializing a num1 Variable 

		while (num>0)
		{
			int rem=num%10;                  //Getting Last Digit
			int square=rem*rem;                    //Taking Square of Last Digit
			num=num/10;                       //Deleting The Last Digit
			sum=square+num;                  //Performing the Operation
			
		}
		System.out.println(sum);
		if (sum==1)                                   
			System.out.println(num1 + "  Is Happy No.");
		else
			System.out.println(num1+ " Is Not a Happy No.");

	}
}
