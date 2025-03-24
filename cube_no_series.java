public class CubeSeries                    //creating a class
{                            
    public static void main(String[] args)               //main method
    {
        int n = 10;                 //declaring and initializing n variable
        
        System.out.print("Cube Number Series: ");                    //printing the number
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
    }
}
