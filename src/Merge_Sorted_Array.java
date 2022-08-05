public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={2,3,4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < b.length ; j++) {
                System.out.println(a[i]+b[j]);
            }
        }
    }
}
