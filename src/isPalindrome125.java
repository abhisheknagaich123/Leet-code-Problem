import java.util.*;
public class isPalindrome125 {
    public static void main(String[] args) {
        String  s = "A man, a plan, a canal: Panama";
        int start=0;
        int end= s.length()-1;
        while (start<=end){
            if (!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            else
                if (Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                    System.out.println("false");
                    start++;
                    end--;
                }
        }
        System.out.println("true");
    }
}
