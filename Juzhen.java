class Juzhen
{
	public static void main(String[] args)
	{
		int i = 0, j = 0, n = 5;
		for (i = 0; n > i; i++)
		{
			for (j = 0; n > j; j++)
			{
				if (i == 2 - j || i == 6 - j || i == j + 2 || i == j - 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
