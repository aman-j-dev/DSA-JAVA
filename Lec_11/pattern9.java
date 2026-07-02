//       *
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *
// FOR n = 4

package REPO.DSA.JAVA.Lec_11;
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n*2-1 ; i++){
            if(i <= n){
                for(int a = 1 ; a < n+1-i ; a++){
                    System.out.print("  ");
                }
                for(int b = 1 ; b <= i*2-1 ; b++){
                    System.out.print("* ");
                }
            }else{
                for(int c = 1 ; c <= i-n ; c++){
                    System.out.print("  ");
                }
                for(int d = 1 ; d < (n*2)-((i-n)*2) ; d++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
