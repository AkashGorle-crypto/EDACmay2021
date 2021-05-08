import java.util.*;
public class Pattern6
{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
      

  System.out.println("Enter number of rows: ");
    int rows= scan.nextInt();


    for(int i = 1, k = 0; i <= rows; ++i, k = 0)
    {
        for(int j= 1; j<= rows-i; ++j)
        {
           System.out.print(" ");
        }

        while(k != 2*i-1)
        {
          System.out.print("* ");
            ++k;
        }
      System.out.println(" ");
    }    
        
    }
}