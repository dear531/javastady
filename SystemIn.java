import java.util.Scanner;
class SystemIn
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int a = s.nextInt();
		System.out.println("这个数字是："+a);
	}
}
