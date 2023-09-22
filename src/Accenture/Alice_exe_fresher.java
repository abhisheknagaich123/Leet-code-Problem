package Accenture;

import java.util.Scanner;

public class Alice_exe_fresher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exp= sc.nextInt();
        int fre=sc.nextInt();
        int ans=(exp+fre)/4;
        if (ans<=Integer.min(exp,fre)){
            System.out.println(ans);
        }
       else {
            System.out.println(Math.min(exp, fre));
        }
    }
}
