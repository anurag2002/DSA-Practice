import java.util.*;
public class rotated_array 
{
    static int binarySearch(List<Integer> arr, int low, int high, int key)
    {
        int mid;
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
        }
        return -1;
    }
    static int search(List<Integer> arr, int low, int high, int key)
    {
        int mid = (low+high)/2;
        if(low == high && arr.get(low) != key)
        {
            return -1;
        }
        if(arr.get(mid) == key)
        {
            return mid;
        }
        else if(arr.get(mid) >= arr.get(low) && arr.get(low) <= key)
        {
            return binarySearch(arr, low, mid-1, key);
        }
        else
        {
            return search(arr, mid+1, high, key);
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

        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();

        int ind = search(arr, 0, n-1, key);
        if(ind == -1)
        {
            System.out.println(key + " is not present in the list");
        }
        else
        {
            System.out.println(key + " is present in the list at index " + ind);
        }

        sc.close();
    }
}
