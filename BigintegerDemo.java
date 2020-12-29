import java.math.BigInteger;

public class BigintegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化一个大数字
		BigInteger bigInstance = new BigInteger("4");
		//取该大数字加2的操作
		System.out.println("加法操作：" + bigInstance.add(new BigInteger("2")));
		//取该大数字减2的操作
		System.out.println("减法操作：" + bigInstance.subtract(new BigInteger("2")));
		//取该大叔字除以2的操作
		System.out.println("除法操作：" + bigInstance.divide(new BigInteger("2")));
		//取该大数字除以3的商
		System.out.println("取商：" + bigInstance.divideAndRemainder(new BigInteger("3"))[1]);
		//取该大数字的2次方
		System.out.println("做2次方操作：" + bigInstance.pow(2));
		//取该大数字的相反数
		System.out.println("取相反数操作：" + bigInstance.negate());
		
	}

}
