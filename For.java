public class For {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int array[] = {21, 23, 25};
		/* 冒号后的元素为数组或者集合类 */
		for (int i : array) {
			System.out.println(i);
		}
	}
}
