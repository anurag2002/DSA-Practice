import java.util.*;
public class heapify 
{
    static void swap(List<Integer> arr, int parent, int large)
    {
        int temp = arr.get(parent);
        arr.set(parent, arr.get(large));
        arr.set(large, temp);
    }
    static void heapifyFunc(List<Integer> arr, int len, int i)
    {
        int parent, left, right;
        parent = i;
        left = 2*parent;
        right = left+1;
        int large=parent;
        if(left<=len && arr.get(left) > arr.get(large))
        {
            large = left;
        }
        if(right <= len && arr.get(right) > arr.get(large))
        {
            large = right;
        }
        if(large != parent)
        {
            swap(arr, parent, large);
            heapifyFunc(arr, len, large);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of heap: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        arr.add(-1);

        System.out.print("Enter the elements in the heap: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        for(int i = n/2; i > 0; i--)
        {
            heapifyFunc(arr,n,i);
        }
        arr.remove(0);
        System.out.println("Heap after Heapify: " + arr);

        sc.close();
    }
}
