public class array_int1 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int array_int1[];
		array_int1 = new int[5];
		int array_int2[] = new int[5];
		for (int i : array_int2) {
			System.out.println(i);
		}
		int array_int3[] = {1, 2, 3, 4};
		int array_int4[] = new int[]{1, 2, 3, 4};
		for (int i : array_int3)
		{
			System.out.println(i);
		}
		for (int i : array_int4)
		{
			System.out.println(i);
		}
		
		int day[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < 12; i++)
		{
			System.out.println(i + 1 + "月" + day[i] + "天");
		}
	}

}
