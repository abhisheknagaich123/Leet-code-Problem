package Accenture;

public class Difference_of_sum {
    public static void main(String[] args) {
        int m=6;
        int n=30;
        int sum=0;
        int notdividesum=0;
        for (int i = 1; i <=30 ; i++) {
            if(i%m==0){
                sum+=i;
            }
            else {
                notdividesum+=i;
            }
        }
        System.out.println(sum);
        System.out.println(notdividesum);
        System.out.println(notdividesum-sum);
    }
}
