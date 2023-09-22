package Accenture;
import  java.util.*;
public class Anagrma {
    public static void main(String[] args) {
        String str1="ram";
        String str2="mar";

//        int n=123;
//        String str23=Integer.toString(n);
        char chararra[]=str1.toCharArray();
        Arrays.sort(chararra);

        char chararra2[]=str2.toCharArray();
        Arrays.sort(chararra2);
        System.out.println(chararra2);
        System.out.println(chararra);
        Arrays.toString(chararra);
        Arrays.toString(chararra2);

        if (Arrays.equals(chararra,chararra2)){
            System.out.println("y");
        }
        else {
            System.out.println("-1");
        }


    }
}
