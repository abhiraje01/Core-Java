public class RandomNumber                       //creating a class
    {
    public static void main(String[] args)              //main method
        {
        int min = 1, max = 100;                  //declaring and initializing min variable
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;

        System.out.println("Random Number: " + randomNum);           //printing the statement
    }
}
