import java.util.*;
public class inclusion_exclusion 
{
    static int gcd(int a, int b)
    {
        if(a%b == 0)
        {
            return b;
        }
        if(a>b)
        {
            return gcd(b, a%b);
        }
        else
        {
            return gcd(b, a%b);
        }
    }
    static int numbers(int n, int a, int b)
    {
        int n1 = n/a;
        int n2 = n/b;
        int n3 = (n*gcd(a,b))/(a*b);

        return n1+n2-n3;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("The total numbers divisible by " + a + " and " + b + " from 1 to 1000 is: " + numbers(1000,a,b));

        sc.close();
    }
}
