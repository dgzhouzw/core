package org.example.java.core.lambda5;

import java.util.Arrays;
import java.util.function.Function;

/**
 * 数组引用
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 15:26
 * @since JDK17
 */
public class Test3 {
	public static void main(String[] args) {
		// 通过Function接口创建数组
		Function<Integer,Integer[]> function = new Function<Integer, Integer[]>() {
			@Override
			public Integer[] apply(Integer x) {
				return new Integer[x];
			}
		};
		// Lambda
		Function<Integer, Integer[]> function1 = (x) -> new Integer[x];
		// 数组引用
		Function<Integer, Integer[]> function2 = Integer[]::new;
		Integer[] apply = function2.apply(5);
		Arrays.fill(apply, 10);
		for (Integer integer : apply) {
			System.out.println(integer);
		}

	}
}
