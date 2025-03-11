class PerfectNo                       //creating a class
{
	public static void main(String[] args)                //main method
	{
		int num=28;             //declaring and initializing num variable
		int sum=0;             //declaring and initializing sum variable

		for (int i=1;i<num;i++ )                  //for loop
		{
			if (num%i==0)                    //checking the condition
			{
				sum=sum+i;                  //performing operation
			}
		}
		if (sum==num)
		{       
			System.out.println(num+ " Is Perfect No.");                  //printing
		}
		else
            System.out.println(num+ " Is Not a Perfect No");
	}
}
