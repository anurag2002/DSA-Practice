import java.util.*;
public class odd_even
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = n&1;

        if(i == 0)
        {
            System.out.println(n + " is even");
        }
        else
        {
            System.out.println(n + " is odd");
        }

        sc.close();
    }
}