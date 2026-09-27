package REPO.DSA.JAVA.Lec_14_String.HW;

public class charFreq {
    public static void main(String[] args){
        String s1 = "Here is a comprehensive overview covering all the core concepts discussed—ranging from JVM stream buffers and multi-value returns to string mutability, pointer mechanics, and linear-time frequency hashing:When executing Java console programs, user input flows from the terminal into standard input through an underlying byte stream buffered by System.in. The Scanner class parses this incoming sequence using regular expressions and internal delimiter boundaries. When using token-based extraction methods such as nextInt(), nextFloat(), or next(), the scanner discards any leading whitespace—including spaces, tabs, and newline characters (\\n)—before reading the requested token, stopping immediately at the next delimiter. However, these methods leave trailing delimiters untouched in the stream. Consequently, when an input line contains extraneous data—such as multiple values entered on a single prompt—those unread tokens remain in the memory buffer unconsumed. If the program terminates without further read operations, the operating system simply reclaims the process memory and discards the buffered stream without raising an exception. A notorious side effect of this buffering model arises when transitioning from a token-based read (next(), nextInt()) to a line-based read (nextLine()). Because nextLine() scans for and immediately consumes everything up to the next newline character without skipping leading whitespace, it encounters the lingering \\n left behind by the previous call and returns an empty string instantly. Resolving this issue requires placing an explicit, intermediary sc.nextLine() invocation to swallow the residual newline and clear the buffer before subsequent line reads.Beyond input handling, understanding Java's type system and execution model is fundamental to writing robust algorithms. A central principle of the Java Virtual Machine is that a method's return statement can place only a single entity onto the operand stack at runtime. Native tuple packing or multi-value commas inside parentheses do not exist in the language grammar. To return multiple values from a method, you must encapsulate those values into a single compound reference type allocated on the heap. When all returned values share an identical data type and clear positional semantics, a primitive array instantiated inline via dynamic allocation provides a low-overhead solution. When returning heterogeneous data types or values that require descriptive semantics, modern Java provides record components—immutable, transparent data carriers that automatically generate canonical constructors, field accessors, equals(), hashCode(), and toString() implementations with minimal boilerplate. For legacy systems, traditional classes with explicit constructors and immutable public fields achieve the same purpose. Regardless of whether a method is declared static or non-static, the mechanics of packaging and returning multiple items remain identical. The only distinction lies in invocation and scope: static methods belong directly to the class definition and operate purely on their passed arguments, whereas non-static instance methods require object instantiation via the new operator and retain access to the instance's internal fields through the implicit this reference.When manipulating sequences in memory, algorithmic design directly dictates execution efficiency. Array operations, such as reversal, highlight the critical difference between single-pass linear time and erratic pointer behavior. A standard two-pointer reversal operates in $O(n)$ time complexity by initializing one pointer at the start index and another at the terminal index, iteratively swapping elements toward the center until the pointers cross. Introducing nested loops without proper synchronization disrupts this balance, causing elements to be repeatedly displaced, partially inverted, and ultimately scrambled rather than reversed.Similarly, working with textual data requires strict adherence to memory allocation patterns and comparison semantics. In Java, strings are immutable reference objects stored within the heap. Comparing two string instances using the == identity operator does not evaluate character sequences; instead, it checks whether both reference variables point to the exact same physical memory address. Because strings can be created as distinct heap objects via the new keyword or interned inside the JVM's String Constant Pool, comparing strings with == introduces subtle, non-deterministic bugs. Structural content equality must always be validated using the .equals() method for exact character matching, .equalsIgnoreCase() for case-insensitive validation, or .compareTo() for lexicographical ordering. Primitive char variables, by contrast, are fundamentally 16-bit numeric values representing Unicode code points, meaning direct comparison via == is not only safe but standard practice.This numeric nature of primitive characters enables powerful algorithmic optimizations when computing frequency counts. A naive approach that counts character occurrences by looping through an alphabet range and repeatedly scanning the input string results in a quadratic or multiplied time complexity of $O(k \\times n)$, where $k$ is the alphabet size and $n$ is the string length. Because standard ASCII values fall within the compact range of integers 0 through 255, an integer array of size 256 can serve as a direct-mapped hash table. In a single linear pass of $O(n)$ time, each character extracted via str.charAt(i) is implicitly cast to its integer ASCII equivalent and used directly as an array index, incrementing the counter at that position in constant $O(1)$ time. Once the string has been fully processed, retrieving and displaying frequencies requires only a bounded traversal across the target index range—whether filtering specifically for uppercase letters ('A' through 'Z'), lowercase letters ('a' through 'z'), or evaluating character properties via utility methods like Character.isLetter(). By combining direct memory indexing with single-pass iteration, programs achieve optimal time efficiency, maintain clean variable scoping, and eliminate unnecessary nested loops.";
        characterFrequency(s1);
        
    }
    // public static void characterFrequency(String str){
    //     for(char ch = 'a' ; ch <= 'z' ; ch++){
    //         int count = 0;
    //         for(int i = 0 ; i < str.length() ; i++){
    //             if(str.charAt(i) != ch){
    //                 continue;
    //             }else{
    //                 count++;
    //             }
    //         }
    //         if(count == 0){
    //             continue;
    //         }
    //         System.out.println("Frequency of " + ch + " is : " + count);
    //     }
    //     for(char ch = 'A' ; ch <= 'Z' ; ch++){
    //         int count = 0;
    //         for(int i = 0 ; i < str.length() ; i++){
    //             if(str.charAt(i) != ch){
    //                 continue;
    //             }else{
    //                 count++;
    //             }
    //         }
    //         if(count == 0){
    //             continue;
    //         }
    //         System.out.println("Frequency of " + ch + " is : " + count);
    //     }
    // }



    // OR

    public static void characterFrequency(String str){
        int[] freq = new int[1114112];                          //0 to 255      total ASCII

        for(int i = 0 ; i < str.length() ; i++){
            freq[(int)str.charAt(i)]++;
        }
        int i = 0;
        for(int val : freq){
            if(val == 0){
                i++;
                continue;
            }else{
                System.out.println("Frequency of " + (char)i + " is : " + val );
                i++;
            }
        }
    }
    
}
