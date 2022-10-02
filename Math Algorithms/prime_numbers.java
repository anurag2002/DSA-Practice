import java.util.*;
public class prime_numbers 
{
    public static int prime(int num)
    {
        int count = 0;
        boolean[] arr = new boolean[100];
        for(int i = 0; i < num; i++)
        {
            arr[i] = true;
        }
        arr[0] = false;

        for(int i = 1; i < Math.pow(num, (0.5)); i++)
        {
            if(arr[i] == true)
            {
                for(int j = 2*(i+1); j <= num; j = j+(i+1))
                {
                    arr[j-1] = false;
                }
            }
        }

        for(int i = 0; i < num; i++)
        {
            System.out.println(arr[i] + " " + (i+1));
            if(arr[i] == true)
            {
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Number of prime numbers between 1 to " + num + " are: " + prime(num));

        sc.close();
    }
}
