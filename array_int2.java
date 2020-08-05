public class array_int2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int array_int1[][];
		array_int1 = new int[2][];
		array_int1[0] = new int[2];
		array_int1[1] = new int[3];
		
		for (int i[] : array_int1)
		{
			for (int j : i)
			{
				System.out.println(j);
			}
			System.out.println("==========");
		}
		
		int array_int2[][] = {{11, 12, 13}, {21, 22, 23}};
		for (int i = 0; i < array_int2.length; i++)
		{
			for (int j = 0; j < array_int2[i].length; j++)
			{
				if (j == array_int2[i].length - 1)
					System.out.print(array_int2[i][j]);
				else
					System.out.print(array_int2[i][j] + ",");

			}
			System.out.println();
		}

	}

}
