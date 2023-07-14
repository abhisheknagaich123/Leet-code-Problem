package java_class;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int product=1;
        for (int i = 0; i < arr.length ; i++) {
            product=product*arr[i];

        }

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=product/arr[i];
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
//        System.out.println(Arrays.toString(arr));
    }
}
