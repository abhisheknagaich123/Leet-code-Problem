package java_class;

import javax.xml.namespace.QName;

public class RailwayBusStation {
    public static void main(String[] args) {
//        int arr[] = { 100, 300, 500 };
//        int dep[] = { 900, 400, 600 };
//        int n = 3;

        String name="abcd";
        int arr[]=new int[name.length()];
        String rev="";
        String nam="";

        for (int i = name.length()-1; i >=0; i--) {
                rev=rev + name.charAt(i);
        }
        for (int i = 1; i <name.length() ; i++) {
            nam=nam+name.charAt(i);

        }
        System.out.println(rev+nam);
    }
}
