package REPO.DSA.JAVA.Lec_12_Method;

public class methodTable5Normal {
    public void table(int num , int till){
        for(int i = 1 ; i <= till ; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
    public static void main(String[] args) {
        methodTable5Normal op = new methodTable5Normal();
        op.table(5 , 20);
    }
    
}

// increase readability
//  reuse of code
// reduce bulkiness


// if method is normal then we have to create object first to use 


// Method signature            public void table(int num , int till)