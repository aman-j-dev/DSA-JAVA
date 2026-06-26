package REPO.DSA.JAVA.Lec_9;
import java.util.Scanner;
public class ifElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        
        if(marks >= 90){
            System.out.println("Excelent");
        }else if(marks >= 80){
            System.out.println("Good");
        }else if(marks >= 75){
            System.out.println("Average");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
