//Check if a number S can be made divisible by D by repeatedly adding the remainder to S

import java.util.*;
public class divisible 
{
    static boolean check(int s, int d)
    {
        int i = 0;
        while(s%d != 0 && i <= d)
        {
            s = s + (s%d);
            i++;
        }

        if(s%d == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int s = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int d = sc.nextInt();

        boolean chk = check(s,d);
        if(chk == true)
        {
            System.out.println(s + " can be made divisible by " + d + " by repeatedly adding the remainder to it.");
        }
        else
        {
            System.out.println(s + " cannot be made divisible by " + d + " by repeatedly adding the remainder to it.");
        }

        sc.close();
    }
}
