package REPO.DSA.JAVA.Lec_13_Array;

public class array {
    public static void main(String[] args) {
        
        int[] arr = {9,8,7,6,5};
        
        int[] brr = {99,88,77,66,55};

        // int[5] crr;        these are not allowed 
        // int crr[5];

        int[] crr;
        crr = new int[5];

        int n1 = arr.length;                    
        // int n2 = brr.length;            To find length of array [ 0 to n-1]
        // int n3 = crr.length;

        for(int i = 0 ; i < n1 ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int val : brr){                // For each loop
            System.out.print(val + " ");
        }

        System.out.println();

        for(int val : crr){
            System.out.print(val + " ");
        }
    }    
}
