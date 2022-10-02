import java.util.*;
public class bit_flip 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Number before flipping: " + num);

        int temp = num, count = 0;
        while(temp != 0)
        {
            temp = temp>>1;
            count++;
        }

        int x = (1<<(count))-1;
        num = num ^ x;

        System.out.println("Number after flipping: " + num);

        sc.close();
    }
}
