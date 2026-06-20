package REPO.DSA.JAVA.Lec_6;


public class numericDataType {
    public static void main(String[] args) {

    // Numeric Datatype : Byte , short , long , int

    // Byte     1 byte      -128 to 127
    //Default value: 0
    byte num1 = 10;
    byte num2 = -128;
    System.out.println(num1 + "  " + num2);

    // Short    2 byte      -32,768 to 32,767
    //Default value: 0
    short num3 = 50;
    short num4 = 3276;
    System.out.println(num3 + "  " + num4);

    // int      4 byte       -2³¹ to 2³¹-1
    //Default value: 0
    int num5 = 124324;
    int num6 = 545341231;
    System.out.println(num5 + "  " + num6);

    // long     8 byte        -2⁶³ to 2⁶³-1            L should be at the end (without it java treat it as INT)
    //Default value: 0
    long num7 = -4259534248654690345L;
    long num8 = 5453412303292393291L;
    System.out.println(num7 + "  " + num8);
    
    }
}
