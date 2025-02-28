class EvilNo               //Creating a Class
{
	public static void main(String[] args)              //Main Method
	{
		int num=11;                     //declaring and initializing Num Variable
		int bin=0;                        //declaring and initializing bin variable
		int i=1;                         //declaring and initializing i variable
		int count=0;                 //declaring and initializing Count Variable

		while (num>0)
		{
			int rem=num%2;                 //Taking Last Digit
			bin=rem*i+bin;               //storing the Number in Bin by Performing Operation
			num/=2;                   //Dividing the digit by 2
			i=i*10;                   //multiplying i by 2
		}
		
		while (bin>0)
		{
			int rem=bin%10;                  //taking the last digit from bin
			if (rem==1)                      //checking the last digit==1
			{
				count++;                      //count 
			}
			bin/=10;                  //deleting the last digit
		}

		if (count%2==0)
		{
			System.out.println(" It Is Evil No.");                  
		}
		else
			System.out.println(" It Is Not Evil No.");

	
	}
}
