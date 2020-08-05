public class String_array2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		String array_int3[][] = new String[2][3];
		for (int i = 0; i < array_int3.length; i++)
		{
			for (int j = 0; j < array_int3[i].length; j++)
			{
				if (j == array_int3[i].length - 1)
					System.out.print(array_int3[i][j]);
				else
					System.out.print(array_int3[i][j] + ",");

			}
			System.out.println();
		}

	}
	
	

}
