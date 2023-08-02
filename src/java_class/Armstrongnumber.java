package java_class;

public class Armstrongnumber {
    public static boolean armstrong(int n){
      int orgnum=n;
    String sc=Integer.toString(orgnum);
    int digit=sc.length();
    int sum=0;
    while (orgnum!=0){
        int lastn=orgnum%10;
        sum=sum+(int)Math.pow(lastn,digit);
        orgnum=orgnum/10;
    }
    return n==sum;
    }
public static void main(String[] args) {

    System.out.println(armstrong(371));
}
}
