package org.example.java.core.exceptions;

/**
 * finally语句
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/31 08:17
 * @since JDK17
 */
public class Test2 {

	public static void main(String[] args) {
		int m = test(10, 2);
		System.out.println(m);
	}

	public static int test(int x, int y) {
		try {
			int z = x / y;
			return z;
		} catch (ArithmeticException e) {
			return 0;
		} finally {
			System.out.println("关闭连接");
		}
	}
}
