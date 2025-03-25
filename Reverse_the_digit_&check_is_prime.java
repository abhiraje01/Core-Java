public class ReversePrime {
    public static void main(String[] args) {
        int num = 37, reversed = 0, temp = num;

        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        if (isPrime(reversed))
            System.out.println(reversed + " is Prime");
        else
            System.out.println(reversed + " is NOT Prime");
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
