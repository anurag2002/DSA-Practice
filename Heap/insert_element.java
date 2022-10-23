import java.util.*;
public class insert_element 
{
    static void insert(List<Integer> arr, int k)
    {
        arr.add(k);
        int node = arr.size()-1;
        int parent = node/2;
        int temp;
        while(parent > 0)
        {
            if(arr.get(parent) < arr.get(node))
            {
                temp = arr.get(node);
                arr.set(node, arr.get(parent));
                arr.set(parent, temp);
                node = parent;
                parent = node/2;
            }
            else
            {
                break;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        
        System.out.print("Enter the elements in the array: ");
        arr.add(-1);
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.println("Heap before insertion: " + arr.subList(1, n+1));
        
        System.out.print("Enter the element to be inserted: ");
        int k = sc.nextInt();
        insert(arr, k);

        System.out.println("Heap after insertion: " + arr.subList(1, n+2));

        sc.close();
    }
}
