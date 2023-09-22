package Accenture;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=5;
        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==k){
                System.out.println(mid);
                break;
            }
            else if (arr[mid]<k){          //48 49 (50) 51
                  left=mid+1;
            }
            else {
              right=mid-1;
            }
            mid=(left+right)/2;
            if (left>right){
                System.out.println("-1");
            }

        }
    }
}
