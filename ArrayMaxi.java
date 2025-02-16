import java.util.Scanner;

public class ArrayMaxi {
    public static void main(String[] args){
        int s[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers for the array:");
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int key = sc.nextInt();
        
        for(int i = 0; i < s.length; i++) {
            if(key == s[i]){
                System.out.println("Element found at: " + i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
