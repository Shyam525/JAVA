public class Add2Matrices {
   
    public static void main(String[] args){

        int a[][] = {{1,2,3},{2,3,4}};
        int b[][] = {{3,4,5},{4,5,6}};

        // Initialize c array with dimensions of a
        int c[][] = new int[a.length][a[0].length];
        
        // Correct assignment of matrix addition
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        // Print the result matrix c
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}


