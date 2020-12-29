import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化一个Random类
		Random r = new Random();
		//随机产生一个整数
		System.out.println("随机产生一个整数：" + r.nextInt());
		//随机产生一个大于等于0小于10的整数
		System.out.println("随机产生一个大于等于0小于10的整数：" + r.nextInt(10));
		//随机产生一个布尔型的值
		System.out.println("随机产生一个布尔型的值：" + r.nextBoolean());
		//随机产生一个双精度型的值
		System.out.println("随机产生一个双精度型的值：" + r.nextDouble());
		//随机产生一个浮点型的值
		System.out.println("随机产生一个浮点型的值：" + r.nextFloat());
		//随机产生一个概率密度为高斯分布的双精度值
		System.out.println("随机产生一个概率密度为高斯分布的双精度值：" + r.nextGaussian());
	}

}
