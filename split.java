public class split {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print( "\"a,b,,,d,\".split(\",\"):\t");
		for (String s2 :"a,b,,,d,".split(","))
		{
			System.out.print("\"" + s2 + "\""+ '\t');
		}
		System.out.println();
		System.out.print( "\"a,b,,,d,\".split(\",\", 2):\t");
		for (String s2 :"a,b,,,d,".split(",", 2))
		{
			System.out.print("\"" + s2 + "\""+ '\t');
		}
		System.out.println();
		System.out.print("\"a,b,,,d,\".split(\",\", 5):\t");
		for (String s2 :"a,b,,,d,".split(",", 5))
		{
			System.out.print("\"" + s2 + "\""+ '\t');
		}
		System.out.println();
		System.out.print("\"a,b,,,d,\".split(\",\", -1):\t");
		for (String s2 :"a,b,,,d,".split(",", -1))
		{
			System.out.print("\"" + s2 + "\""+ '\t');
		}
		System.out.println();
		System.out.print("\"a,b,,,d,\".split(\",\", 0):\t");
		for (String s2 :"a,b,,,d,".split(",", 0))
		{
			System.out.print("\"" + s2 + "\""+ '\t');
		}
		System.out.println();	

	}

}

