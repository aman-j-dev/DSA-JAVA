package REPO.DSA.JAVA.Lec_9;
import java.util.Scanner;
public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Integer : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            //  a > b
            if(a>c){
                // a > b , a > c
                System.out.println(a + " is Greatest");
            }else{
                // a > b , c > a
                System.out.println(c + " is Greatest");
            }
        }
        // b > a 
        else if(a>c){    
            // b > a , a > c
                System.out.println(b + " is Greatest");
        }
        //  b > a , c > a
        else{
            if(b > c){  // b>a , c>a , b>c
                System.out.println(b + " is Greatest");
            }else{      // b>a , c>a , b<c
                System.out.println(c + " is Greatest");
            }
        }
        sc.close();
    }
}
