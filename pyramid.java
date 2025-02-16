public class pyramid {
    public static void main(String args[]) {
        int n = 10;  // Number of rows

        // Outer loop to handle number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to handle leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Inner loop to handle number of stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Ending line after each row
            System.out.println();
        }
    }
}
