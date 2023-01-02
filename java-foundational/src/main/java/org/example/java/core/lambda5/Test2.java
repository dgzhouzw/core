package org.example.java.core.lambda5;

import java.lang.annotation.Target;
import java.util.Spliterator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造方法引用
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 15:04
 * @since JDK17
 */
public class Test2 {
	public static void main(String[] args) {
		// 获取对象
		Supplier<Teacher> supplier = new Supplier<Teacher>() {
			@Override
			public Teacher get() {
				return new Teacher();
			}
		};
		System.out.println(supplier.get().toString());

		// lambda
		Supplier<Teacher> supplier1 = () -> new Teacher( );
		System.out.println(supplier1.get().toString());
		// 构造方法引用(无参)
		Supplier<Teacher> supplier2 = Teacher::new;
		System.out.println(supplier2.get().toString());
		System.out.println("==========");

		// 构造方法引用有一个参
		Function<String, Teacher> function = new Function<String, Teacher>() {
			@Override
			public Teacher apply(String s) {
				return new Teacher(s);
			}
		};
		// lambda
		Function<String, Teacher> function1 = (s) -> new Teacher(s);
		// 构造方法引用有一个参
		Function<String, Teacher> function2 = Teacher::new;
		System.out.println(function2.apply("李白"));

		// 有两个参数构造方法
		BiFunction<String, Integer, Teacher> bif = new BiFunction<String, Integer, Teacher>() {
			@Override
			public Teacher apply(String s, Integer integer) {
				return new Teacher("李白", 22);
			}
		};
		// lambda
		BiFunction<String, Integer, Teacher> bif2 = (s1, i1) -> new Teacher("李白", 23);
		// 引用
		BiFunction<String, Integer, Teacher> bif3 = Teacher::new;
		System.out.println(bif3.apply("李白", 28));
	}
}

class Teacher {
	private String name;
	private Integer age;

	public Teacher() {
		System.out.println("无参构造方法");
	}

	public Teacher(String name) {
		System.out.println("一个参数构造方法");
		this.name = name;
	}

	public Teacher(String name, Integer age) {
		System.out.println("两个参数构造方法");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
