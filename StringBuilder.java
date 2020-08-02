package string2;
/* 在windows10 jdk 10环境下能通过编译，但ubuntu-bash的jdk1.8下通过不了编译 */

public class StringBuilder {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str = "";
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
		{
			str = str + i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("String消耗时间：" + time);

		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
		{
			builder.append(i);
		}
		endTime = System.currentTimeMillis();
		time = endTime - startTime;
		
		System.out.println("StringBuilder消耗时间：" + time);
		
		StringBuilder builder2 = new StringBuilder("abc");
		System.out.println("builder2：" + builder2);
		
		System.out.println(builder2 + ".insert(1, 10)：" + builder2.insert(1, 10));
		System.out.println(builder2 + ".delete(1, 3)：" + builder2.delete(1, 3));
		System.out.println(builder2 + ".replace(1, 3, \"E\")：" + builder2.replace(1, 3, "E"));

	}
}

