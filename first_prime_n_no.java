public class PrimeSeries {                                          //creating a class
    public static void main(String[] args) {                                 //main method
        int n = 10, count = 0, num = 2;                                   //declaring and initializing a variables

        System.out.print("First " + n + " Prime Numbers: ");
        while (count < n) {                                                     //using while loop
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {                                 //isprime method
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
