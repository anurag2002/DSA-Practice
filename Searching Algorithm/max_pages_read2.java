//Allocate minimum pages to each students: Generalized

import java.util.*;
public class max_pages_read2 
{
    static int allot(List<Integer> arr, int k)
    {
        int min, max = 0, mid, res = 0;
        min = Collections.max(arr);
        for(int i : arr)
        {
            max+=i;
        }
        while(min <= max)
        {
            mid = (min+max)/2;
            int student = 1, sum = 0;
            
            for(int i = 0; i < arr.size(); i++)
            {
                if(sum+arr.get(i) > mid)
                {
                    student++;
                    sum = arr.get(i);
                }
                else
                {
                    sum+=arr.get(i);
                }
            }

            if(student <= k)
            {
                res = mid;
                max = mid-1;
            }
            if(student > k)
            {
                min = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of books: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the no of pages in each book: ");
        for(int i =0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter the no of candidates: ");
        int k = sc.nextInt();

        int res = allot(arr,k);
        List<Integer> alt = new ArrayList<>();

        int sum = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            sum += arr.get(i);
            if(sum > res)
            {
                sum -= arr.get(i);
                alt.add(sum);
                sum = arr.get(i);
            }
        }
        alt.add(sum);

        System.out.println("Result: " + alt);

        sc.close();
    }
}
