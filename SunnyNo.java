class SunnyNo 
{
	public static void main(String[] args) 
	{
		int num=48;
		int sum=num+1;
		boolean flag=false;

		for (int i=1;i<=sum;i++)
		{
			if (i*i==sum)
			{
				flag=true;
				break;
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
