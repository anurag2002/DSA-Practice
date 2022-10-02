import java.util.*;
public class power_of_number 
{
    static int power(int a, int b)
    {
        if(b == 0)
        {
            return 1;
        }
        if((b&1) == 1)
        {
            return a*power(a,b-1);
        }
        else
        {
            return power(a*a, b/2);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();

        System.out.println(a + "^" + b + "=" + power(a,b));

        sc.close();
    }
}
