package REPO.DSA.JAVA.Lec_12_Method;

public class Table5DifferentClass {
    public static void main(String[] args) {
        t1 hlo = new t1();
        hlo.table(18);
    }
}

class t1{
    public void table(int num){
        for(int i = 1 ; i <=10 ; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
