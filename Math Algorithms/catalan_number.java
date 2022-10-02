import java.util.*;
public class catalan_number 
{
    static int catalan(int n)
    {
        int res = 0;
        if(n == 0)
        {
            return 1;
        }
        
        for(int i = 0; i < n; i++)
        {
            res += catalan(i) * catalan(n-i-1);
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        System.out.println("The " + n + "th term of catalan series is: " + catalan(n));

        sc.close();
    }
}
