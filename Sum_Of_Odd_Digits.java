class Sum_Of_Odd_Digit
  {
    public static void main(String[] args)
    {
      int num=2345;   //Variable Declaration and Initialization
      int sum=0;

    while (num>0)
      {
        int rem=num%10;
        if (rem%2!=0)
        {
          sum=sum+rem;
        }
          num/=10;   //Compound Assignment Deleting the Last Digit
      }
      System.out.println(sum);
    }
  }
