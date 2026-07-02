package REPO.DSA.JAVA.Lec_12;

public class Table5DifferentClassStatic {
    public static void main(String[] args) {
        t2.table(18);
    }
}

class t2{
    public static void table(int num){
        for(int i = 1 ; i <=10 ; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}