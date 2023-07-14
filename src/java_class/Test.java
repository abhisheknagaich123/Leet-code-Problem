package java_class;

import java.util.*;


public class Test {
//    public static void findPairs(int[] arr, int target) {
//        Arrays.sort(arr);
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                for (int k = j+1; k <arr.length ; k++) {
//                    if (arr[i]+arr[j]+arr[k]==target){
//                        System.out.println((arr[i]+", "+" "+arr[j]+"and"+arr[k]));
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        // Replace Them All
        // Arrays-Linear Search
        // gcd
        // Sort just Zeroes and Ones
        // Arrays-Max Value In Array  """""""75


//        Scanner scanner = new Scanner(System.in);
//       int N = scanner.nextInt();
        int arr[]={4,2,8,6,4};
////        int[] arr = new int[N];
////        for (int i = 0; i < N; i++) {
////            arr[i] = scanner.nextInt();
////        }
////        int target = scanner.nextInt();
////        findPairs(arr, target);
//        //Arrays.sort(arr);
//        String str=Integer.toString(N);
//        int len=str.length();
////        System.out.println(str.length());
//        System.out.println(Math.pow(len,4));
//
//        for (int i = 1; i <=str.length() ; i++) {
//            char num =str.charAt(i);
//            int a = num - '0';
//            System.out.println(a);
        //}
        int strat=0;
        int end=arr.length-1;
        while(strat<=end){
            int temp=arr[strat];
            arr[strat]=arr[end];
            arr[end]=temp;

        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] );
        }

    }
}

