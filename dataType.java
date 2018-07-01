class dataType
{
	public static void main(String[] args)
	{
		byte b = -128;
		System.out.println(b);
		char c = 256 + 4;
		System.out.println(c);
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(b));
		/*
		int d = -20; 20 = 16 + 4 = 2(4) + 2(2) = 0001 0100
		24x0 0001 0100 取反 + 1 = 24个1 1110 1011 + 1 = 24个1 1110 1100
		*/
		int d = -20;
		System.out.println(Integer.toBinaryString(d));
		System.out.println(Integer.toHexString(d));
		int e = Integer.MAX_VALUE + 1;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(e);
		System.out.println(Integer.MIN_VALUE);
	}
}
