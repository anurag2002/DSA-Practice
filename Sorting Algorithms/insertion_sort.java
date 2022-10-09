// Time Complexity: O(N^2)
//Space Complexity: O(1)

import java.util.*;
public class insertion_sort 
{
    //Insertion Sort Function
    static void insertion(List<Integer> arr, int n)
    {
        int temp, j;
        for(int i = 1; i < n; i++)
        {
            j = i-1;
            temp = arr.get(i);
            while(j >= 0 && arr.get(j) > temp)
            {
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, temp);
            System.out.println(arr);
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

        insertion(arr, n);

        System.out.println("Sorted Array: \n" + arr);

        sc.close();
    }
}
