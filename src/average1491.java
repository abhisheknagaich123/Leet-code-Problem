public class average1491 {
    public static void main(String[] args) {
         String s = "   fly me   to   the moon  ";
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)!= ' '){
                System.out.println(s.charAt(i));
            }
        }
    }
}
