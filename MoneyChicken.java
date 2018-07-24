class MoneyChicken
{
	public static void main(String[] args)
	{
		int i = 0, j = 0, k = 0;
		for (i = 1; 33 > i; i++)
		{
			for (j = 1; 50 > j; j++)
			{
				k = 100 - i - j;
				if (0 == k % 2 && i * 3 + j * 2 + k / 2 == 100)
				{
					System.out.println("i :" + i + ",j :" + j + ",k :" + k);
					System.out.println(i + "+" + j + "+" + k + " = " + (i + j + k));
		System.out.println("3 * " + i + "+ 2 * " + j + " + " + k + " / 2 = " + (2 * i + 2 * j + k / 2));
				}
			}
		}
	}
}
