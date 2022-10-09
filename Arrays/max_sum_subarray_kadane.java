//Kadane's Algorithm
//Time Complexity: O(N)

import java.util.*;
public class max_sum_subarray_kadane 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the values in array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        sc.close();

        int max = -10000, sum = 0, start = 0, end = 0, i = 0;

        while(i < n)
        {
            sum = 0;
            for(int j = i; j < n; j++)
            {
                sum = sum+arr.get(j);

                if(sum < 0)
                {
                    i = j;
                    break;
                }
                if(sum > max)
                {
                    max = sum;
                    start = i;
                    end = j;
                }
            }
            i++;
        }

        System.out.print("Maximum sum subarray is: ");
        for(i = start; i <= end; i++)
        {
            System.out.print(arr.get(i) + " ");
        }
    }
}
