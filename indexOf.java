public class indexOf {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s6 = "1234567";
		int strlenth = s6.length();
		System.out.println("s6's length is " + strlenth);
		
		int position;
		position = s6.indexOf("4");
		/* 返回值相当于返回数组下表的标号 */
		System.out.println(position);
		position = s6.indexOf("8");
		/* 查找不到返回-1 */
		System.out.println(position);
	}

}
