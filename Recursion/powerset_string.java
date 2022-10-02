import java.util.*;
public class powerset_string 
{
    static void powerset(String str, int i, String curr, List<String> sets)
    {
        if(i == str.length())
        {
            sets.add(curr);
            return;
        }
        powerset(str, i+1, curr + str.charAt(i), sets);
        powerset(str, i+1, curr, sets);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();

        List<String> sets = new ArrayList<>();

        powerset(str, 0, "", sets);

        System.out.println("The total possible powersets from " + str + " is: " + sets.size());
        System.out.println("The subsequences are: " + sets);

        sc.close();
    }
}
