import java.util.*;
public class no_of_bits_to_change 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original number: ");
        int a = sc.nextInt();
        System.out.print("Enter the final number: ");;
        int b = sc.nextInt();
        int count = 0;

        System.out.print("Number of bits required to convert " + a + " to " + b + " are: ");

        a = a^b;

        while(a != 0)
        {
            count++;
            a = a>>1;
        }

        System.out.println(count);

        sc.close();
    }
}
