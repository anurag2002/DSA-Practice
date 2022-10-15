import java.util.*;
public class count_distinct_element2 
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

        Set<Integer> hash = new HashSet<>();
        for(int ele: arr)
        {
            hash.add(ele);
        }
        System.out.println("No of distinct elements in the array is: " + hash.size());

        sc.close();
    }
}
