import java.util.*;
public class union_of_sets2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the size of array 2: ");
        int n2 = sc.nextInt();
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        System.out.print("Enter the elements in array 1: ");
        for(int i = 0; i < n1; i++)
        {
            arr1.add(sc.nextInt());
        }
        System.out.print("Enter the elements in array 2: ");
        for(int i = 0; i < n2; i++)
        {
            arr2.add(sc.nextInt());
        }

        Set<Integer> hash = new HashSet<>();
        for(int ele: arr1)
        {
            hash.add(ele);
        }
        for(int ele: arr2)
        {
            hash.add(ele);
        }

        System.out.println("Union Array: " + hash);
        System.out.println("Size of union array: " + hash.size());

        sc.close();
    }
}
