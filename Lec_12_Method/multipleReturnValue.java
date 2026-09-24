package REPO.DSA.JAVA.Lec_12_Method;
import java.util.Scanner;

public class multipleReturnValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        // 1. Call the method and store the returned array
        float[] results = did(x, y);

        // 2. Access the elements by index
        System.out.println("Sum: " + results[0]);
        System.out.println("Product: " + results[1]);
        
        sc.close();
    }

    // Return type changed from 'void' to 'float[]'
    public static float[] did(float a, float b) {
        // Creates an array of 2 floats on the fly and returns it
        return new float[]{ (a + b), (a * b) };
    }
}