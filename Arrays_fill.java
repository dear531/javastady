import java.util.*;

public class Arrays_fill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		Arrays.fill(array,1, 2, 3);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
