//Time Complexity = O(N) and Space Complexity = O(N)

import java.util.*;
import java.util.Map.Entry;
public class max_repeating_hashmap 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        for(int i = 0; i < n; i++)
        {
            if(hash.containsKey(arr.get(i)))
            {
                hash.put(arr.get(i), hash.get(arr.get(i))+1);
            }
            else
            {
                hash.put(arr.get(i), 1);
            }
        }

        int max = Collections.max(hash.values());

        for(Entry<Integer, Integer> entry : hash.entrySet())
        {
            if(entry.getValue() == max)
            {
                System.out.println("The max repeating element is: " + entry.getKey() + " with frequency: " + max);
                break;
            }
        }
        
        sc.close();
    }
}
