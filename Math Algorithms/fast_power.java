import java.util.*;
public class fast_power 
{
    public static int power(int a, int b)
    {
        int res = 1;
        
        if(b == 0)
        {
            return res;
        }
        if((b & 1) == 0)
        {
            return power(a*a,b>>1);
        }
        else
        {
            return (a*power(a, b-1));
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();

        System.out.println(a + "^" + b + " = " + power(a,b));

        sc.close();
    }
}
