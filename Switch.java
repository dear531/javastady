import java.util.Scanner;
class Switch
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入年:");
		int y = s.nextInt();
		System.out.println("请输入月:");
		int m = s.nextInt();
		System.out.println("请输入日：");
		int d = s.nextInt();
		int sum = 0;
		switch (m - 1)
		{
			case 11:
				sum += 30;
			case 10:
				sum += 31;
			case 9:
				sum += 30;
			case 8:
				sum += 31;
			case 7:
				sum += 31;
			case 6:
				sum += 30;
			case 5:
				sum += 31;
			case 4:
				sum += 30;
			case 3:
				sum += 31;
			case 2:
				if (0 == y % 400 || (0 == y % 4 && 0 != y % 100))
					sum += 29;
				else
					sum += 28;
			case 1:
				sum += 31;
		}
		sum += d;
		System.out.println(y+"年"+m+"月"+d+"日是这年当中的第"+sum+"天");
	}
}
