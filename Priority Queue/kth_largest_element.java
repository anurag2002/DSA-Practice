//Find the kth largest element in the array
//Input: 20 10 60 30 50 40

import java.util.*;
public class kth_largest_element 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        for(int i = 0; i < k; i++)
        {
            pq.add(arr.get(i));
        }
        for(int i = k; i < n; i++)
        {
            if(pq.peek() < arr.get(i))
            {
                pq.poll();
                pq.add(arr.get(i));
            }
        }
        System.out.println("The " + k + "th largest element is: " + pq.poll());

        sc.close();
    }
}
