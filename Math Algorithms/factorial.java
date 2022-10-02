import java.util.*;
public class factorial
{
    public static int fact(int num)
    {
        if(num == 0 || num == 1)
        {
            return 1;
        }
        else
        {
            return num * fact(num-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is: " + fact(num));

        sc.close();
    }
}