//Time Complexity: O(N^2)

import java.util.*;
public class max_sum_subarray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        int max = -100000, sum = 0, start = 0, end = 0;

        for(int i = 0; i < n; i++)
        {
            sum = 0;
            for(int j = i; j < n; j++)
            {
                sum = sum + arr.get(j);
                
                if(sum > max)
                {
                    start = i;
                    end = j;
                    max = sum;
                }
                
            }
        }

        System.out.print("Max sum subarray: ");
        for(int i = start; i <= end; i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        
        sc.close();
    }
}
