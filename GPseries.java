import java.util.Scanner;

public class GPseries {
     public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        int GP=0;
        int r;

        for(int i=0;i<=n;i++){

            
         r = (int)Math.pow(d,i);
        

         GP =  a*r;
         
         System.out.print(GP + ",");

        }

     }
}
