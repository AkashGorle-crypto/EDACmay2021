public class Pattern8
{
    public static void main(String[] args)
{
    
     int i, j, n = 5;
        for (i = n; i >= 1; i--)
        {
            for (j = i; j <= n; j++)
            {
                System.out.printf("%c ", ('A' + j - 1));
            }
            System.out.println("");
        }
}
}
