/*
 * $ java Args a b c
 * args[0]:a
 * args[1]:b
 * args[2]:c
 */
public class Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++)
		{
			System.out.println("args[" + i + "]:" + args[i]);
		}

	}

}
