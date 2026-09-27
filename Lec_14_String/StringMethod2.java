package REPO.DSA.JAVA.Lec_14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String s1 = "A Man is AMAN";

        System.out.println(s1.charAt(6));

        String s2 = s1.substring(2, 5);
        // beginIndex -> Inclusive
        // endIndex   -> Exclusive
        System.out.println(s2);

        System.out.println(s1.contains("Man"));

        int val = 8890;
        String s3 = String.valueOf(val);
        System.out.println(val + 1);
        System.out.println(s3+1);       //concatenation

        System.out.println();

        System.out.println(s1.startsWith("A Man"));     //check if string starts with given
        System.out.println(s1.startsWith("Man"));

        System.out.println();
        
        System.out.println(s1.endsWith("Aman"));        //check if string ends with given
        System.out.println(s1.endsWith("AMAN"));

        System.out.println();
        
        char[] ch = s1.toCharArray();           //Convert String to Character array
        for(char value : ch){
            System.out.println("Value of char array : " + value);
        }

        System.out.println();
        
        String[] str = s1.split(" ");  // whenever whitespace is encountered it will split (we can also change it to some other like ,)
        for(String vall : str){
            System.out.println("Value of string str array : " + vall);
        }

        System.out.println();

        System.out.println(s1.replace("A", "p"));
    }
}
