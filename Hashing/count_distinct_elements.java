//Time Complexity: O(N^2)
//Space Complexity: O(1)

import java.util.*;
public class count_distinct_elements 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        int res = 0;
        for(int i = 0; i < n; i++)
        {
            res++;
            for(int j = (i-1); j >= 0; j--)
            {
                if(arr.get(i) == arr.get(j))
                {
                    res--;
                    break;
                }
            }
        }

        System.out.println("Total no of distinct elements in the array are: " + res);

        sc.close();
    }
}
