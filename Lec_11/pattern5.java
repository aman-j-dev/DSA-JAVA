package REPO.DSA.JAVA.Lec_11;
import java.util.Scanner;
public class pattern5 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int k =1 ; k <= n-i ; k++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= ((i*2)-1) ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}