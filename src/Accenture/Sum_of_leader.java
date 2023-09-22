package Accenture;

public class Sum_of_leader {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        int sum=20;
        for (int i = 0; i < arr.length; i++) {
int j;
            for ( j = i+1; j < arr.length ; j++) {
                if (arr[i]< arr[j]){
                  break;
                }
            }
            if (j== arr.length){
                sum+=arr[i];
            }
        }
        System.out.println(Math.sqrt(sum));
        System.out.println(sum);
    }
}
