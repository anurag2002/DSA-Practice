//Largest subarray with equal numbers of 0's and 1's
//Adobe Interview Question

import java.util.*;
public class largest_subarray_with_equal_0_and_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of subarray: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        for(int i = 0; i < n; i++)
        {
            if(arr.get(i) == 0)
            {
                arr.set(i, -1);
            }
        }

        int sum = 0, currSum = 0, end = -1, size=0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i<n; i++)
        {
            currSum += arr.get(i);
            if(currSum == 0)
            {
                size = i+1;
                end = i;
            }
            if(hash.containsKey(currSum - sum) && (i - hash.get(currSum-sum)) > size)
            {
                size = i - hash.get(currSum-sum);
                end = i;
            }
            else
            {
                hash.put(currSum, i);
            }            
        }

        for(int i = 0; i < n; i++)
        {
            if(arr.get(i) == -1)
            {
                arr.set(i, 0);
            }
        }

        if(end == -1)
        {
            System.out.println("No subarray found");
        }
        else
        {
            System.out.println("Largest Subarray is: " + arr.subList((end-size+1), (end+1)));
        }

        sc.close();
    }
}
