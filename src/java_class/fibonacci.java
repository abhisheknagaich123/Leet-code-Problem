package java_class;

import java.util.Scanner;

public class fibonacci {
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
//        for (int i = 0; i <= num; i++) {
//           fibonacci(i);
//        }
        System.out.println(fibonacci(num));

//        Scanner sc =new Scanner(System.in);
//        int num= sc.nextInt();
//        int a=0;
//        int b=1;
//        int c=0;
//        for (int i = 1; i <num ; i++) {
//            c=a+b;
//            a=b;
//            b=c;
//        }
//      System.out.println(c);

    }
}
