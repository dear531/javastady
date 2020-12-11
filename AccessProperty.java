
public class AccessProperty {
	static int i_1 = 47; //定义在静态数据段上所有引用共享
	int i_2 = 47; //定义在堆上的每个引用独立
	public void call_1() {
		for (i_1 = 0; i_1 < 3; i_1++) {
			System.out.print(i_1 + " ");
			if (i_1 == 2) {
				System.out.println("\n");
			}
		}
	}

	public void call_2() {
		for (i_2 = 0; i_2 < 3; i_2++) {
			System.out.print(i_2 + " ");
			if (i_2 == 2) {
				System.out.println("\n");
			}
		}
	}

	public AccessProperty() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessProperty t1 = new AccessProperty();
		AccessProperty t2 = new AccessProperty();
		t2.i_1 = 60;
		//使用第一个对象调用类成员变量
		System.out.println("第一个实例对象调用变量i_1的结果" + t1.i_1++);
		t1.call_1();
		//使用第二个对象调用类成员变量
		System.out.println("第二个实例对象调用变量i_1的结果" + t2.i_1);
		t2.call_1();

		t2.i_2 = 60;
		//使用第一个对象调用类成员变量
		System.out.println("第一个实例对象调用变量i_2的结果" + t1.i_2++);
		t1.call_2();
		//使用第二个对象调用类成员变量
		System.out.println("第二个实例对象调用变量i_2的结果" + t2.i_2);
		t2.call_2();

	}

}

