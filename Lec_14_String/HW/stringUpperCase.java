package REPO.DSA.JAVA.Lec_14_String.HW;

public class stringUpperCase {
    public static void main(String[] args) {
        String s1 = "a Man iS a man";
        String s2 = stringToUppercase(s1);
        System.out.println(s2);

        

    }
    public static String stringToUppercase(String str){
        String UpperCase = "";
        char[] ch = str.toCharArray();
        char chara;
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] >= 'a' && ch[i]<= 'z'){
                chara = (char)(ch[i] - 32); 
            }else{
                chara = ch[i];
            }
            UpperCase = UpperCase + chara ;
        }
        return UpperCase;
    }
}
