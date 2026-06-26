package REPO.DSA.JAVA.Lec_8;
import java.util.Scanner;
public class booleanInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of flag : ");
        boolean flag = sc.nextBoolean();
        System.out.println("Value of flag is : " + flag);
        sc.close();
    }
    
}
