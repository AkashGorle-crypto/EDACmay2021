class Aflag
{
public static void main(String[] args)
{
	//public static void printAmericanFlag()
	//{
		for (int i = 0; i < 15; i++)
		{
			for (int j = 0; j < 46; j++)
			{
				if(i <9 && j < 12)
				{
					if((i % 2 == 0 && j % 2 == 0)||(i % 2 == 1 && j % 2 == 1 && j!= 11))
					{
						System.out.print("*");
					}
						else
						{
							System.out.print(" ");
						}
				}
						else
						{
							System.out.print("=");
						}
			}
			System.out.println();
		}
	//}
}
}