import java.util.Arrays;
import java.util.Random;

public class BubbleSort
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rand.nextInt(1000);
        }

        System.out.println("Before Sorting :"+ Arrays.toString(arr));


        bubble_Sort(arr);

        System.out.println("After Sorting :"+ Arrays.toString(arr));



    }
    public static void bubble_Sort(int[] arr)
    {
        boolean isswapped=true;
        while(isswapped)
        {
            isswapped=false;
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i] > arr[i+1]){
                swap(arr,i,i+1);
                isswapped=true;
                }

            }
        }
    }
    public static void swap(int[] arr, int i , int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}