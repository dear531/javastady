import java.util.*;

public class format_normal {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 15;
		String decimal  = String.format("%d",num);
		String hex = String.format("0x%x",num);
		String bool = String.format("%b",num);
		System.out.println(decimal);
		System.out.println(hex);
		System.out.println(bool);

	}

}
