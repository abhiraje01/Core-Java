class printalternative_digit
  {
    public static void main(String[] args)
    {
      int num=8790;
      int count=0;
      while (num>0)
        {
          int rem=num%10;
          count++;
          if (count%2==0)
          {
            Sytem.out.println(rem);
          }
          num/=10;
        }
    }
  }
