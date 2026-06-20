package REPO.DSA.JAVA.Lec_6;

public class typeCasting {
    public static void main(String[] args) {
     
        // byte -> short -> int -> long
        // Implicit type casting , putting small size taking data into bigger size
        // Left to Right

        byte num1 = 120;
        int num2 = num1;
        System.out.println("Num2 is :" + num2);


        // Explicit type casting : typecasting that we are doing it
        // TWO case : Data loss and No data loss
        // like int a = 125    and we type cast it into byte , it will fit
    
        int a = 125;
        byte b = (byte)a;
        System.out.println("b is : " + b);

        int A = 25053;
        byte B = (byte)A;          // 25053 cant fit in byte so it will give random value
        System.out.println("B is : " + B);  // Data loss


    }
}
