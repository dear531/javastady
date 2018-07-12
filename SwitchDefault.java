import java.util.Scanner;
class SwitchDefault
{
	public static void main(String[] args)
	{
		int a = 5;
		switch (a)
		{
			case 1:
				System.out.println("a");
			default:
				System.out.println("d");
			case 2:
				System.out.println("b");
			case 3:
				System.out.println("c");
		}
	}
}
