class SunnyNo                                      //creating a class
{
	public static void main(String[] args)                         //main method 
	{
		int num=48;                                        //declaring and initializing num variable
		int sum=num+1;                                      //declaring and initializing sum variable
		boolean flag=false;                                  //declaring and initializng flag variable

		for (int i=1;i<=sum;i++)
		{
			if (i*i==sum)
			{
				flag=true;                              //re initializing flag variable
				break;                                      //using break keyword
			}
		}
		if (flag)
		{
			System.out.println(num+ " Is a Sunny no.");
		}
		else
			System.out.println(num+ " Is Not a Sunny No.");


	}
}
