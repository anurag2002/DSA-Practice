import java.util.*;
public class no_of_digits 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;

        System.out.print("Number of bits in " + num + " are: ");

        while(num != 0)
        {
            count++;
            num = num>>1;
        }

        System.out.println(count);

        sc.close();
    }
}