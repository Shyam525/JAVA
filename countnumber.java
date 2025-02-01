import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, check = 0;
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            check++;

            System.out.println("Digit: " + r);
            System.out.println("Sum of digits so far: " + check);
        }
        
        System.out.println("Total number count is " + check);
    }
}

