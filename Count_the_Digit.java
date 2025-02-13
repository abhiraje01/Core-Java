class Count_the_Digit
  {
    public static void main(String[] args)         //Main() 
    {
      int num=23456;     // declaring num variable to storing the number
      int count=0;    // Declaring count variable To Storing the count
      while (num>0)
        {
          count++;            //Increment the count by 1
          num/=10;             //Deleting the last digit
        }
      System.out.println(count);         // Printing The fina count
    }
  }

//Output:- 5
