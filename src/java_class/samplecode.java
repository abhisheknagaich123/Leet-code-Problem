package java_class;

import java.util.Scanner;

public class samplecode {
    public static int bs(int arr[],int Target){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==Target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(  bs(arr,target));
    }
}
