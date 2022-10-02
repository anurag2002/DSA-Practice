import java.util.*;
public class sum_of_n_numbers
{
    static int nat(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n + nat(n-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("The sum of first " + num + " natural numbers is: " + nat(num));

        sc.close();
    }
}