//Find the median of an input stream.
//In this we have to find the median of the given input stream. As the inputs are given, we have to calculate the median
//For this we first find the mid index. Then we copy the heap to a list till the mid index.
//If the size of heap is even then we find the average of the last two elements of the list.
//If the size of heap is odd then we return the last element of the list.

import java.util.*;
public class median_of_running_stream 
{
    //Function to calculate the median
    static double median(PriorityQueue<Integer> pq, int mid)
    {
        List<Integer> l = new ArrayList<>();
        int len = pq.size();
        
        //Shift the elements from heap to list till the mid index
        for(int i = 0; i <= mid; i++)
        {
            l.add(pq.poll());
        }
        //Add all the elements back to the heap
        pq.addAll(l);

        //If there are even number of elements, return the average of elements at mid index and mid-1 index or last two elements of the list
        if((len&1) == 0)
        {
            return (double)(l.get(mid-1)+l.get(mid))/2.0;
        }
        //If there are odd number of elements, return the element at mid index or last element of the list
        else
        {
            return l.get(mid);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(pq.size() < n)
        {
            System.out.print("Enter the element: ");
            pq.add(sc.nextInt());
            if(pq.size() > 1)
            {
                int mid = pq.size()>>1;
                System.out.println("The median is: " + median(pq,mid));
            }
        }

        sc.close();
    }
}
