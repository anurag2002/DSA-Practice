//Time Complexity: O(NlogN)     
// Space Complexity: O(N)

import java.util.*;
public class merge_sort 
{
    //Merge and Sort the subarrays
    static void merge(List<Integer> arr, int low, int mid, int high)
    {
        List<Integer> b = new ArrayList<>();
        int i = low, j = mid+1;
        while(i <= mid && j <= high)
        {
            if(arr.get(i) < arr.get(j))
            {
                b.add(arr.get(i));
                i++;
            }
            else
            {
                b.add(arr.get(j));
                j++;
            }
        }

        //Merge Remaining Elements
        while(i <= mid)
        {
            b.add(arr.get(i));
            i++;
        }
        while(j <= high)
        {
            b.add(arr.get(j));
            j++;
        }

        //Update the elements in the list
        i = low;
        j = 0;
        while(j < b.size())
        {
            arr.set(low, b.get(j));
            low++;
            j++;
        }
        b.clear();
    }

    //Merge Sort function to divide the array into sub array
    static void mergeSort(List<Integer> arr, int low, int high)
    {
        if(low < high)
        {
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr,low, mid, high);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.println("Unsorted Array: " + arr + "\n");

        mergeSort(arr, 0, n-1);

        System.out.println("Sorted Array: \t" + arr);

        sc.close();
    }
}
