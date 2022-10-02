//Minimum number of socks required to picked to have at least K pairs of the same color

import java.util.*;
public class socks 
{
    static int minPick(ArrayList<Integer> socks, int n, int k)
    {
        int pairs = 0;

        for(int i : socks)
        {
            pairs = pairs + (i>>1);
        }

        if(pairs < k)
        {
            return -1;
        }

        return 2*n+k-1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of different color socks: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of pairs to be formed: ");
        int k = sc.nextInt();

        ArrayList<Integer> socks = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            socks.add(sc.nextInt());
        }

        int res = minPick(socks, n, k);

        if(res == -1)
        {
            System.out.println(k + " pair of same color socks cannot be picked");
        }
        else
        {
            System.out.println(res + " is the minimum number of socks that must be picked to get " + k + " pairs of same color socks");
        }

        sc.close();
    }
}
