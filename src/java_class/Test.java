package java_class;

import java.util.*;


public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary=111;
        int pow=0;
        int sum=0;
        while (binary!=0){
            int rem=binary%10;
            sum=sum+ (rem*(int)Math.pow(2,pow));
            pow++;
            binary=binary/10;
        }
        System.out.println(sum);
    }
}

