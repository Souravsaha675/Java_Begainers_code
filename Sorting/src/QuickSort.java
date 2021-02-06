import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter:-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr[i] = sc.nextInt();
        }
        ;

        System.out.println("Unsorted array is :-");
        printArray(arr);

        QuickSort ob = new QuickSort();
        ob.quickSort(arr, 0, arr.length - 1);

        System.out.println("sorted array is :-");
        printArray(arr);

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int lb, int up) {
        if (lb < up) {
            int mid = partition(arr, lb, up);
            quickSort(arr, lb, mid - 1);
            quickSort(arr, mid + 1, up);
        }
    }

    public static int partition(int arr[], int lb, int up) {
        int pivot = arr[lb];
        int start = lb;
        int end = up;
        while (start < end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;

        return end;
    }
}
