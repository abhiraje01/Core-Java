class TechNo 
{
	public static void main(String[] args) 
	{
		int num=2085;
		int count=0;
		int res=num;
		while (num>0)
		{
			count++;
			num/=10;
		}
		if (count%2==0)
		{
			num=res;
			int div=count/2;
			int den=1;
			for (int i=1;i<=div;i++)
			{
				den=den*10;
			}
			int firsthalf=num%den;                     
			int secondhalf=num/den;
			int sum=firsthalf+secondhalf;
			int mul=sum*sum;
			if (mul==res)
			{
				System.out.println(res+ " It is Tech No.");
			}
			else
				System.out.println(res+ " It is Not Tech No.");
		}
	}
}
