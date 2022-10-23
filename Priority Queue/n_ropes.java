//Find the minimum cost with which we can connect n ropes, where cost = length of ropes
//Input1: 2 5 4 8 6 9
//Input2: 4 3 2 6
//Input3: 1 2 3
//Time Complexity: O(nlogn)

import java.util.*;
public class n_ropes 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of ropes: ");
        int num = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.print("Enter the length of each rope: ");
        for(int i = 0; i < num; i++)
        {
            pq.add(sc.nextInt());
        }

        int cost = 0, rope = 0, first = 0, second = 0;
        while(pq.size() != 1)
        {
            first = pq.poll();
            second = pq.poll();
            rope = first + second;
            pq.add(rope);
            cost += rope;
        }
        
        System.out.println("The minumum cost to connect " + num + " ropes is: " + cost);

        sc.close();
    }
}
