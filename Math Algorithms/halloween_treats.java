//Pigeonhole Principle

import java.util.*;
public class halloween_treats 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Children: ");
        int c = sc.nextInt();
        System.out.print("Enter the number of neighbours: ");
        int n = sc.nextInt();

        if(c == 0 || n == 0)
        {
            sc.close();
            return;
        }

        ArrayList<Integer> sweet = new ArrayList<>();
        
        System.out.println("Enter sweet given by each neighbour: ");
        for(int i = 0; i < n; i++)
        {
            sweet.add(sc.nextInt());
        }

        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum = sum+sweet.get(i);
        }

        int rem = sum%c;

        if(rem == 0)
        {
            for(int i = 0; i < n; i++)
            {
                System.out.print((i+1) + " ");
            }
        }
        else
        {
            sum = 0;
            ArrayList<Integer> sortedSweet = new ArrayList<>();
            ArrayList<Integer> index = new ArrayList<>();
            sortedSweet.addAll(sweet);
            Collections.sort(sortedSweet);
            
            for(int i = n-1; i >=0; i--)
            {
                sum = sum+sortedSweet.get(i);
                index.add(sortedSweet.get(i));
                if(sum%c == 0)
                {
                    break;
                }
            }
            
            for(int i = 0; i < index.size(); i++)
            {
                System.out.print(sweet.indexOf(index.get(i))+1 + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
