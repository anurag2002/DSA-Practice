// Count number of distinct elements in the window of size k
//Microsoft Question

import java.util.*;
public class count_distinct_element_in_window 
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

        System.out.print("Enter the size of window: ");
        int k = sc.nextInt();

        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // HashSet<Integer> hash = new HashSet<>();

        for(int i = 0; i < k; i++)
        {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0)+1);
        }
        res.add(map.size());
        for(int i = k; i < n; i++)
        {
            if(map.get(arr.get(i-k)) == 1)
            {
                map.remove(arr.get(i-k));
            }
            else
            {
                map.put(arr.get(i-k), (map.get(arr.get(i-k))-1));
            }
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0)+1);
            res.add(map.size());
        }

        System.out.println("No of distinct elements in each window of size " + k + " is: " + res);

        sc.close();
    }
}
