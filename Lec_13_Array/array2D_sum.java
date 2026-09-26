package REPO.DSA.JAVA.Lec_13_Array;

public class array2D_sum {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int sum = 0;
        int product = 1 ;

        for(int[] row : arr){
            for(int val : row){
                sum += val;
                product *= val;
            }
        }

        System.out.println("Sum is : " + sum + " and Product is : " + product);
    }
}
