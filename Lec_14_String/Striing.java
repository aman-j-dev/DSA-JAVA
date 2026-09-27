package REPO.DSA.JAVA.Lec_14_String;
public class Striing {

    // String is a class not a primitive data type

    // heap memory have a special space name String Pool

    // string will take memory in string pool
    // and its literal will take memory in stack 

    // "A Man is a Man"   it is a string of s1 and str 

    // "A Man is a Man" will take memory in string pool only 1 time
    // both s1 and str in stack memory will point to same memory address;
    // Whenever A String is made , first thing it do is to check where the same string 
    // is already present in string pool or not , if not  already present will alocate new memory
    // if alread exist then it will use that one 

    public static void main(String[] args) {
        String s1 = " A Man is a Man";
        String str = new String("A man is a Man");

        System.out.println(str + s1);

        System.out.println(s1.length());
        System.out.println(s1.charAt(8));
        System.out.println(s1.charAt(14));

        String s2 = "Aman";
        s2 = "Jangra";
        
        System.out.println(s2);
    }
}

// String is immutable  : if string is created it cant be changed but can be replaced

// String s2 = "Aman";
// s2 = "Jangra";

// what actually happened is s2 literal goes to stack memory which give reference to "Aman" which was allocated in String pool
// I cant modify "Aman" like "Atan"   replacing m with t
// can completely change "Aman" to "Jangra" , here "Jangra" get his new memory allocation in string pool , 
// Both Aman and Jangra have different memory alloacated in string pool
// and now s2 literal will refer to "Jangra"

// Jangra will not get the same memory locationn that  Aman had in String pool