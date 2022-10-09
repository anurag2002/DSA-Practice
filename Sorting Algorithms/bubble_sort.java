//Time Complexity: O(N^2)
//Space Complexity: O(1)

import java.util.*;
public class bubble_sort 
{
    // Bubble Sort Function
    static void bubble(List<Integer> arr, int n)
    {
        int temp;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-1-i; j++)
            {
                if(arr.get(j) > arr.get(j+1))
                {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements in array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.println("Unsorted Array: \n" + arr);

        bubble(arr,n);

        System.out.println("Sorted Array: \n" + arr);

        sc.close();
    }
}
