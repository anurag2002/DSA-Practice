import java.util.*;
public class max_repeating_sort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        int ind = 0, count = 1, freq = 0, i =0;

        while(i < n-1)
        {
            while(arr.get(i) == arr.get(i+1))
            {
                count++;
                i++;
            }
            if(count > freq)
            {
                freq = count;
                ind = arr.get(i);
            }
            count = 1;
            i++;
        }

        System.out.println("Most repeating element in the array: " + ind + " with frequency: " + freq);

        sc.close();
    }
}
