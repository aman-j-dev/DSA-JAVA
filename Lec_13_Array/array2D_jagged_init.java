package REPO.DSA.JAVA.Lec_13_Array;

public class array2D_jagged_init {
    public static void main(String[] args) {
        
        int[][] arr;

        arr = new int[4][];
        arr[0] = new int[5];
        arr[1] = new int[8];
        arr[2] = new int[6];
        arr[3] = new int[2];

        for(int[] row : arr){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}
