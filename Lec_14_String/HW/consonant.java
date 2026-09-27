package REPO.DSA.JAVA.Lec_14_String.HW;

public class consonant {
    public static void main(String[] args) {
        String s1 = "A Man is A Man , So what to do abOut It";

        totalConsonant(s1);
    }
    public static void totalConsonant(String str){
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i = 0 ; i < ch.length ; i++){
            char chr = ch[i];
            if(Character.isLetter(chr) && chr != 'A' && chr != 'E' && chr != 'I' && chr != 'O' && chr != 'U' &&
                chr != 'a' && chr != 'e' && chr != 'i' && chr != 'o' && chr != 'u' &&
                chr != ' '
            ){
                count++;
            }else{
                continue;
            }
        }
        System.out.println("Total Consonant is : " + count);
    }
}
