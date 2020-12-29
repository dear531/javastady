import java.math.BigDecimal;

public class BigDecimalDemo {
	static final int location = 10;
	
	/**
	 * 定义加方法，参数为家属与被加数
	 * @param value1 相加的第一个数
	 * @param value2 相加的第二个数
	 * @return 两个数之和
	 */

	public BigDecimal add(double value1, double value2) {
		//实例化decimal对象
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));

		return b1.add(b2);
	}
	
	/**
	 * 定义减方法，参数为减数和被减数
	 * @param value1 被减数
	 * @param value2 减数
	 * @return 差
	 */

	public BigDecimal sub(double value1, double value2) {
		//实例化decimal对象
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));

		return b1.subtract(b2);
	}
	
	/**
	 * 定义加方法，参数为两个乘数
	 * @param value1 第一个乘数
	 * @param value2 第二个乘数
	 * @return 积
	 */

	public BigDecimal mul(double value1, double value2) {
		//实例化decimal对象
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));

		return b1.multiply(b2);
	}

	
	
	/**
	 * 定义加方法，参数被除数和除数
	 * @param value1 第一个乘数
	 * @param value2 第二个乘数
	 * @return 积
	 */

	public BigDecimal div(double value1, double value2) {
		//调用自定义方法
		return div(value1, value2, location);
	}
	
	
	/**
	 * 定义加方法，参数被除数和除数
	 * @param value1 第一个乘数
	 * @param value2 第二个乘数
	 * @return 积
	 */

	public BigDecimal div(double value1, double value2, int b) {
		//实例化decimal对象
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2 = new BigDecimal(Double.toString(value2));

		return b1.divide(b2, b, BigDecimal.ROUND_HALF_UP);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimalDemo b = new BigDecimalDemo();
		System.out.println("-7.5,8.9两个数字相加结果：" + b.add(-7.5,8.9));
		System.out.println("-7.5,8.9两个数字相减结果：" + b.sub(-7.5,8.9));
		System.out.println("-7.5,8.9两个数字相乘结果：" + b.mul(-7.5,8.9));
		System.out.println("10,2两个数字相除结果：" + b.div(10,2));
		System.out.println("-7.5,8.9两个数字相除结果：" + b.div(-7.5,8.9));


	}

}
