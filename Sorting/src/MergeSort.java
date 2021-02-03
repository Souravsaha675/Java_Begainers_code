import java.util.Scanner;

public class MergeSort {
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

        MergeSort ob= new MergeSort();
        ob.mergeSort(arr,0,arr.length-1);

        System.out.println("sorted array is :-");
        printArray(arr);

    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public void mergeSort(int arr[],int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }

    public void merge(int arr[],int lb,int mid,int ub){
        int n1=(mid-lb)+1;
        int n2=ub-mid;

        int l1[]=new int[n1];
        int r1[]=new int[n2];

        for(int i =0;i<n1;i++){
            l1[i]=arr[lb+i];
        }
        for (int i=0;i<n2;i++){
            r1[i]=arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=lb;

        while (i<n1 && j<n2){
            if(l1[i]<=r1[j]){
                arr[k]=l1[i];
                i++;
            }else {
                arr[k]=r1[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k]=l1[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k]=r1[j];
            j++;
            k++;
        }
    }
}
