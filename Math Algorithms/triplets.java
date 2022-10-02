//Find a triplet(X,Y,Z) such that all are divisible by A and exactly one is divisible by B and X+Y=Z

import java.util.*;
public class triplets 
{
    static void triplet(int a, int b)
    {
        if(b == 1)
        {
            System.out.println("No Triplets Exists");
            return;
        }
        System.out.print("The Triplets are: ");
        System.out.println("( " + a + ", " + a*b + ", " + a*(b+1) + " )");
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        triplet(a,b);

        sc.close();
    }
}
