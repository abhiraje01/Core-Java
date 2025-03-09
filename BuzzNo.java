class BuzzNo                                 //Creating a class
{
	public static void main(String[] args)         //main method
	{
		int num=45;                        //Declaring and Initializing a num Variable
		int rem=num%10;                   //Getting Last Digit
		if (rem==7 || num%7==0)              //Checking the Condition
		{
			System.out.println(num+ " Is a Buzz No.");             //Printing
		}
		else 
			System.out.println(num+ " Is Not a Buzz No.");
	}
}
