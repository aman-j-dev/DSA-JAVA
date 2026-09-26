package REPO.DSA.JAVA.Lec_13_Array;

public class arrayMax {
    public static void main(String[] args) {
        
        int[] arr = {-24,-87,98,5,7,2,1,5,6,8,499,3,-7850,8,8,8,898,29,5,2,98};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int val : arr){
            max = Math.max(val, max);
            min = Math.min(val, min);
        }

        System.out.println("Maximum value in array : " + max);
        System.out.println("Minimum value in array : " + min);
    }
}
