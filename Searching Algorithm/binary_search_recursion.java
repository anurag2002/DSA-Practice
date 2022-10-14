//Time Complexity: O(logN)
//Space Complexity: O(logN)
//Recursive Method

import java.util.*;
public class binary_search_recursion 
{
    static int binarySearch(List<Integer> arr, int low, int high, int key)
    {
        int mid = (low+high)/2;
        if(arr.get(mid) == key)
        {
            return mid;
        }
        else if(arr.get(mid) < key)
        {
            return binarySearch(arr, mid+1, high, key);
        }
        else
        {
            return binarySearch(arr, low, mid-1, key);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements in the list: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();

        Collections.sort(arr);

        int ind = binarySearch(arr, 0, n-1, key);
        if(ind == -1)
        {
            System.out.println(key + " is not present in the list.");
        }
        else
        {
            System.out.println(key + " is present in the list at index " + ind);
        }

        sc.close();
    }
}
