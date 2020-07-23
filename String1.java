public class String1 {
	public static void main(String[] args) {
		String s[] = {"0", "1"};
		/*
		   如打开本段注释，则会出现数组访问越界
		s[2] = "2";
		*/
		int a[] = {0, 1, 2};
		for (String c: s) {
			System.out.println(c);
		}
	}
}
