class EvilNo
{
	public static void main(String[] args) 
	{
		int num=11;
		int bin=0;
		int i=1;
		int count=0;

		while (num>0)
		{
			int rem=num%2;
			bin=rem*i+bin;
			num/=2;
			i=i*10;
		}
		
		while (bin>0)
		{
			int rem=bin%10;
			if (rem==1)
			{
				count++;
			}
			bin/=10;
		}

		if (count%2==0)
		{
			System.out.println(" It Is Evil No.");
		}
		else
			System.out.println(" It Is Not Evil No.");

	
	}
}
