import java.util.*;
public class infinite_search 
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

    static int search(List<Integer> arr, int key)
    {
        int low = 0, high = 1;
        while(arr.get(high) < key)
        {
            low = high;
            high = high * 2;
        }
        return binarySearch(arr, low, high, key);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 200; i++)
        {
            arr.add(i);
        }

        int ind = search(arr, key);

        Collections.sort(arr);

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
