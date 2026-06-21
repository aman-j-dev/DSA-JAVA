package REPO.DSA.JAVA.Lec_7;

public class arithmaticOperators {
    public static void main(String[] args) {
        int a = 8 , b =5;
        System.out.println("Sum is : " + (a+b));
        System.out.println("difference is : " + (a-b));
        System.out.println("Multiplication is : " + (a*b));
        System.out.println("Remainder is : " + (a%b));
        System.out.println("division is : " + (a/b)); // decimal points are discarded no rounded off
        System.out.println("division is : " + (((double)a)/b));

        //  int/int always give integer 
        //  if double is present in one or both places result will always be in decimal
    }
}
