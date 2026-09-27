package REPO.DSA.JAVA.Lec_14_String;

public class eachCharOfString {
    public static void main(String[] args) {
        
        String s1 = "A Man is A Man";

        // char[] ch = s1.toCharArray();
        // int i = 0;
        // for(char val : ch){
        //     System.out.println("Character at index " + i + " is : " + val);
        //     i++;
        // }


        // OR

        for(int i = 0 ; i < s1.length() ; i++){
            System.out.println("Character at index " + i + " is : " + s1.charAt(i));
        }
    }
}
