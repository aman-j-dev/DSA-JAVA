package REPO.DSA.JAVA.Lec_14_String;

public class StringMethod {
    public static void main(String[] args) {
    String s1 = "Aman";
    String s2 = "AMAN";
    String s3 = "";
    String s4 = "  ";
    String s5 = "         A   Man  IS  A  MAN          ";

    System.out.println(s1.charAt(3));
    System.out.println(s1.length());
    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2));

    System.out.println(s3.isEmpty());         // check length of String(including whitespace)
    System.out.println(s4.isBlank());         // check if it contain characters or not(ignore whitespace) 


    System.out.println(s5.trim());            // Remove empty space from left and right    
    System.out.println(s5);   
    s5 = s5.trim();
    System.out.println(s5);

    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());

    
    
    }   
}
