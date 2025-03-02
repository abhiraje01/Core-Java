class ArmstrongNo                 //Creating a class
{
	public static void main(String[] args)                //main Method
	{
		int num=163;                       //Declaring and Initializing num Variable
		int count=0;                          //Declaring and Initializing Count Variable
		int res=num;                       //Declaring and Initializing res Variable
		int sum=0;                        //Declaring and Initializing sum Variable

		while (num>0)                            //While loop
		{
			count++;                                //Using post Increment for count
			num/=10;                          //Deleting the last digit
		}
		num=res;
		while (num>0)
		{
			int rem=num%10;                  //getting the last digit
			int mul=1;                       //declaring and initializng mul variable
			for (int i=1;i<=count;i++)              //for Loop
			{
				mul*=rem;                    //multiplying mul by rem
			}
			sum+=mul;                  //adding sum and mul
			num/=10;                           //deleting the last digit
		}
		if (sum==res)
		{
			System.out.println(res + " Is a Armstrong No.");
		}
		else
			System.out.println(res +" Is Not Armstrong No.");
	}
}
