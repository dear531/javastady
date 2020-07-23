class Final {
	public static void main(String[] args) {
		final double pi = 3.14;
		final int age;
		age = 20;
		/*
		 * 		age = 30;
		 * zhangly@ASUS:/mnt/d/data/javadevelop$ javac Final.java
		 * Final.java:6: 错误: 可能已分配变量age
		 * 	                age = 30;
		 *                 ^
		 * 			1 个错误
		 */
		/* can't give value to it second, below it's wrong */
		/* 		pi = 3.15;
		 * zhangly@ASUS:/mnt/d/data/javadevelop$ javac Final.java
		 * Final.java:5: 错误: 无法为最终变量pi分配值
		 * 	                pi = 3.15;
		 *                 ^
		 * 			1 个错误
		 */
		System.out.println(pi);
	}
}
