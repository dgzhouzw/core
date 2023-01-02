package org.example.java.core.lambda5;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 方法引用1
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 13:52
 * @since JDK17
 */
public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 32, 15, 6, 78, 25);
		//list.sort((o1, o2) -> Integer.compare(o1, o2));
		list.sort(Integer::compare);
		System.out.println(list);

		Consumer<String> consumer1 = new Consumer<String>() {
			@Override
			public void accept(String s) {
				X.test(s);
			}
		};
		consumer1.accept("java");
		Consumer<String> consumer = X::test;
		consumer.accept("javaEE");

		Supplier<Integer> supplier = new Supplier<Integer>() {
			@Override
			public Integer get() {
				X x = new X();
				return x.random();
			}
		};

		Supplier<Integer> supplier1 = () -> {
			X x = new X();
			return x.random();
		};
		// 将new x()提出来
		X x = new X();
		Supplier<Integer> supplier2 = () -> x.random();
		// 最后
		Supplier<Integer> supplier3 = x::random;
		System.out.println(supplier3.get());
		System.out.println("=============");

		List<Integer> list2 = Arrays.asList(12, 32, 15, 6, 78, 25);
		// 第一步:匿名内部类
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer integer) {
				System.out.println(integer);
			}
		});
		System.out.println("===============");
		// 第二步:Lambda
		list.forEach((integer) -> System.out.println(integer));
		// 第三步:方法引用
		list.forEach(System.out::println);




	}
}

class X {
	public static void test(String x) {
		System.out.println(x);
	}

	public int random() {
		return new Random().nextInt(10);
	}
}
