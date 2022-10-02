import java.util.*;
public class two_non_repeating 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter the size of array: ");
        int l = sc.nextInt();

        System.out.print("Enter the elements in array: ");
        for(int i = 0; i < l; i++)
        {
            arr[i] = sc.nextInt();
        }

        int a = arr[0];
        for(int i = 1; i < l; i++)
        {
            a = a^arr[i];
        }

        int temp = a, count = 0;
        while((temp&1)!=1)
        {
            temp = temp>>1;
            count++;
        }

        temp = a;

        for(int i = 0; i < l; i++)
        {
            if(((arr[i]>>count)&1) == 1)
            {
                a = a^arr[i];
            }
        }

        System.out.println("The non-repeating numbers are: " + a + " and " + (temp^a));
    
        sc.close();
    }
}
