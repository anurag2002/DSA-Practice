//Time Complexity: O(N^2)
//Space Complexity: O(1)

import java.util.*;
public class selection_sort 
{
    //Selection Sort Function
    static void selection(List<Integer> arr, int n)
    {
        int temp, key, min;
        for(int i = 0; i < n-1; i++)
        {
            key = i;
            min = arr.get(key);
            for(int j = i+1; j < n; j++)
            {
                if(arr.get(j) < min)
                {
                    min = arr.get(j);
                    key = j;
                }
            }
            temp = arr.get(i);
            arr.set(i, min);
            arr.set(key, temp);
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

        System.out.println("Unsorted Array: \n" + arr);

        selection(arr, n);

        System.out.println("Sorted Array: \n" + arr);

        sc.close();
    }
}
