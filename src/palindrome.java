public class palindrome {
    public static void main(String[] args) {
        int x=123;
        String s=String.valueOf(x);
        System.out.println(s);
        int left=0;
        int right=s.length()-1;
        while (left<=right);
        if (s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        else
            return false;
    }

}
