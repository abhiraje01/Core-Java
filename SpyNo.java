class SpyNo              //creating a class
{
	public static void main(String[] args)            //main method
	{
		int num=1234;
		int sum=0;   //declaring and initializing sum variable
		int mul=1;  //declaring and initializing mul varaible
		int num1 = num;  //declaring and initializing num1 variable

		while (num>0)
		{
			int rem=num%10;    //getting the last digit
			mul=mul*rem;
			sum=sum+rem;
			num=num/10;        //deleting the last digit
		}
		if (sum==mul)
		{
			System.out.println(num1 +" Is Spy No.");                //printing if it is spy no
		}
		else 
			System.out.println(num1 + " Is Not a Spy No.");
	}
}
