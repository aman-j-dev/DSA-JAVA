// String comparison is done by these three :
// ==                       it checks that both literal is refering to the same location in String pool
// .equal()                 Check each and every character (Case Sensitive)
// .equalsIgnoreCase()      only check if charater is same dont care about uppercase or lower



package REPO.DSA.JAVA.Lec_14_String;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Aman";
        String s2 = "Aman";
        String s3 = "AMAN";

        System.out.println(s1 == s2); //It check that s1 and s2 is refering to same address in String pool
        // it does not check the String , only check address

        System.out.println(s2.equals(s3)); // compare every chararcter (case sensitive) , empty space matter

        System.out.println(s1.equalsIgnoreCase(s3)); // compare every character (not case sensitive) , empty space matter
    }
}
