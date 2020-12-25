import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {

	static public void SimgleFormat(String pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat(pattern); /* 实例化对象时设置数字化格式模板 */
		String output = myFormat.format(value);
		System.out.println(value + " " + pattern + " " + output);
	}
	static public void UseApplyPatternMethodFormat(String pattern, double value) {
		DecimalFormat myFormat = new DecimalFormat();
		myFormat.applyPattern(pattern); /* 实例化后调用applyPattern方法设置数字化模板 */
		System.out.println(value + " " + " " + myFormat.format(value));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimgleFormat("###,###.###", 123456.789);
		SimgleFormat("00000000.###", 123456.789);
		SimgleFormat("00000000.000", 123.78);

		UseApplyPatternMethodFormat("#.###%", 0.789);
		UseApplyPatternMethodFormat("###.##", 123456.789);
		UseApplyPatternMethodFormat("0.00\u2030", 0.789);

	}

}
