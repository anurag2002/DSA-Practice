//Time Complexity: O(NlogN){Average}, O(N^2){Worst Case}
//Space Complexity: O(logN)
//To change the worst case to best case use:
//      i. pivot = (low+high)/2
//     ii. pivot = random(low, high)

import java.util.*;
public class quick_sort 
{
    //Swap the elements
    static void swap(List<Integer> arr, int i, int j)
    {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    //Create Partition for finding the pivot and dividing the array into two part
    static int partition(List<Integer> arr, int low, int high)
    {
        int pivot = low;
        while(low < high)
        {
            //Check if the element on left is less than pivot or not
            while(arr.get(low) <= arr.get(pivot))
            {
                low++;
            }

            //Check if element on right is greater than pivot or not
            while(arr.get(high) > arr.get(pivot))
            {
                high--;
            }
            if(low < high)
            {
                swap(arr, low, high);
            }
        }
        swap(arr, pivot, high);
        return high;
    }

    //Quick Sort Function
    static void quick(List<Integer> arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr, low, high);
            quick(arr, low, pivot-1);
            quick(arr, pivot+1, high);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.println("Unsorted Array: \n" + arr);

        quick(arr, 0, n-1);

        System.out.println("Sorted Array: \n" + arr);

        sc.close();
    }
}
