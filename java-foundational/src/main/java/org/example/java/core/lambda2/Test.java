package org.example.java.core.lambda2;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 11:24
 * @since JDK17
 */
public class Test {
	public static void main(String[] args) {
		// 匿名内部类
		MathInterface mathInterface = new MathInterface() {
			@Override
			public Integer expand10(Integer i) {
				return i * 10;
			}
		};
		System.out.println(mathInterface.expand10(20));

		// 使用Lambda表达式
		MathInterface lambda = i -> i * 10;
		System.out.println(lambda.expand10(20));
	}
}
