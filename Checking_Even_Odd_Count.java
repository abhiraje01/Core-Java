class Checking_Count_Even_Odd_Digit              //creating a class
  {
    public static void main(String[] args)                   //main Mehtod
    {
      int num=22345;            //decalring and initializing num variable
      int count=0;            //decalring and initializing count variable
      while (count>0)            //while loop
        {
          count++;           //adding the count
          num/=10;            //deleting the last digit
        }
      if (count%2==0)                //checking count is even or not
        System.out.println("The Count Is Even");               //if count is even 
      else
        System.out.println("The Count Is Odd");                   //else count is odd
    }
  }
