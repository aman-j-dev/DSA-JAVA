package REPO.DSA.JAVA.Lec_13_Array;

public class array2D_Max_Min {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,-5,6},
            {7,8,9}
        };
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int[] row : arr){
            for(int val : row){
                max = Math.max(max, val);
                min = Math.min(val, min);
            }
        }
        System.out.println("Maximum is : " + max + " and Minimum is : " + min);
    }
}
