public class TriangularSeries {
    public static void main(String[] args) {
        int n = 10;
        
        System.out.print("Triangular Number Series: ");
        for (int i = 1; i <= n; i++) {
            int triNum = (i * (i + 1)) / 2;
            System.out.print(triNum + " ");
        }
    }
}
