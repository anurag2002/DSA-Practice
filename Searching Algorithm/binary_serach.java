//Time Complexity: O(logN)
//Space Complexity: O(1)
//Iterative Method

import java.util.*;
public class binary_serach 
{
    static int binary(List<Integer> arr, int key)
    {
        int low = 0, high = arr.size()-1, mid;
        
        while(low <= high)
        {
            mid = (low+high)/2;
            if(arr.get(mid) == key)
            {
                return mid;
            }
            else if(arr.get(mid) < key)
            {
                low = mid+1;
            }
            else if(arr.get(mid) > key)
            {
                high = mid-1;
            }
            System.out.println(low + " " + high + " " + mid);
        }
        return -1;
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

        int ind = binary(arr, key);

        if(ind == -1)
        {
            System.out.println(key + " is not in the list");
        }
        else
        {
            System.out.println(key + " is present in the list at index " + ind);
        }

        sc.close();
    }
}
