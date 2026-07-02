package REPO.DSA.JAVA.Lec_12;

public class methodTable5Static {
    public static void table(int num){
        for(int i = 1 ; i <=10 ; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
    public static void main(String[] args) {
        table(5);
    }
}
