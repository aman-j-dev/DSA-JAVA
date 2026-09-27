package REPO.DSA.JAVA.Lec_14_String;


public class Palindrome {
    public static void main(String[] args) {
        String s1 = "MANNAM";
        String s2 = "RACECAR";
        String s3 = "MANAMANA";

        Palindromme(s2);
        Palindromme(s1);
        Palindromme(s3);

    }
    // public static void Palindromme(String str){
    //     boolean check = true;
    //     for(int i = 0 , j = (str.length()-1) ; i <= j ; i++ , j--){
    //         if(str.charAt(i) != str.charAt(j)){
    //                 check = false;
    //                 break;
    //         }else{
    //                continue;
    //         }
    //     }
    //     if(check == true){
    //         System.out.println(str + " is a Palindrome");
    //     }else{
    //         System.out.println(str + " is not a palindrome");
    //     }
    // }

    // OR

    public static void Palindromme(String str){
        String reverse = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println(str + " is a Palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
