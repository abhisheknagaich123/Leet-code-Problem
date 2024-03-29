package java_class;

public class Subarray {
    public static int solotion(int arr[],int target){
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        for (int endpoint =0,startpoint= 0; endpoint <arr.length ; endpoint++) {
            sum=sum+arr[endpoint];
            while (sum>=target){
                int len=endpoint-startpoint+1;
                if (len<minlen){
                    minlen=len;
                }
                sum=sum-arr[startpoint];
                startpoint++;
            }

        }
        return minlen==Integer.MAX_VALUE?0:minlen;

    }
    public static void main(String[] args) {
        int []nums = {2,3,1,2,4,3};
//        int target=7;
        System.out.println(solotion(nums,7));

    }
}
