package REPO.DSA.JAVA.Lec_13_Array;

public class arraySum {
    public static void main(String[] args) {
        int[] arr = {88,75,92,56,78,94,31};

        int sum = 0;

        // for(int i = 0 ; i < arr.length ; i++){
        //     sum += arr[i];
        // }

        for( int val : arr){
            sum += val;
        }
        System.out.println("Sum is : " + sum);
    }
}
