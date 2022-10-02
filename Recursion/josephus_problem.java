import java.util.*;
public class josephus_problem 
{
    static int remain(List<Integer> part, int n, int k, int g)
    {
        if(n == 1)
        {
            return part.get(0);
        }

        g=(g+(k-1))%n;
        part.remove(g);
        
        return remain(part, part.size(), k, g);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of participants: ");
        int n = sc.nextInt();
        System.out.print("Enter the shoot range: ");
        int k = sc.nextInt();
        List<Integer> participants = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            participants.add(i);
        }

        System.out.println("The last remaining participant is: " + remain(participants,n,k,0));

        sc.close();
    }
}
