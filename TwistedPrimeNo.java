class TwistedPrimeNo                     //creating a class
{
	public static void main(String[] args)                 //main method 
	{
		int num=13;                        //declaring and initializing num varible
		int count1=0;                     //declaring and initializing count1 variable
		int count2=0;                        //declaring and initializing count2 variable
		int rev=0;                  //declaring and initializing rev variable	
		int res=num;			//declaring and initialzing res variable

		for (int i=1;i<=num;i++)
		{
			if (num%i==0)              //if condition
			{
				count1++;                //increasing count1 by 1
			}
		}
		while (num>0)
		{
			int rem=num%10;                  //getting last digit
			rev=rev*10+rem;                 //performing operation
			num/=10;                         //deleting last digit
		} 
		num=res;                          //initializing num variable
		for (int i=1;i<=rev;i++)
		{
			if (rev%i==0)
			{
				count2++;                     //increasing count2 by 1
			}
		}
		if (count1==2 && count2==2)                          //checking the condition
		{
			System.out.println(" It Is Twisted PrimeNo.");                      //if condition satisy then printing it
		}
		else
			System.out.println(" It Is Not a Twisted PrimeNo.");
	}
}
