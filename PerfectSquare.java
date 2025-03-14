class PerfectSquare                         //creating a class
{
	public static void main(String[] args)                    //main method
	{
		int num=49;                      //declaring and initializing num variable
		boolean flag=false;              //declaring and initializing flag variable

		for (int i=1;i<=num;i++ )
		{
			if (i*i==num)  
			{
				flag=true;          //re initializing a flag variable
				break;           //break keyword
			}
		}
			if (flag)
			{
				System.out.println(num+ " It is Perfect Square");
			}
			else
				System.out.println(num+ " It Is Not Perfect Square");
		}
	
}
