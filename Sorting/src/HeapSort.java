import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter:-");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i]=sc.nextInt();
        };

        System.out.println("Unsorted array is :-");
        printArray(arr);

        HeapSort ob= new HeapSort();
        ob.sort(arr,n);

        System.out.println("sorted array is :-");
        printArray(arr);

    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public void heapify(int arr[],int n,int i){
        int leargest=i;
        int left=2*i+1;
        int right=2*i+2;

        if (left<n && arr[left]>arr[leargest]){
            leargest=left;
        }
        if (right<n && arr[right]>arr[leargest]){
            leargest=right;
        }

        if(leargest!=i){
            int temp=arr[i];
            arr[i]=arr[leargest];
            arr[leargest]=temp;

            heapify(arr,n,leargest);
        }

    }

    public void sort(int arr[],int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }

}
