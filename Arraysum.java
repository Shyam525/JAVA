public class Arraysum {
    
    public static void main(String args[]){

        int a[] = new int[10];
        

        int sum = 0;

        for(int i=0;i<=10;i++){
            sum = sum + a[i];
            System.out.println(sum);
        }
    }
}
