public class increSizeofArray {
    public static void main(String args[]){

        int a[] = {8,6,10,9,2};
        int b[] = new int[2*a.length];
        a=b;
        b=null;
        System.out.println(a.length);
    }
}
