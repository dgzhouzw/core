package org.example.java.core.lambda4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * Supplier测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 12:49
 * @since JDK17
 */
public class SupplierTest {
	public static void main(String[] args) {
		//案例：要实现获取验证码，返回一个ArrayList类型容器，容器中生成多个验证码


		//客户1：我要生成4位验证码(纯数字)
		Supplier<String> s1 = () -> {
			Random random = new Random();
			String code = "";
			for (int i = 0; i < 4; i++) {
				int x = random.nextInt(10);
				code += x;
			}
			return code;
		};
		List<String> codeList = getCode(10, s1);
		System.out.println(codeList);

		//客户2：要生成5位验证码(纯字母)
		Supplier<String> s2 = () -> {
			String z = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String code = "";
			for (int i = 0; i < 5; i++) {
				int index = (int) (Math.random() * z.length());
				code += z.charAt(index);
			}
			return code;
		};
		List<String> codeList2 = getCode(10, s2);
		System.out.println(codeList2);
	}

	/**
	 *
	 * @param x 需要生成验证码的个数
	 * @param supplier
	 * @return
	 */
	private static List<String> getCode(int x, Supplier<String> supplier) {
		List<String> list = new ArrayList<>(x);
		for (int i = 0; i < x; i++) {
			list.add(supplier.get());
		}
		return list;
	}
}
