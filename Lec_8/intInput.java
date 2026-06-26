package REPO.DSA.JAVA.Lec_8;
import java.util.Scanner;

public class intInput {
    public static void main(String[] args) {
        int a = 15 ,b = 30 ;
        System.out.println("Sum of a and b : " + (a+b));

        System.out.println("\n \n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of first number : ");
        int a1 = sc.nextInt();
        System.out.print("Enter value of Second number : ");
        int b1 = sc.nextInt();
        System.out.println("Sum is : " + (a1 + b1));
        sc.close();



        // nextInt()	    int
        // nextLong()	    long
        // nextFloat()	    float
        // nextDouble()	    double
        // next()	    single word String
        // nextLine()	    full line String

    }
}
