class printalternative_digit                     //creating a class
  { 
    public static void main(String[] args)                     //main method
    { 
      int num=8790;                      //declaring and initializing num variable
      int count=0;                        //declaring and initialzing count variable 
      while (num>0)
        {
          int rem=num%10;                          //getting last digit
          count++;                                   //increasing the count by 1
          if (count%2==0)
          {
            Sytem.out.println(rem);
          }
          num/=10;                                       //deleting the last digit
        }
    }
  }
