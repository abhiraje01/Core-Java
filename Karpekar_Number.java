import java.util.Scanner;

public class KaprekarNumber {                              //creating a class
    public static void main(String[] args) {                    //main method
        Scanner sc = new Scanner(System.in);                           //scanner class
        System.out.print("Enter a number: ");
        int num = sc.nextInt();                                              //declaring and initializing num variable
        sc.close();

        int square = num * num;
        int temp = square, divisor = 1;

        while (temp > 0) {
            int left = square / divisor;
            int right = square % divisor;
            if (divisor > 1 && left + right == num) {
                System.out.println(num + " is a Kaprekar Number.");
                return;
            }
            divisor *= 10;
            temp /= 10;
        }
        System.out.println(num + " is NOT a Kaprekar Number.");
    }
}
