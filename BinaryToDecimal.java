class BinaryToDecimal                       //Creating a Class
{
	public static void main(String[] args)                //main method
	{
		int num=101;                     //Declaring and Initializing a num Variable
		int bin=0;                   //Declaring and Initializing a bin Variable
		int i=1;                 //Declaring and Initializing a i Variable

		while (num>0)
		{
			int rem=num%10;                //Getting Last Digir
			bin=rem*i+bin;                //Performing Operations
			num/=10;                    //Deleting Last Digit
			i=i*2;
		}
		System.out.println(bin);
	}
}
