package java_class;

public class Zagged {
    public static void main(String[] args) {
        int arr [][]=new int[4][];
        System.out.println(arr);
        System.out.println(arr[0]);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=new int[i+3];
        }
        System.out.println(arr[0].length);

    }
}
