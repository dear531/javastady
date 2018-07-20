class forloop
{
	public static void main(String[] args)
	{
		int i = 0, j = 0;
		System.out.println("遍历组合法");
		for (i = 3; 100 > i; i = i % 5 != 0 ? i + 3 : i + 6)
		{
			for (j = 5; 100 > j; j = 0 != j % 3 ? j + 5 : j + 10)
			{
				if (100 < i * j)
					break;
				System.out.println(i * j);
			}
		}
		System.out.println("穷举法");
		for (i = 1; 100 > i; i++)
		{
			if (0 == i % 3 && 0 == i % 5)
			{
				System.out.println(i);
			}
		}
		System.out.println("构造法");
		for (i = 1; 100 > i; i++)
		{
			if (100 < 3 * 5 * i)
				break;
			System.out.println(3 * 5 * i);
		}
	}
}
