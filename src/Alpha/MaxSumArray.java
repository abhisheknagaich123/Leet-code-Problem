package Alpha;

public class MaxSumArray {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for (int i = 0; i < arr.length ; i++) {

            for (int j = i; j < arr.length ; j++) {
                currentsum=0;
                for (int k = i; k <=j ; k++) {
                    currentsum+=arr[k];
                    System.out.print(arr[k]+" ");

                }
                System.out.print(" total sum of"+currentsum);
                if (currentsum>maxsum){
                    maxsum=currentsum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(maxsum);

    }
}
