import java.util.*;
public class pallindrome_string 
{
    static String pallindrome(String str, int l)
    {
        if(l == 1)
        {
            return Character.toString(str.charAt(l-1));
        }

        return str.charAt(l-1) + pallindrome(str, l-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();

        String chk = pallindrome(str, str.length());
        
        if(str.equals(chk))
        {
            System.out.println(str + " is pallindrome string.");
        }
        else
        {
            System.out.println(str + " is not pallindrome string.");
        }

        sc.close();
    }
}
