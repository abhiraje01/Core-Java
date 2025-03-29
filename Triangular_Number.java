public class TriangularSeries {                    //craeting a class
    public static void main(String[] args) {              //main method
        int n = 10;                        //declaring and initializing n variable
        
        System.out.print("Triangular Number Series: ");               //printing the statement
        for (int i = 1; i <= n; i++) {                   //using for loop
            int triNum = (i * (i + 1)) / 2;                       //performing operations
            System.out.print(triNum + " ");                              //printing the statement
        }
    }
}
