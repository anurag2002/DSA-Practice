import java.util.*;
public class pallindrome 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num, pallin = 0;

        while(temp != 0)
        {
            pallin = pallin*10 + (temp%10);
            temp = temp/10;
        }

        if(num == pallin)
        {
            System.out.println(num + " is pallindrome.");
        }
        else
        {
            System.out.println(num + " is not pallindrome.");
        }

        sc.close();
    }
}
