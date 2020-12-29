//父类
class Parent {
	Parent() {
		System.out.println("调用父类的Parent()构造方法");
	}
}

//继承Parent类
class SubParent extends Parent {
	SubParent() {
		System.out.println("调用子类的SubParent()构造方法");
	}
}

//继承SubParent类
public class Subroutine extends SubParent {
	Subroutine() {
		System.out.println("调用子类的Subroutine()构造方法");
	}

	public static void main(String[] args) {
		//实例化子类对象
		Subroutine s = new Subroutine();
	}

}
