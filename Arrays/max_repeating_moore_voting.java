//Time Complexity: O(N) Space Complexity: O(1)

import java.util.*;
public class max_repeating_moore_voting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        int ind = arr.get(0), count = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr.get(i) == ind)
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count == 0)
            {
                ind = arr.get(i);
                count = 1;
            }
        }

        int freq = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr.get(i) == ind)
            {
                freq++;
            }
        }
        
        System.out.println("Max repeating element is: " + ind + " and frequency is: " + freq);

        sc.close();
    }
}