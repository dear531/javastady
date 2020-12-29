class Parent {
	Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("调用父类的Parent()构造方法");
	}
}

class SubParent extends Parent {
	SubParent() {
		System.out.println("调用子类的SubParent()构造方法");
	}
}

public class Subroutine extends SubParent {
	Subroutine() {
		// TODO Auto-generated constructor stub
		System.out.println("调用子类的Subroutine()构造方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化子类对象
		Subroutine s = new Subroutine();
	}

}
