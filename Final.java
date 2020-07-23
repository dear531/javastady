class Final {
	public static void main(String[] args) {
		final double pi = 3.14;
		/* can't give value to it second, below it's wrong */
		/* 		pi = 3.15;
		 * Final.java:5: 错误: 无法为最终变量pi分配值
		 * 	                pi = 3.15;
		 *                 ^
		 * 			1 个错误
		 */
		System.out.println(pi);
	}
}
