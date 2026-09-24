package REPO.DSA.JAVA.Lec_12_Method;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();
        float sum2 = SuM(x, y);
        float sumAll = SuM(x, y, z);
        System.out.println("Sum of first two  : " + sum2 );
        System.out.println("Sum is : " + sumAll );
        sc.close();
    }
    
    public static float SuM(float a , float b){
        return (a+b);
    }
    public static float SuM(float a , float b , float c){
        return (a+b+c);
    }
}
