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
        
        int max = 0,profit = 0, min = arr.get(0),sum = 0, i = 0, j = n-1;

        while(j >= 0)
        {
            if(arr.get(j) > max)
            {
                max = arr.get(j);
                i = j;
            }
            else
            {
                sum = max - arr.get(j);
                if(sum > profit && j < i)
                {
                    profit = sum;
                    min = arr.get(j);
                }
            }
            System.out.println(max + " " + min + "i: " + i + "j: " +j);
            j--;
        }

        System.out.println("Max profit: " + (max-min) + " " + profit);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        sc.close();
    }
}
