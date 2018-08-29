class char2 {
	public static void main(String[] args) {
		char word1 ='d', word2 = '@';
		int p1 = 23045, p2 = 45213;
		System.out.println("'" + word1 + "'" + "在unicoded表中的顺序位置是：" + (int)word1);
		System.out.println("'" + word2 + "'" + "在unicoded表中的顺序位置是：" + (int)word2);
		System.out.println("unicode表中第" + p1 + "位是：" + (char)p1);
		System.out.println("unicode表中第" + p2 + "位是：" + (char)p2);
	}
}
