public class Leetcode_1_Two_sum {

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]+arr[i+1]==target){
                System.out.println(i+" "+i+1);
                break;
            }
        }
    }
}
