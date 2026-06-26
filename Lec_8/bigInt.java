package REPO.DSA.JAVA.Lec_8;
import java.math.BigInteger;
import java.util.Scanner;

public class bigInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two BIG INTEGER : ");
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println("Sum is : " + (a.add(b)));
        sc.close();
        
        // BigInteger is a built-in Java class
        //  (located in the java.math package) used to store integers of any size.
        //  It is not a primitive data type like int or long
        // Standard primitives like int store their binary values directly inside fixed hardware registers.

        // BigInteger handles memory completely differently.
        // It hides a dynamic array of integers (int[] mag) inside an object container structure.


        // Intended Math Operation     Standard Symbol     Correct BigInteger Method Syntax
        // Addition                        a + b                   a.add(b)
        // Subtraction                     a - b                   a.subtract(b)
        // Multiplication                  a * b                   a.multiply(b)
        // Division                        a / b                   a.divide(b)
        // Remainder (Modulus)             a % b                   a.remainder(b) or a.mod(b)

    }   
}
