////package java_class;
////
////public class Sort_just_Zeroes_and_Ones {
////    public static void main(String[] args) {
////        int arr[]={1 ,0 ,0 ,1, 1, 0, 1};
////        int count=0;
////        for (int i = 0; i < arr.length ; i++) {
////            if (arr[i]==1){
////                 arr[i]=1;
////                count++;
////
////            }
////        }
////        System.out.println(count);
////    }
////}
//import java.util.Arrays;
//
//public class AnagramChecker {
//    public static boolean isAnagram(String s, String t) {
//        // Convert the strings to character arrays
//        char[] sArray = s.toCharArray();
//        char[] tArray = t.toCharArray();
//
//        // Sort the character arrays
//        Arrays.sort(sArray);
//        Arrays.sort(tArray);
//
//        // Compare the sorted arrays
//        return Arrays.equals(sArray, tArray);
//    }
//
//    public static void main(String[] args) {
//        String s = "listen";
//        String t = "silent";
//
//        boolean isAnagram = isAnagram(s, t);
//        System.out.println("Are the strings anagrams? " + isAnagram);
//    }
//}


//frequence  arrary; arr[ch='a']