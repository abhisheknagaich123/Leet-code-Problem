public class Bubble_short {
    public static void main(String[] args) {
        int arr[] = {55, 66, 97, 12, 52, 03};
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }


        }
        for (int i = 0; i < n-1; i++) {
            System.out.println(arr[i]);
        }
    }}