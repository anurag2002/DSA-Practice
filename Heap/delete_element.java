import java.util.*;
public class delete_element 
{
    static void delete(List<Integer> arr)
    {
        int len = arr.size()-1;
        int temp = arr.get(len);
        arr.set(1, temp);
        arr.remove(len);
        len--;
        int parent = 1;
        int left_child = 2*parent;
        int right_child = 2*parent+1;
        while(left_child <= len && right_child <= len)
        {
            int larger = (arr.get(left_child) > arr.get(right_child))?left_child:right_child;
            if(arr.get(larger) > arr.get(parent))
            {
                temp = arr.get(parent);
                arr.set(parent, arr.get(larger));
                arr.set(larger, temp);
                parent = larger;
                left_child = 2*parent;
                right_child = left_child+1;
            }
        }
        if(left_child <= len && arr.get(left_child) > arr.get(parent))
        {
            temp = arr.get(parent);
            arr.set(parent, arr.get(left_child));
            arr.set(left_child, temp);
            parent = left_child;
            left_child = 2*parent;
            right_child = left_child+1;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no elements in the heap: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        arr.add(-1);
        System.out.print("Enter the elements in the heap: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.println("Heap before deletion: " + arr.subList(1, n+1));
        delete(arr);
        // System.out.println(arr.get(n+1));
        System.out.println("Heap after deletion: " + arr.subList(1, n));

        sc.close();
    }
}
