package REPO.DSA.JAVA.Lec_7;

public class unaryOperatore {
    public static void main(String[] args) {
        
    //     +	Unary plus
    //     -	Unary minus
    //     ++	Increment
    //     --	Decrement
    //     !	Logical complement


    int a = 9;

    int b = +a;
    System.out.println("Value of b is : " + b);

    int c = -a;
    System.out.println("Value of c is : " + c);
    
    // pre and post increament/decrement
    
    int d = a++;
    System.out.println("Value of d is : " + d);
    d = ++a;
    System.out.println("Value of d is : " + d);
    System.out.println("Value of a is : " + a);


    }
}
