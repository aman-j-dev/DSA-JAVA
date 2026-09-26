package REPO.DSA.JAVA.Lec_13_Array;
import java.util.Scanner;

public class array2d_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][5];
        
        System.out.println("Enter Elements of array : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Row " + (i+1) + " with " + arr[i].length + " elements : ");
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nArray elements : ");
        for(int[] row : arr){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
