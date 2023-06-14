public class Pyramid {
    public static void main(String[] args) {
        int n = 5; // number of rows 
        for (int i = 1; i <= n; i++) {
            // this will print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // this will print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}