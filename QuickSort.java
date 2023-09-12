import java.util.*;
public class QuickSort {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] arr = new int[10000000];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rand.nextInt(1000);
        }

        //System.out.println("Before Sorting :"+ Arrays.toString(arr));

        int start_time=(int) System.currentTimeMillis();
        quick_Sort(arr, 0, arr.length-1);
        int end_time=(int) System.currentTimeMillis();

        //System.out.println("After Sorting :"+ Arrays.toString(arr));

        System.out.println("Total Time Taken : "+ (end_time - start_time));
    }
    public static void quick_Sort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivotIndx= partition( arr, low , high);

            quick_Sort(arr, low, pivotIndx-1);
            quick_Sort(arr, pivotIndx + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int pivotIndx=high;

        while(low < high)
        {
            while(arr[low] <=pivot && low < high) low++;
            while(arr[high] >=pivot && low < high) high--;
            swap(arr,low,high);
        }
        swap(arr,low,pivotIndx);
        return low;
    }
    public static void swap(int[] arr, int a , int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
}
