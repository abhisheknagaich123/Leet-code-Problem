public class Leetcode_1_Two_sum {

    public static void main(String[] args) {
        int arr1[]={2,7,11,15};
        int target=9;
        for (int i = 0; i < arr1.length ; i++) {

            if (arr1[i]+arr1[i+1]==target){
                System.out.println(i+" "+i+1);
                break;
            }
        }
    }
}
