class Reverse_the_digit                //creating a class
  {
    public static void main(String[] args)        //main method
    {
      int num=1234;                    //declaring and initializing num variable
      int rev=0;                      //declaring and initializing rev variable
 
    while (num>0)
      {
        int rem=num%10;                     //getting last digit
        rev=rev*10+rem;                    //performing operations
        num/=10;                           //deleting the last digit 
      }
      System.out.println(rev);
    }
  }
