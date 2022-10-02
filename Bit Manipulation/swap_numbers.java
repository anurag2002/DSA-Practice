import java.util.*;
public class swap_numbers 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Numbers before swap are: " + a + " & " + b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Numbers after swap are: " + a + " & " + b);
        
        sc.close();
    }
}
