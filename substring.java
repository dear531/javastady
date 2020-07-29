public class substring {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "together";
		int begin = 2, end = begin + 3;
		System.out.println("\""+ s + "\".substring(" + begin + "," + end + "):" + s.substring(begin, end));
		System.out.println("\""+ s + "\".substring(" + begin + "):" + s.substring(begin));
		System.out.println("\""+ s + "\".substring(" + "s.length()" + "):" +
				s.substring(s.length()));
		System.out.println("\""+ s + "\".substring(" + "s.length()-1" + "):" +
				s.substring(s.length()-1));
	}

}
