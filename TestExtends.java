class Test {
	public Test() {
		System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
		//打印函数名
		System.out.println(Thread.currentThread().getStackTrace()[2].getFileName());
		//打印行号
		System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
	}
}
public class TestExtends extends Test {
	
	public TestExtends() {
		super();
		System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
		//打印函数名
		System.out.println(Thread.currentThread().getStackTrace()[2].getFileName());
		//打印行号
		System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
	}

	protected TestExtends dolt() {
		return new TestExtends();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExtends t = new TestExtends();
		

	}

}
