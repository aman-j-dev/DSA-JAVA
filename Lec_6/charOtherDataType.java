package REPO.DSA.JAVA.Lec_6;

public class charOtherDataType {
    public static void main(String[] args) {
        
        // char     2 byte      stores unicode character 
        // 0 to 65535 (\u0000 to \uffff)
        // 97 -> A                      65 -> a
        char ch = 'A';
        char ch1 = '\u0048';
        System.out.println(ch + "  " + ch1);
        char ch2 = 67;
        System.out.println(ch2 + "  " +(int)'A' + "  " + (char)(ch2-2));


        // Boolean  JVM dependent 
        // Stores logical values: true or false.
        // Default value: false                 0 or 1 not allowed , use true or false
        boolean test = true;
        System.out.println(test);
    }
}
