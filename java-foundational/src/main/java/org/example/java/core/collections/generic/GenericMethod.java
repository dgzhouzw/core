package org.example.java.core.collections.generic;

/**
 * 泛型方法
 *
 * @author zzw dgzzw1@163.com
 * @version 2023/1/1 10:02
 * @since JDK17
 */
public class GenericMethod {

	public <T> void method1(T t) {
		System.out.println(t.toString());
	}

	public <T> T methods(T t) {
		System.out.println(t.getClass().getName());
		return t;
	}
}

class Student {
	private String name;
	private String gender;

	public Student(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}

class Teacher {
	private String name;
	private int age;

	public Teacher(String name, int age) {
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
