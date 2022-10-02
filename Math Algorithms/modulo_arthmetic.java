import java.util.*;
public class modulo_arthmetic 
{
    static int mod(int a, int b, int n)
    {
        int res = 1;
        while(b!=0)
        {
            if(b==1)
            {
                res = ((res%n)*(a%n))%n;
            }
            a = a*a;
            b=b>>1;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of mod: ");
        int n = sc.nextInt();

        System.out.println("(" + a + "^" + b + ")%" + n + " = " + mod(a,b,n));

        sc.close();
    }
}
