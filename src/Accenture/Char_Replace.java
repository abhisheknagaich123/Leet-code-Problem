package Accenture;

public class Char_Replace {
    public static void main(String[] args) {
        String str="apple";
        char chr1='a';
        char chr2='p';
        String ans="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==chr1){
                ans+=chr2;
            }
            else if (str.charAt(i)==chr2){
                ans+=chr1;
            }
           else {
                ans= ans+str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
