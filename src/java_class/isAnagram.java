package java_class;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        int []freq=new int[26];
//        int []freq2=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            freq[c-'a']=freq[c-'a']+1;
        }
        System.out.println(Arrays.toString(freq));
        for (int i = 0; i <t.length() ; i++) {
            char c=s.charAt(i);
            freq[c-'a']=freq[c-'a']-1;
        }

        boolean flag=false;
        for (int i = 0; i <freq.length ; i++) {
            if (freq[i]!=0){
                flag=true;
                break;
            }
        }
        if (flag=false){
            System.out.println(" not");
        }
        else {
            System.out.println(" yes");
        }
    }
}
