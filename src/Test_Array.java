import java.util.Scanner;

public class Test_Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int size=sc.nextInt();
//        int arr []= new int[size];
//        for (int i = 0; i < size ; i++) {
//            arr[i]= sc.nextInt();
//        }
        int arr[]={5,4,3,8,4,5,7,8};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int temp;
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for (int data:arr
             ) {
            System.out.print(data + " <----> ");

        }

    }
}
