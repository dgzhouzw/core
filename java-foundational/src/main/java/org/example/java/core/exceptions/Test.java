package org.example.java.core.exceptions;

import java.util.Scanner;

/**
 * 异常处理：捕获
 *
 * @author zzw dgzzw1@163.com
 * @version 2022/12/29 23:37
 * @since JDK17
 */
public class Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个数字");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[] m = new int[10];

		try {
			int z = x / y;
			// 数组下标越界
			m[10] = 100;
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界");
		} catch (Exception e) { // 必须在最后，因为前面两个异常都是Exception的子类
			System.out.println("出现错误");
		}
	}
}
