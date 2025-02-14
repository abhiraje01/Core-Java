class Count_even_odd_digit
  {
    public static void main(String[] args)      //main Method
    {
      int num=6534;            //Declaring a Num Varaible for Storing a Number
      int counteven=0;         //Declaring a counteven Variable for storing a even count
      int countodd=0;          //Decalring a countodd  Variable for storing a odd Count 

    while (num>0)                //Using While loop For Iteration
      {
        int rem=num%10;           //Taking Last Digit
        if (rem%2==0)             //Checking the digit is even or odd
        {
          counteven++;
        }
        else
        {
          countodd++;
        }
        num/=10;
      }
      System.out.println(counteven);
      System.out.println(countodd);
    }
  }
