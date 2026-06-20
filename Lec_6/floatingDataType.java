package REPO.DSA.JAVA.Lec_6;

public class floatingDataType {
    public static void main(String[] args) {
        // Floating data types : float , Double

        // float        4 byte      6 to 7 decimal digit precision
        // Notice the F. Without F, Java treats decimal values as double.
        // Default value: 0.0f
        float discountRate = 12.5F;
        System.out.println(discountRate);


        // Double       8 byte      15 decimal digit precision
        // Never use double for precise currency calculations due to rounding issues.
        //Default value: 0.0
        double num2 = 387.2940344344893;
        System.out.println(num2);


        
    }
}
