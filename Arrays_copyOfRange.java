import java.util.Arrays;

public class Arrays_copyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrorg[] = {0, 1, 2, 3, 4};
		int arrnew[] = Arrays.copyOfRange(arrorg, 0, 2);
		for (int i = 0; i < arrnew.length; i++)
		{
			System.out.println(arrnew[i]);
		}
	}

}

