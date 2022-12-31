package org.example.java.core.exceptions;

/**
 * throws关键字
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 08:39
 * @since JDK17
 */
public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		test();
	}

	private static void test() throws InterruptedException {
		String[] str = {"请", "看", "下", "集"};
		for (String s : str) {
			System.out.println(s);
			Thread.sleep(1000);
		}
	}
}
