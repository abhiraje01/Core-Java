class Sum_Of_Odd_Digit               //Creating a Class
  {
    public static void main(String[] args)     //main Method
    {
      int num=2345;   //Variable Declaration and Initialization
      int sum=0;       //varible declaration and initialization

    while (num>0)         //While Loop
      {
        int rem=num%10;      //Getting Last Digit
        if (rem%2!=0)         //Checking last digit is odd or not 
        {
          sum=sum+rem;          //adding last digit to sum
        }
          num/=10;   //Compound Assignment Deleting the Last Digit
      }
      System.out.println(sum);   //Printing The Sum
    }
  }
