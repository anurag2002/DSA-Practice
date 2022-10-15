//SubArray with sum equal given sum

import java.util.*;
public class subarray_of_given_sum 
{
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

        System.out.print("Enter the sum of which sub array is to be found: ");
        int sum = sc.nextInt();
        int start =0, end = -1, currSum=0;

        Map<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            currSum += arr.get(i);
            if((currSum - sum) == 0)
            {
                start = 0;
                end = i;
                break;
            }
            if(hash.containsKey(currSum-sum))
            {
                start = hash.get(currSum-sum)+1;
                end = i;
                break;
            }
            hash.put(currSum, i);
        }

        if(end == -1)
        {
            System.out.println("No subarray found");
        }
        else
        {
            System.out.println(arr.subList(start, (end+1)));
        }

        sc.close();
    }
}
