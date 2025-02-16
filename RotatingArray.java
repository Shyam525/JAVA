public class RotatingArray {
    public static void main(String args[]){

            
        
                int A[] = new int[10]; // Array with extra space for insertion
                A[0] = 3; A[1] = 9; A[2] = 7; A[3] = 8; A[4] = 12; A[5] = 6;
                int n = 6; // Number of elements currently in the array
        
                System.out.println("Original Array:");
                printArray(A, n);
        
                int x = 20;  // Element to insert
                int index = 4;  // Position where 'x' will be inserted
        
                // Shift elements to the right
                for (int i = n; i > index; i--) {
                    A[i] = A[i - 1];
                }
        
                A[index] = x; // Insert the new element
                n++; // Increase the count of elements
        
                System.out.println("Array after insertion:");
                printArray(A, n);
            }
        
            // Helper function to print an array
            public static void printArray(int[] arr, int length) {
                for (int i = 0; i < length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        
        }
         

     

