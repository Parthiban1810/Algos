import java.util.*;
public class BinarySearch {
    public static void main(String[] args)
    {
        Random rand = new Random();

        int arr[] = new int[10];

        for(int i=0;i<arr.length;i++) arr[i]=rand.nextInt(10000);

        Arrays.sort(arr);
        System.out.println("Arrays : "+ Arrays.toString(arr));

        int index=binary_search(arr, 0, arr.length -1, 9);

        System.out.print(index);

        // Using In build Method

        System.out.println(Arrays.binarySearch(arr, 0, arr.length-1, 9 ));

    }
    public static int binary_search(int[] arr, int low, int high , int value)
    {
        while(low <=high)
        {
            int middle = (low +(high - low)/2);
            if(arr[middle]==  value ) return middle;
            else if (arr[middle] < value ) low = middle +1;
            else high = middle -1;
        }
        return -1;
    }
}
