import java.util.Scanner;
class Continue
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("输入一个数，判断是不是素数：");
		int i = 0;
		int n = s.nextInt();
		for (i = 2; n / 2 >= i; i++)
		{
			if (0 == n % i)
				break;
		}
		System.out.println("n / 2 + 1:"+ (n / 2 + 1) + ", i :" + i);
		if (n / 2 + 1 == i)
			System.out.println(n+"是素数");
		else
			System.out.println(n+"不是素数");

	}
}
