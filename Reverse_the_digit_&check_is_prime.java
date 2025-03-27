public class ReversePrime {                            //craeting a class
    public static void main(String[] args) {              //main Method
        int num = 37, reversed = 0, temp = num;                //declaring and initializing a variable

        while (temp > 0) {                       //while loop
            reversed = reversed * 10 + temp % 10;               //performing operations
            temp /= 10;                          //deleting last digit
        }

        if (isPrime(reversed))
            System.out.println(reversed + " is Prime");
        else
            System.out.println(reversed + " is NOT Prime");
    }

    public static boolean isPrime(int n) {                   //isprime method
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
