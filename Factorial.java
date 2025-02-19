class Factorial        //Creating a class
{
  public static void main(String[] args)           //main Method
  {
    int num=5;              //declaring and initializing num variable
    int fact=1;             //declaring and initializing fact variable
    for(int i=num;i>=1;i--)                 //for loop
      {
        fact=fact*i;            //multiplying fact by i
      }
    System.out.println(fact);         //printing the fact
  }
}


//output=120
