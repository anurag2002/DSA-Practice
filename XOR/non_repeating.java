import java.util.*;
public class non_repeating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter the size of array: ");
        int l = sc.nextInt();

        System.out.println("Enter the elements in array: ");
        for(int i = 0; i < l; i++)
        {
            arr[i] = sc.nextInt();
        }

        int a = arr[0];

        for(int i = 1; i < l; i++)
        {
            a = a^arr[i];
        }

        System.out.println("The only non-repeating element of the array is: " + a);

        sc.close();
    }
}