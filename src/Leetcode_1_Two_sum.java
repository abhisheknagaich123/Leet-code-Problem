public class Leetcode_1_Two_sum {

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    System.out.println("["+i +"," +j+"]");
                    break;
                }
            }
        }
    }
}
