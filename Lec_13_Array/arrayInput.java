package REPO.DSA.JAVA.Lec_13_Array;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float[] arr;

        System.out.print("Enter the length of Array : ");
        int n = sc.nextInt();

        arr = new float[n];

        System.out.print("Enter the elements of array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextFloat();
        }

        System.out.print("Elements of arr : ");
        for( float val : arr){
            if (val % 1 == 0) {
                System.out.printf("%.0f ", val);
            } else {
                System.out.print(val + " ");
            }
        }

        sc.close();
    }
}
