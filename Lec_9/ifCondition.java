package REPO.DSA.JAVA.Lec_9;
import java.util.Scanner;
public class ifCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Integer : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + " is greater than " + b);
        }
        if(a<b){
            System.out.println(b + " is greater than " + a);
        }
        sc.close();
    }
}
