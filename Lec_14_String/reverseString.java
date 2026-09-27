package REPO.DSA.JAVA.Lec_14_String;

public class reverseString {
    public static void main(String[] args) {
        String s1 = "A Man Is A MAN";
        System.out.println(reverse_String(s1));


    }
    public static String reverse_String(String str){
        String Reverse = "";
        for(int i = (str.length() - 1) ; i >= 0 ; i--){
            Reverse = Reverse + str.charAt(i);
        }
        return Reverse;
    }
}
