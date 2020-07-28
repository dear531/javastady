public class indexOf {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s6 = "1234567";
		int strlenth = s6.length();
		System.out.println("s6's length is " + strlenth);
		
		int position;
		/* 返回值相当于返回数组下表的标号 */
		position = s6.indexOf("4");
		System.out.println(position);

		/* 查找不到返回-1 */
		position = s6.indexOf("8");
		System.out.println(position);

		/* ""空串搜索直接返回 */
		position = s6.indexOf("");
		System.out.println(position);

		/* lastIndexOf方法""空串搜索则与length方法返回值相同 */
		position = s6.lastIndexOf("");
		System.out.println(position);
	}

}
