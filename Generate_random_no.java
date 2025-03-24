public class RandomNumber {
    public static void main(String[] args) {
        int min = 1, max = 100;
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;

        System.out.println("Random Number: " + randomNum);
    }
}
