public class PrimeSeries {
    public static void main(String[] args) {
        int n = 10, count = 0, num = 2;

        System.out.print("First " + n + " Prime Numbers: ");
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
