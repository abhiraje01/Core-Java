class Count_the_even_digit
  {
    public static void main(String[] args)            //Main Method
    {
      int num=23456;  //declare a num variable to store a number
      int count=0;    //declare a count variable to store a count
      while (num>0)          //Using While Loop
        {
          int rem=num%10;             //Getting Last Digit
          if (rem%2==0)             //Checking if it is even then increase the count by using if loop
          {
            count++;
          }
          num/=10;
        }
      System.out.println(count);
    }
  }
//output:-3
