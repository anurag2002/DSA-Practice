import java.util.*;

public class n_queens
{
    static boolean safe(ArrayList<ArrayList<Integer>> board, int row, int col, int n)
    {
        int i,j;

        //Check vertical
        for(i = 0; i < n; i++)
        {
            if(board.get(row).get(i) == 1)
            {
                return false;
            }
        }

        //Check Horizontal
        for(i = 0; i < n; i++)
        {
            if(board.get(i).get(col) == 1)
            {
                return false;
            }
        }

        //Check Top Left Diagonals
        for(i = row, j = col; i>=0 && j>=0; i--,j--)
        {
            if(board.get(i).get(j) == 1)
            {
                return false;
            }
        }

        //Check Bottom Right Diagonal
        for(i = row, j = col; i<n && j<n; i++,j++)
        {
            if(board.get(i).get(j) == 1)
            {
                return false;
            }
        }

        //Check Top Right Diagonal
        for(i = row, j = col; i>=0 && j<n; i--,j++)
        {
            if(board.get(i).get(j) == 1)
            {
                return false;
            }
        }

        //Check Bottom Left Diagonal
        for(i = row, j = col; i<n && j>=0; i++,j--)
        {
            if(board.get(i).get(j) == 1)
            {
                return false;
            }
        }

        return true;
    }

    static boolean queen(ArrayList<ArrayList<Integer>> board, int row, int n)
    {
        if(row == n)
        {
            return true;
        }
        
        for(int col = 0; col < n; col++)
        {
            if(safe(board, row, col, n))
            {
                board.get(row).set(col, 1);
                if(queen(board, row+1, n))
                {
                    return true;
                }
                board.get(row).set(col, 0);
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of board: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < n; i++)
        {
            board.add(new ArrayList<Integer>());
            for(int j = 0; j < n; j++)
            {
                board.get(i).add(j, 0);
            }
        }

        boolean pos = queen(board, 0,n);

        if(pos == true)
        {
            System.out.println("Solution is possible. \nSolution is: ");
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    System.out.print(board.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}