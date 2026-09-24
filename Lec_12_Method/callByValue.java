package REPO.DSA.JAVA.Lec_12_Method;

public class callByValue {
    public static void main(String[] args) {
        int num = 2;
        System.out.println("Outside funciton before method call \n" + num );
        multiplyBy5(num);
        System.out.println("Outside funciton after method call \n" + num );
    }
    public static void multiplyBy5(int num){
        System.out.println("FUNCTION CALLED");
        System.out.println("Inside function before multiplication \n"+ num);
        num*=5;
        System.out.println("Inside funtion After  multiplication \n" + num);
    }
}

// In call by value , we are sending a copy of variable to the funtion
