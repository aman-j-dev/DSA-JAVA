package REPO.DSA.JAVA.Lec_14_String.HW;

public class removeWhitspace {
    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over a lazy dog";
        System.out.println(Remove_Whitespace(s1));
    }
    public static String Remove_Whitespace(String str){
        char[] ch = str.toCharArray();
        String Without_Whitespace = "";
        for(int i = 0 ; i < ch.length ; i++){
            if(ch[i] == ' '){
                continue;
            }else{
                Without_Whitespace = Without_Whitespace + ch[i];
            }
        }
        return Without_Whitespace;
    }
}
