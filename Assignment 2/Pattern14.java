import java.util.*;
public class Pattern14
{
    public static void main(String args[]) {
    Scanner scan= new Scanner(System.in);
     
    System.out.println("Enter number of rows: ");
      int rows=scan.nextInt();

    for(int i = rows; i >= 1; --i)
    {
        for(int j = 1; j <= i; ++j)
        {
           System.out.print(j+" ");
        }
        System.out.println("\n");
    }
        
    }
}