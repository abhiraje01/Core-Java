class Count_the_even_digit
  {
    public static void main(String[] args)
    {
      int num=23456;  //declare a num variable to store a number
      int count=0;    //declare a count variable to store a count
      while (num>0)
        {
          int rem=num%10;
          if (rem%2==0)
          {
            count++;
          }
          num/=10;
        }
      System.out.println(count);
    }
  }
//output:-3
