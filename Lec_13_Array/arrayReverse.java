package REPO.DSA.JAVA.Lec_13_Array;

public class arrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9}; 
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.print("Reversed Array : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
