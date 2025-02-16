import java.util.Scanner;
public class reversenum {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the numer ");
        int n = sc.nextInt();

        int r,rev=0;
        while(n>0){
            r = n%10;
            rev = rev*10 + r;
            n=n/10;
        }

        System.out.println(rev);
    }
}
