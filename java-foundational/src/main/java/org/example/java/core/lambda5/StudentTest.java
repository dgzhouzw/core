package org.example.java.core.lambda5;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author zzw dgzzw1@163.com
 * @version 2023/1/2 14:44
 * @since JDK17
 */
public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		Consumer<Integer> setAge = s::setAge;
		setAge.accept(20);
		System.out.println(s.getAge());
		Supplier<Integer> supplier = s::getAge;
		Integer integer = supplier.get();
		System.out.println(integer);

	}
}
