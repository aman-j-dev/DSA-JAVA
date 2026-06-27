package REPO.DSA.JAVA.Lec_10;
import java.util.Scanner;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number till you want prime number : ");
        int n = sc.nextInt();

        boolean flag;
        
        for(int i = 2 ; i <= n ; i++){
            flag = true;
            for(int j = 2 ; j*j <= i ; j++ ){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
