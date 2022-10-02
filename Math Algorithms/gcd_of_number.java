import java.util.*;;
public class gcd_of_number 
{
    public static int gcd(int a, int b)
    {
        if(a%b == 0)
        {
            return b;
        }
        if(a > b)
        {
            return gcd(a%b, b);
        }
        else
        {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));

        sc.close();
    }
}
