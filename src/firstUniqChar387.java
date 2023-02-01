public class firstUniqChar387 {
    public static void main(String[] args) {
      String  s = "leetcode";
      int len =s.length();
        for (int i = 0; i <len ; i++) {
            for (int j = i+1; j <len ; j++) {
                if (s.charAt(i)!=s.charAt(j)){
                    System.out.println(i);
                }

            }
        }
    }
}
