public class Quick_sort {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int p, int q)
    {
        int pivot = arr[q];
        int i = (p - 1);

        for(int j = p; j <= q - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, q);
        return (i + 1);
    }
    static void quickSort(int[] arr, int p, int q)
    {
       
        if (p < q)
        {
            int pi = partition(arr, p, q);
            quickSort(arr, p, pi - 1);
            quickSort(arr, pi + 1, q);
        }
    }
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
