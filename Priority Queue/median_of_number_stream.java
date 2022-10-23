//Find the median of an input stream.
//In this we have to find the median of the given input stream. As the inputs are given, we have to calculate the median
//For this we have used two Priority Queues, namely: minHeap and maxHeap
//The elements which are bigger than the largest of the maxHeap are sent to the minHeap and smaller to maxHeap.
//If there is a size mismatch then we balance both the heaps. The maxHeap can have 1 extra element.
//Time Complexity: O(logN)
//Space Complexity: O(N)

import java.util.*;
public class median_of_number_stream 
{
    //Function to Insert the element into the heaps.
    static void insert(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap, int num)
    {
        //insert in maxHeap if the maxHeap is empty or largest element in maxHeap is less than the number.
        if(maxHeap.isEmpty() || maxHeap.peek() >= num)
        {
            maxHeap.add(num);
        }
        //insert in minHeap if the smallest element in minHeap is less than the number.
        else
        {
            minHeap.add(num);
        }
    }

    //Function to check the size/number of elements in each heap
    static void sizeCheck(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap)
    {
        //If the number of elements in maxHeap is greater than the number of elements in minHeap+1, shift largest element of maxHeap to minHeap
        if(maxHeap.size() > minHeap.size()+1)
        {
            minHeap.add(maxHeap.poll());
        }
        //If the number of elements in minHeap is greater than the number of elements in maxHeap, shift smallest element of minHeap to maxHeap
        else if(minHeap.size() > maxHeap.size())
        {
            maxHeap.add(minHeap.poll());
        }
    }

    //Function to calculate the median
    static double median(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap)
    {
        //If both heap have same number of elements, return the average of the largest element of maxHeap and smallest element of minHeap
        if(maxHeap.size() == minHeap.size())
        {
            return (double)(maxHeap.peek()+minHeap.peek())/2;
        }
        //If maxHeap has more elements than minHeap, return the largest element of maxHeap
        else
        {
            return maxHeap.peek();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        //Declare the two heaps: minHeap and maxHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the element: ");
            int num = sc.nextInt();

            insert(minHeap, maxHeap, num);
            sizeCheck(minHeap, maxHeap);
            if(i > 0)
            {
                System.out.println("The median is: " + median(minHeap, maxHeap));
            }
        }

        sc.close();
    }
}
