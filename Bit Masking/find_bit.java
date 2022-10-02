import java.util.*;
public class find_bit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the index of bit to be found: ");
        int i = sc.nextInt();
        
        System.out.println("The " + i + " bit of " + num + " is: " + ((num>>(i-1)) & 1));

        sc.close();
    }
}