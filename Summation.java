
public class Summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"89", "12", "10", "18", "35"};
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			int myint = Integer.parseInt(str[i]);
			System.out.println(myint);
			sum = sum + myint;
		}
		System.out.println(Integer.toString(sum));
		System.out.println("数组中的各元素之和是" + sum);
	}

}

