class NeonNo      //creating a class
{
	public static void main(String[] args)              //main method
	{
		int num =9;                      //declaring and initializing num variable
		int square = num*num;                       //multiplying num by num
		int sum =0;                    //declaring and initializing sum variable

		while (square>0)            //while loop
		{
			int rem=square%10;             //getting last digit
			sum=sum+rem;                //adding sum and last digit
            square=square/10;                    //deleting last digit
			
		}
		if (sum==num)              
		{
			System.out.println("No. Is Neon");
		}
		else
		{
		System.out.println("No Is Not neon");
		}
		
	}
}
