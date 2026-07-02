package REPO.DSA.JAVA.Lec_12;

public class methodTable5Normal {
    public void table(int num){
        for(int i = 1 ; i <=10 ; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
    public static void main(String[] args) {
        methodTable5Normal op = new methodTable5Normal();
        op.table(5);
    }
    
}
