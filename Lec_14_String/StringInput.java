// two ways to take input : 
// .next()         it will take a word as a input (stop taking input as soon as empty space come)
// .nextLine()     it will take full complete sentence as a input     





package REPO.DSA.JAVA.Lec_14_String;
import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String(Word) : ");
        String s2 = sc.next();
        System.out.println(s2);

        // Consume the leftover newline character left by next()
        sc.nextLine(); // next line also reads everything

        System.out.print("\nEnter a String : ");
        String s1 = sc.nextLine();
        System.out.println(s1);

        sc.close();
    }
}



// When prompted with Enter a String(Word) : , you typed my and pressed Enter.

// The keyboard sent three characters into the input stream: 'm', 'y', and '\n' (newline).

// sc.next() reads only non-whitespace tokens. It grabbed "my", but left \n unread in the buffer.

// When execution reached sc.nextLine(), its job was to read everything up until the next newline.
//  It saw the leftover '\n' right away, considered the line finished,
//  and returned an empty string "" without waiting for your input.