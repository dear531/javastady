class global_local {
	static int times = 3;
	/* 注意成员变量加static与不加static修饰的区别，
	   如果不加，则不会在其他块中生效
	   其他块中如果没有定义同名变量，则会直接编译不过
	   报没有定义该变量，例如，如果将第二行定义成int times = 3
	   再去掉main函数中的int times = 4；
	   则编译直接报该错误
	 */
	public static void main(String[] args) {
		int times = 4;
		System.out.println("times :" + times);
	}
}
