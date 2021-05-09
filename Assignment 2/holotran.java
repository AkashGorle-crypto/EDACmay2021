public class holotran
{
    public static void main(String[] args)
{
    
     int i, j;
        for (i = 1; i <= 4; i++)
        {
            for (j = 1; j <= 7; j++)
            {
               if((i==4) || (i+j==5) ||(j-i==3))
			   {
				   System.out.print("*");
			   }
			   else {
				   
				   System.out.print(" ");
			   }
            }
            System.out.print("\n");
        }
		}
		
}

