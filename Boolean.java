public class Boolean {
	public static void main(String[] args) {
/*
 *		if (1) {
 *			System.out.println("This is 1");
 *		}
 * zhangly@ASUS:/mnt/d/data/javadevelop$ javac Boolean.java
 * Boolean.java:4: 错误: 不兼容的类型: int无法转换为boolean
 *                 if (1) {
 *		                     ^
 *				     1 个错误
 */
		boolean b = true;
		if (b) {
			System.out.println("This is b");
		}
	}
}
