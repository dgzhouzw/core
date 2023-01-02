package org.example.java.core.lambda4;

import java.util.ResourceBundle;
import java.util.function.Function;

/**
 * 函数型接口测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 13:12
 * @since JDK17
 */
public class FunctionTest {
	public static void main(String[] args) {
		Function<Double, Double> function = (x) -> {
			return (int) (x * 100 + 0.5) / 100D;
		};
		System.out.println(keep(3.1445, function));

		Function<Double, Integer> function1 = (x) -> x.intValue();
		System.out.println(keepInt(3.1415, function1));
	}

	private static double keep(double d, Function<Double, Double> function) {
		return function.apply(d);
	}

	private static int keepInt(double d, Function<Double, Integer> function) {
		return function.apply(d);
	}
}
