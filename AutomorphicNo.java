class AutomorphicNo           //creating a class
{
	public static void main(String[] args)           //main method
	{
		int num=76;                  //declaring and initializing a num variable
		int count=0;                  //declaring and initializing count variable
		int res=num;                  //declaring and initializing res variable

		while (num>0)
		{
			count++;                  //increasing the count
			num/=10;                //deleting the last digit
		}
		num=res;
		int square=num*num;                    //Performing mul operation
		int den=1;                         //declaring and initializing den variable
		for (int i=1;i<=count;i++ )
		{
			den=den*10;               //multiplying by 10
		} 
		int rem=square%den;
		System.out.println(rem);
	}
}
