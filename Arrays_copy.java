import java.util.Arrays;

public class Arrays_copy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 5, 4, 3, 2, 1 };
		int NewArr[] = Arrays.copyOf(arr, arr.length);
		String end = "0";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				end = "\n";
			} else {
				end = ",";
			}
			System.out.print(arr[i] + end);
		}
		for (int i = 0; i < NewArr.length; i++) {
			if (i == NewArr.length - 1) {
				end = "\n";
			} else {
				end = ",";
			}
			System.out.print(NewArr[i] + end);
		}
		int NewArr2[] = Arrays.copyOf(arr, arr.length - 1);
		for (int i = 0; i < NewArr2.length; i++) {
			if (i == NewArr2.length - 1) {
				end = "\n";
			} else {
				end = ",";
			}
			System.out.print(NewArr[i] + end);
		}
		int NewArr3[] = Arrays.copyOf(arr, arr.length + 1);
		for (int i = 0; i < NewArr3.length; i++) {
			if (i == NewArr3.length - 1) {
				end = "\n";
			} else {
				end = ",";
			}
			System.out.print(NewArr3[i] + end);
		}
	}
}
