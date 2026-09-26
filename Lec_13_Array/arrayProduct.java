package REPO.DSA.JAVA.Lec_13_Array;
import java.math.BigInteger;


public class arrayProduct {
    public static void main(String[] args) {
    int[] arr = {87,9,85,64,2,7,5,4,872,84298,2,42489,4,892,9};

    BigInteger product = new BigInteger("1") ;

    for(int val : arr){
        product = product.multiply(BigInteger.valueOf(val));
    }
    System.out.println("Product of arr : " + product);

    }
}
