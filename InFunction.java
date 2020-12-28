public class InFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//返回第一个大于等于参数的整数
		System.out.println("使用ceil("+5.2+")方法取整：" + Math.ceil(5.2));
		//返回第一个小于等于参数的整数
		System.out.println("使用floor("+2.5+")方法取整：" + Math.floor(2.5));
		//返回与参数最接近的整数
		System.out.println("使用rint(" + 2.7 + ")方法取整：" + Math.rint(2.7));
		//返回与参数最接近的整数
		System.out.println("使用rint(" + 2.5 + ")方法取整：" + Math.rint(2.5));
		//将参数加上0.5后返回最接近的整数
		System.out.println("使用round("+3.4f+")方法取整：" + Math.round(3.4f));
		//将参数加上0.5后返回最接近的整数，并将结果强制转换为长整形
		System.out.println("使用round("+2.5+")方法取整：" + Math.round(2.5));

	}

}
