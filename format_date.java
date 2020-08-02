import java.util.*;

public class format_date {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Date date = new Date();
		String year = String.format("%tY",date);
		String month = String.format("%tm",date);
		String day = String.format("%td",date);
		System.out.println("YYYYMMDD:" + year + month + day);
		
		String hour = String.format("%tH",date);
		String minute = String.format("%tM",date);
		String seconte = String.format("%tS",date);
		System.out.println("HH:MM:SS:" + hour + minute + seconte);
	}

}
