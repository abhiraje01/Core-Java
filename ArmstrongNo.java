class ArmstrongNo 
{
	public static void main(String[] args) 
	{
		int num=163;
		int count=0;
		int res=num;
		int sum=0;

		while (num>0)
		{
			count++;
			num/=10;
		}
		num=res;
		while (num>0)
		{
			int rem=num%10;
			int mul=1;
			for (int i=1;i<=count;i++)
			{
				mul*=rem;
			}
			sum+=mul;
			num/=10;
		}
		if (sum==res)
		{
			System.out.println(res + " Is a Armstrong No.");
		}
		else
			System.out.println(res +" Is Not Armstrong No.");
	}
}
