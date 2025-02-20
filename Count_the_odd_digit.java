class Count_the_odd_digit         //creating a class
  {
    public static void main(String[] args)               //main Method
    {
      int num=234567;               //decalring and initializing num variable 
      int count=0;                 //declaring and initializing count variable
      while (num>0)              //while loop
        {
          int rem=num%10;                //Taking last Digit
          if(rem%2!=0)                //checking the odd digit
          {
            count++;                //if digit is odd then count it
          }
            num/=10;              //deleting the last digit
        }
      System.out.println(count);             //printing the total count
    }
  }
