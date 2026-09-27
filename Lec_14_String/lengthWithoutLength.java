package REPO.DSA.JAVA.Lec_14_String;

public class lengthWithoutLength {
    public static void main(String[] args) {
        
        String s1 = "A Man is A Man";
        char[] ch = s1.toCharArray();
        int length = 0;
        // for(char val : ch ){
        for (int i = 0; i < ch.length; i++) {
            length++;
        }
        System.out.println("Length of string is : " + length);
    }
}
