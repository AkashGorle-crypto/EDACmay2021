import java.util.*;
public class Pattern5
{
    public static void main(String args[]) {
 
    Scanner scan= new Scanner(System.in);
  char input='E', alphabet = 'A';
    System.out.println("Enter the uppercase character you want to print in the last row: ");
  

    for(int i = 1; i <= (input-'A'+1); ++i)
    {
        for(int j = 1; j <= i; ++j)
        {
           System.out.print(alphabet+ " ");
        }
        ++alphabet;

        System.out.println("\n");
    }
   
}
        
    }
