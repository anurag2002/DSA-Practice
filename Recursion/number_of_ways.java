import java.util.*;
public class number_of_ways 
{
    static int path(int n, int m)
    {
        if(n == 1 || m == 1)
        {
            return 1;
        }
        return path(n-1,m) + path(n,m-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();

        System.out.println("The number of ways is: " + path(n,m));

        sc.close();
    }
}
