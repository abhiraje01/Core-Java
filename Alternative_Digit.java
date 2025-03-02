class Alternative_Digit                            //Creating a Class
{
	public static void main(String[] args)                  //Main Method
	{
		int num=42537;                    //Declaring and Initializing num Variable
		int count=0;                  //Declairng and Initializing Count Variable

		while (num>0)                       //While Loop
		{
			int rem=num%10;               //Getting Last Digit
			count++;                       //Using Post Increment for Count
			if (count%2==0)                  //checking the count dividation
			{
				System.out.println(rem);             //Printing the digit
			}
			num/=10;                          //Deleting the last Digit

		}
	}
}
