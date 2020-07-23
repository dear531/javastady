public class float_double {
	public static void main(String[] args) {
		/*
		 * float_double.java:3: 错误: 不兼容的类型: 从double转换到float可能会有损失
		 *               float f = 123.3;
	 	 *			                           ^
		 *					   1 个错误
		 */
		float f = 123.3f;
		double d = 123.3d;
		System.out.println("f:"+f+",d:" + d);
	}
}
