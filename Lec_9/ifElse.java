package REPO.DSA.JAVA.Lec_9;
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
    
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are a smalll bacha");
        }
        sc.close();
    }   
}
