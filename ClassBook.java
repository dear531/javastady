public class ClassBook {
	static int i;
	static ClassBook book2;
	static {
		//i = 0;
		System.out.println(i);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(Math.PI);
	}
	private String name;//定义一个String型的成员变量

	public String getName() {//定义一个getName()方法
		int id = 0;//局部变量
		setName("Java");//调用类中其他方法
		return id + this.name;//设置方法返回值
	}

	private void setName(String name) {//定义一个setName()方法
		this.name = name;//将参数值赋予类中的成员变量
	}

	public ClassBook getBook() {
		return this;//返回Book类引用
	}

	public void main2(String[] args) {
		System.out.println(this.getName());
	}

}

