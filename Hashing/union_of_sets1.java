import java.util.*;
public class union_of_sets1 
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

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n1; i++)
        {
            int flag = 1;
            for(int j = arr.size()-1; j >= 0; j--)
            {
                if(arr.get(j) == arr1.get(i))
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                arr.add(arr1.get(i));
            }
        }
        for(int i = 0; i < n2; i++)
        {
            int flag = 1;
            for(int j = arr.size()-1; j >= 0; j--)
            {
                if(arr.get(j) == arr2.get(i))
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                arr.add(arr2.get(i));
            }
        }

        System.out.println("Union of two sets: " + arr);
        System.out.println("Size of union set: " + arr.size());

        sc.close();
    }
}
