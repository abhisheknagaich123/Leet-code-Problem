package java_class;

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int num2= sc.nextInt();
        for (int i = 1; i <=num ; i++) {
            int temp=3*i+2;
            if (temp%num2!=0){
                System.out.println(temp);
            }
            else {
                num++;
            }
        }

    }
}
