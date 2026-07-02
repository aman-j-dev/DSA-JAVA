//         *
//       *   *
//     *       *
//   *           *
// * * * * * * * * *
package REPO.DSA.JAVA.Lec_11;
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j < n+1-i ; j++){
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i*2 - 1 ; k++){
                if(i == 1 || i == n || k == 1 || k == i*2-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
