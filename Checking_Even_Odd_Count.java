class Checking_Count_Even_Odd_Digit
  {
    public static void main(String[] args)
    {
      int num=22345;
      int count=0;
      while (count>0)
        {
          count++;
          num/=10;
        }
      if (count%2==0)
        System.out.println("The Count Is Even");
      else
        System.out.println("The Count Is Odd");
    }
  }
