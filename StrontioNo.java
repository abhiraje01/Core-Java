class StrontioNo                              //creating a class
{
	public static void main(String[] args)                      //main method
	{
		int num=1386;                     //declaring and initializing num variable
		int count=0;                      //declaring and initializing count variable
		int res=num;                     //declaring and initialzing res variable
		while (num>0)
		{
			count++;
			num/=10;                       
		}
		if (count==4)
		{
			num=res;
			int mul=num*2;
			int den=1;
			int tensdigit=0;
			int hundreddigit=0;
			System.out.println("mul:"+ mul);
			while (mul>0)
			{
				den=den*10;
				int rem=mul%10;
				if (den==100)
				{
					System.out.println("tens" + rem);
					tensdigit=rem;
				}
				if (den==1000)
				{
					System.out.println("hundreds" + rem);
					hundreddigit=rem;
				}
				mul/=10;
			}
			if (tensdigit==hundreddigit)
			{
				System.out.println(" It Is Strontio No.");
			}
			else 
			{
				System.out.println("It is Not a Strontio No.");
			}
		}
		else 
		{
			System.out.println("It Is Not a Strontio No.");
		}
	}
}
