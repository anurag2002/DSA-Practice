//Sorting array using Heap Sort
// In this, we know that the root node of the heap is always the maximum, so we remove the root node from the heap and then add it to the 
//resultant list

import java.util.*;
public class heap_sort 
{
    //Swap Function
    static void swap(List<Integer> arr, int parent, int large)
    {
        int temp = arr.get(parent);
        arr.set(parent, arr.get(large));
        arr.set(large, temp);
    }

    //Make the function as Max Heap
    static void heapify(List<Integer> arr, int len, int i)
    {
        int parent = i, left = 2*parent, right = left+1;
        int large = parent;
        if(left <= len && arr.get(left) > arr.get(parent))
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
            heapify(arr, len, large);
        }
    }

    //Delete the root node of the Max Heap
    static void delete(List<Integer> arr)
    {
        int len = arr.size()-1;
        arr.set(1,arr.get(len));
        arr.remove(len);
        len--;
        for(int i = len/2; i > 0; i--)
        {
            heapify(arr, len, i);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        arr.add(-1);

        System.out.print("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        if(arr.size() == 1)
        {
            System.out.println("List is empty");
        }
        else
        {
            System.out.println("Unsorted List is: " + arr.subList(1, n+1));
            
            //Make the array as Max Heap
            for(int i = n/2; i > 0; i--)
            {
                heapify(arr,n,i);
            }

            //Sort the Max heap using Heap Sort by removing the root node and adding it to another list.
            while(arr.size() != 1)
            {
                res.add(arr.get(1));
                delete(arr);
            }
            System.out.println("Sorted List is: " + res);
        }

        sc.close();
    }
}
