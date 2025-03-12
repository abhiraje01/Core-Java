class DecimalToBinary                           //Creating a class
{
	public static void main(String[] args)                   //main Method
	{
		int num=12;                             //Declaring and Iniializing num Variable
		int bin=0;                            //Declaring and Initializing bin Variable
		int i=1;                            //Declaring and Initializing i Variable

		while (num>0)
		{
			int rem=num%2;                   //Modulus of 2
			bin=rem*i+bin;                       //Operations
			num/=2;                           //Division of 2
			i*=10;

		}
		System.out.println(bin);               //Printing the Result
	}
}
