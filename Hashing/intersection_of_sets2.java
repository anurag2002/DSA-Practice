import java.util.*;
public class intersection_of_sets2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the no of elements in array 2: ");
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
        for(int ele1: arr1)
        {
            for(int ele2: arr2)
            {
                if(ele1 == ele2)
                {
                    hash.add(ele1);
                    break;
                }
            }
        }

        System.out.println("Intersection of two array: " + hash);
        System.out.println("Size of Intersection Array: " + hash.size());

        sc.close();
    }
}
