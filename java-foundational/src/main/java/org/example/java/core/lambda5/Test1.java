package org.example.java.core.lambda5;

import java.util.Locale;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * 特殊方法引用
 * 当我们函数中有参数，第一个参数来调用方法，可以使用特殊方法引用
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 14:48
 * @since JDK17
 */
public class Test1 {
	public static void main(String[] args) {
		String s = "abc";
		// 匿名内部类
		Function<String, String> function = new Function<String, String>() {
			@Override
			public String apply(String s) {
				return s.toUpperCase(Locale.ROOT);
			}
		};
		String apply = function.apply(s);
		System.out.println(apply);
		// lambda
		Function<String, String> function1 = (s1) -> s1.toUpperCase(Locale.ROOT);
		String apply1 = function1.apply(s);
		System.out.println("apply1 = " + apply1);

		// 引用
		Function<String, String> function2 = String::toUpperCase;
		String apply2 = function2.apply(s);
		System.out.println("apply2 = " + apply2);
		System.out.println("--------------");


		BiPredicate<String, String> predicate = new BiPredicate<String, String>() {
			@Override
			public boolean test(String s, String s2) {
				return s.equals(s2);
			}
		};
		// lambda
		BiPredicate<String, String> predicate1 = (s1, s2) -> s1.equals(s2);
		// 引用
		BiPredicate<String, String> predicate2 = String::equals;
		boolean test = predicate2.test("abc", "aBc");
		System.out.println("test = " + test);


	}
}
