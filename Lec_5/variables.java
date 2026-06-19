package REPO.DSA.JAVA.Lec_5;

public class variables {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        System.out.println("SUM of a and b is : " + (a+b));

        double ddo =12.5;
        System.out.println(ddo);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0 ; i<=9 ; i++){
            System.out.print(" " + arr[i] + " ");
        }
        
        System.out.println();
        double[] arr2 = {12.5 , 15.3 , 6 , 13.2 , 89.00 ,84.5};
        for(int i = 0 ; i<=5 ; i++){
            System.out.print(" " + arr2[i] + " ");
        }

        // JAVA DONT GIVE GARBAGE VALUES AT ALL 
        // If YOU are out of bound like i<=15   only arr index are 0 to 9
        // SO it will give out of bound error , it will give error while running
        // like half of the program already ran than error : 

        // SUM of a and b is : 11
        // 12.5
        //  1  2  3  4  5  6  7  8  9  10 
        //  12.5  15.3  6.0  13.2  89.0  84.5 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
        //         at REPO.DSA.JAVA.Lec_5.variables.main(variables.java:21)

        System.out.println();
        String str = "HI BOPOPOP";
        System.out.println(str);

        int main = 50;
        System.out.println(main);
        // main is not a keyword
    }
}
