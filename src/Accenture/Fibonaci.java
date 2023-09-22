package Accenture;

import java.util.Arrays;

public class Fibonaci {
    public static void main(String[] args) {
        int n=4;
        int arr[]=new int[n];
        arr[0]=1;
        arr[1]=1;

        for (int i = 2; i <4 ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
