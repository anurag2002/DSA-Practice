// Time Complexity: O(N)

import java.util.*;
public class stocks_buy_sell_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.print("Enter the total days: ");
        int n = sc.nextInt();

        System.out.print("Enter the prices of stock: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        
        int max = 0,profit = 0, j = n-1, min = arr.get(0),sum = 0, maxInd = 0;

        while(j >= 0)
        {
            if(max < arr.get(j))
            {
                max = arr.get(j);
                maxInd = j;
            }
            sum = max - arr.get(j);
            if(sum > profit && j < maxInd)
            {
                profit = sum;
                min = arr.get(j);
            }
            j--;
        }

        System.out.println("Buy at Price: " + min);
        System.out.println("Sell at Price: " + (profit + min));
        System.out.println("Profit: " + profit);

        sc.close();
    }
}
