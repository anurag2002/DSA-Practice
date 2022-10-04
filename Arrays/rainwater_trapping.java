import java.util.*;
public class rainwater_trapping 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.print("Enter the number of buildings: ");
        int n = sc.nextInt();

        System.out.print("Enter the heights of the building: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        int max = Collections.max(arr), water = 0, i = 1, local = arr.get(0);
        while(arr.get(i) != max && i < n)
        {
            if(arr.get(i) > arr.get(i-1) && local < arr.get(i))
            {
                local = arr.get(i);
            }
            else
            {
                water = water + (local - arr.get(i));
            }
            System.out.println(water);
            i++;
        }
        if(i < n)
        {
            i = n-2;
            local = arr.get(n-1);
            while(arr.get(i) != max && i >= 0)
            {
                if(arr.get(i) > arr.get(i+1) && local < arr.get(i))
                {
                    local = arr.get(i);
                }
                else
                {
                    water = water + (local - arr.get(i));
                }
                System.out.println(water);
                i--;
            }   
        }

        System.out.println("The amount of rain water stored: " + water);

        sc.close();
    }
}
