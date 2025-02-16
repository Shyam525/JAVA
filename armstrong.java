
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int count = 0, r, armstrong = 0;

        // Count the number of digits
        while (n > 0) {
            n = n / 10;
            count++;
        }

        n = originalNumber;

        // Calculate Armstrong number
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            armstrong += Math.pow(r, count);
        }

        // Check if the number is an Armstrong number
        if (armstrong == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
