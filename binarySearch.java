import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 3, 5, 2, 4, 6};
		for (int i = 0; i < a.length; i++)
		{
			if (i != a.length - 1)
				System.out.print("a[" + i + "]:" + a[i] + ", ");
			else {
				System.out.println("a[" + i + "]:" + a[i]);
			}
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
		{
			if (i != a.length - 1)
				System.out.print("a[" + i + "]:" + a[i] + ", ");
			else {
				System.out.println("a[" + i + "]:" + a[i]);
			}
		}
		System.out.println(Arrays.binarySearch(a, 6));
		int b[] = {4, 25, 10};
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++)
		{
			if (i != b.length - 1)
				System.out.print("b[" + i + "]:" + b[i] + ", ");
			else {
				System.out.println("b[" + i + "]:" + b[i]);
			}
		}
		System.out.println("查找指定范围的内容在数组范围内但没有相等的" + Arrays.binarySearch(b, 0, 1, 8));
		System.out.println("查找全部的在范围内但没有匹配的" + Arrays.binarySearch(b, 8));
		System.out.println("查找内容有匹配的" + Arrays.binarySearch(b, 25));
		System.out.println("查找内容在范围之外大于的" + Arrays.binarySearch(b, 30));
		System.out.println("查找内容在范围之外小于的" + Arrays.binarySearch(b, -1));

		int c[] = {4, 25, 10, 8};

		Arrays.sort(c);

		for (int i = 0; i < c.length; i++)
		{
			if (i != c.length - 1)
				System.out.print("c[" + i + "]:" + c[i] + ", ");
			else {
				System.out.println("c[" + i + "]:" + c[i]);
			}
		}
	}

}

