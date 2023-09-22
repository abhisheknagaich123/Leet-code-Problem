package Alpha;

public class PalindromString {
    public static void main(String[] args) {
        String str="racecarr";
        int end=str.length()-1;
        int start=0;
        System.out.println(str.charAt(start));
        while (start<=end){
            if (str.charAt(start)!=str.charAt(end)){
                System.out.println("false");
            }
            else {
                System.out.println("true");
            }
            start++;
            end--;

        }
    }
}
