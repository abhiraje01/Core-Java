class DuckNo                                       //creating a class
{
	public static void main(String[] args)                          //main method
	{
		int num=035;                              //declaring and initializing num variable
		int count=0;                         //declaring and initializing count variable 
		int res=num;                     //declaring and initializing res variable
		int rev=0;                        //declaring and initializing rev variable

		while (num>0)
		{
			int rem=num%10;                       //getting last digit
			if (rem==0)
			{
				count++;                    //increasing count by 1
			}
			num/=10;                     //deleting the last digit
		}
		num=res;                              //reinitializing the num variable 
		while (num>0)
		{
			int rem=num%10;                      //deleting the last digit
			rev=rev*10+rem;                       //performing the operation
			num/=10;                    //deleting the last digit
		} 
		int rem1=rev%10;                   //getting last digit of rev value
		if (rem1!=0 && count>=1)                      //checking the condition
		{
			System.out.println(" It iS Duck No.");                      //printing it if conition matches
		}
		else
			System.out.println(" It is Not a Duck No.");                     //printing statement if condition not matches

	}
}
