import java.util.*;
public class set_bit 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the bit to be set: ");
        int i = sc.nextInt();

        System.out.println("Number before setting bit: " + num);

        num = num | (1<<(i-1));

        System.out.println("Number after setting bit: " + num);

        sc.close();
    }
}
