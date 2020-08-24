import java.util.Arrays;

public class Array_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 3, 5, 2, 4, 6 };
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + ",");
			}
		}
	}
}
