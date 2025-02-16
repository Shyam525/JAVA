public class Arr2Dprac {
    
    public static void main(String args[]){

        int a[][] = new int[5][5];
        int b[][] = {{1,2,3},{2,3,4},{3,4,5}};

        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                System.out.print(b[i][j] + " ");
            } 
            System.out.println();  // Change from System.out.print(" ");
        }
    }
}
 