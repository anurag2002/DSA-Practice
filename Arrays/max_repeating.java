//Time: O(N^2)

import java.util.*;
public class max_repeating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int count, freq = 0,ind = 0;

        System.out.println("Enter the elements of array: ");
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < n; i++)
        {
            count = 0;
            for(int j = 0; j < n; j++)
            {
                if(ind == arr[i])
                {
                    break;
                }
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(freq < count)
            {
                ind = arr[i];
                freq = count;
            }
        }

        System.out.println("Most repeating element is: " + ind + " with frequency: " + freq);

        sc.close();
    }
}