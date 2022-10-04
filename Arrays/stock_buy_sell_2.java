//Time Complexity: O(N)
// Buy and Sell Stock multiple times for maximum profit

import java.util.*;
public class stock_buy_sell_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        System.out.print("Enter the prices of stock for each day: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        int net = 0;

        for(int i = 1; i < n; i++)
        {
            if(arr.get(i-1) < arr.get(i))
            {
                net = net + (arr.get(i) - arr.get(i-1));
            }
        }

        System.out.println("Profit: " + net);

        sc.close();
    }
}
