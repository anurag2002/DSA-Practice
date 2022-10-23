import java.util.*;
public class priority_queue 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        System.out.print("Enter the elements in the Min Heap: ");
        for(int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            minHeap.add(a);
            maxHeap.add(a);
        }

        System.out.println("Min Heap of size "+ minHeap.size() + " is: ");
        while(!minHeap.isEmpty())
        {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
        System.out.println("Max Heap of size "+ maxHeap.size() + " is: ");
        while(!maxHeap.isEmpty())
        {
            System.out.print(maxHeap.poll() + " ");
        }

        sc.close();
    }
}
