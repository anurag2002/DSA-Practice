import java.util.*;
public class max_pages_read1 
{
    static int[] allot(List<Integer> arr, int k)
    {
        int a=0, b=0;
        int ans[] = new int[2];
        int low = 0, high = arr.size()-1;

        while(low <= high)
        {
            if(a < b)
            {
                a=a+arr.get(low);
                low++;
            }
            else if(a > b)
            {
                b = b + arr.get(high);
                high--;
            }
            else if(a == b)
            {
                a = a+arr.get(low);
                b = b+arr.get(high);
                low++;
                high--;
            }
        }
        ans[0]=a;
        ans[1] = b;

        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of books: ");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.print("Enter the no of pages in each book: ");
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        int ans[] = allot(arr, 2);

        System.out.println("The total no of pages read by A is: " + ans[0]);
        System.out.println("The total no of pages read by B is: " + ans[1]);

        sc.close();
    }
}
