public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c1 = new String("abc");
		String c2 = new String("abc");
		String c3 = c1;
		System.out.println("c1:" + System.identityHashCode(c1));
		System.out.println("c2:" + System.identityHashCode(c2));
		System.out.println("c3:" + System.identityHashCode(c3));

		//使用"=="运算符比较c2与c3
		System.out.println("c2==c3的运算结果为" +(c2==c3));
		//使用equals()方法比较c2与c3
		System.out.println("c2.equals(c3)的运算结果为"+(c2.equals(c3)));
		System.out.println("c1==c3的运算结果为" +(c1==c3));

	}

}

