import java.util.*;
public class trailing_zeroes 
{

    public static int zeroes(int num)
    {
        int zero = 0;
        for(int i = 5; i <= num; i = i*5)
        {
            zero = zero + (num/i);
        }
        return zero;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("The number of trailing zeroes in " + num + " are: " + zeroes(num));

        sc.close();
    }
}
